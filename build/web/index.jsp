<%-- 
    Document   : index
    Created on : Aug 7, 2023, 5:53:46 PM
    Author     : Navaneethan
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 
<%@page import="classes.DBConnecter"%>
<%
    String fname = null;
    String lname = null;
    String userId = null;

    Cookie[] cks = request.getCookies();
    if (cks != null) {
        for (Cookie ck : cks) {
            if (ck.getName().equals("fname")) {
                fname = ck.getValue();
            }
            if (ck.getName().equals("lname")) {
                lname = ck.getValue();
            }
            if (ck.getName().equals("user_id")) {
                userId = ck.getValue();
            }
        }
    } else {
        response.sendRedirect("login.html");
    }


%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Trip Plan</title>
        <!-- Include Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,700">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        

    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css" />
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script src="https://kit.fontawesome.com/998ab80927.js" crossorigin="anonymous"></script>
       

        <style>

            body {
                font-family: "Open Sans", sans-serif;
            }
            h2 {
                color: #000;
                font-size: 26px;
                font-weight: 300;
                position: relative;
                margin: 0 0 50px 0;
                text-transform: uppercase;
                display: inline-block;
            }
            h2::after {
                content: "";
                width: 50%;
                position: absolute;
                height: 4px;
                border-radius: 1px;
                background: #ff5555;
                left: 0;
                bottom: -20px;
            }


            main {
                padding: 1rem;
            }

            section {
                margin-bottom: 2rem;
            }

            .card {
                border: 1px solid #ccc;
                width: 180vh;
                border-radius: 8px;
                background-color:#007bff3d;
            }

            .card-body {
                padding: 1rem;
            }

            .card-title {
                text-align: left;
                color: #333;
                font-weight: bold;
            }

            .card-text {
                text-align: left;
                color: #555;
            }
            .card-text1{
                text-align: left;
                color: #fff;
            }

            .d-flex.justify-content-start {
                justify-content: flex-start; /* Align buttons to the left side */
            }

            .btn {
                margin-right: 0.5rem;
            }



            .add-trip-button {
                margin-top: 1rem;
                float: right;
            }

            .carousel {
                margin: 50px auto;
            }
            .carousel .carousel-item {
                color: #999;
                overflow: hidden;
                min-height: 120px;
                font-size: 13px;
            }
            .carousel .media {
                position: relative;
                padding: 0 0 0 20px;
                margin-left: 20px;
            }
            .carousel .media img {
                width: 75px;
                height: 75px;
                display: block;
                border-radius: 50%;
                box-shadow: 0 2px 4px rgba(0,0,0,0.2);
                border: 2px solid #fff;
            }
            .carousel .testimonial {
                color: #fff;
                position: relative;    
                background: #9b9b9b;
                padding: 15px;
                margin: 0 0 20px 20px;
            }
            .carousel .testimonial::before, .carousel .testimonial::after {
                content: "";
                display: inline-block;
                position: absolute;
                left: 0;
                bottom: -20px;
            }
            .carousel .testimonial::before {
                width: 20px;
                height: 20px;
                background: #9b9b9b;
                box-shadow: inset 12px 0 13px rgba(0,0,0,0.5);
            }
            .carousel .testimonial::after {
                width: 0;
                height: 0;
                border: 10px solid transparent;
                border-bottom-color: #fff;
                border-left-color: #fff;
            }
            .carousel .carousel-item .row > div:first-child .testimonial {
                margin: 0 20px 20px 0;
            }
            .carousel .carousel-item .row > div:first-child .media {
                margin-left: 0;
            }
            .carousel .testimonial p {
                text-indent: 40px;
                line-height: 21px;
                margin: 0;
            }
            .carousel .testimonial p::before {
                content: "\201D";
                font-family: Arial,sans-serif;
                color: #fff;
                font-weight: bold;
                font-size: 68px;
                line-height: 70px;
                position: absolute;
                left: -25px;
                top: 0;
            }
            .carousel .overview {
                padding: 3px 0 0 15px;
            }
            .carousel .overview .details {
                padding: 5px 0 8px;
            }
            .carousel .overview b {
                text-transform: uppercase;
                color: #ff5555;
            }
            .carousel-control-prev, .carousel-control-next {
                width: 30px;
                height: 30px;
                background: #666;
                text-shadow: none;
                top: 4px;
            }
            .carousel-control-prev i, .carousel-control-next i {
                font-size: 16px;
            }
            .carousel-control-prev {
                left: auto;
                right: 40px;
            }
            .carousel-control-next {
                left: auto;
            }
            .carousel-indicators {
                bottom: -80px;
            }
            .carousel-indicators li, .carousel-indicators li.active {
                width: 17px;
                height: 17px;
                border-radius: 0;
                margin: 1px 5px;
                box-sizing: border-box;
            }
            .carousel-indicators li {	
                background: #e2e2e2;
                border: 4px solid #fff;
            }
            .carousel-indicators li.active {
                color: #fff;
                background: #ff5555;
                border: 5px double;    
            }
            .star-rating li {
                padding: 0 2px;
            }
            .star-rating i {
                font-size: 14px;
                color: #ffdc12;
            }
            .demo-content.bg-alt{
                background: #dfe7f0;
            }

            .demo-content{
                padding: 15px;
                font-size: 18px;
                background:   #dfe7f0;
                margin-bottom: 10px;
            }
            .add-trip-button {
                margin-top: 1rem;
                float: right;
                background-color: #3498db; /* Add your desired background color here */
                color: #fff; /* Set the text color to white for better contrast */
            }
            .a{
                color: #fff;
                text-decoration: none;
                background-color: transparent;
            }
        </style>
    </head>
    <body>
        <header>
            
            

            <nav class="navbar navbar-expand-lg navbar-dark bg-primary w-100">
                <div class="container mb-2">
                    <a class="navbar-brand d-flex justify-content-between" href="index.jsp">
                        <img src="logo.png" alt="Logo" width="15%">
                    </a>
                    <div class="dropdown">
                        <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                             <%= fname%>
                        </button>
                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <a class="dropdown-item" href="logout.jsp">Sign Out</a>
                        </div>
                    </div>

                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                            <li class="nav-item">
                                <a class="nav-link" href="#">About</a>
                            </li> 
                            <li class="nav-item">
                                <a class="nav-link" href="feedback.html">Feedback</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="notification.jsp"><i class="fa fa-solid fa-bell" style="color: black;"></i></a>
                            </li>


                        </ul>
                    </div>
                </div>
            </nav>
        </header>


        <div class="demo-content position-reltive mt-4" style="margin-top: 50px">


            <main class="container">
                <section>
                    <h2>Your Plans</h2>

                </section>



                <section style="width:100vh">

                    <%if (userId.length() > 0) {

                            Connection con;
                            PreparedStatement pstmt;
                            ResultSet rs;
                            String id = null;

                            con = DBConnecter.getConnection();

                            String query = "select * from trip WHERE user_id='" + userId + "'";
                            pstmt = con.prepareStatement(query);

                            rs = pstmt.executeQuery(query);

                            while (rs.next()) {
                                id = rs.getString("trip_id");
                    %>
                    <div class="card" >
                        <div class="card-body">
                            <h3 class="card-title"><%=rs.getString("plan_name")%></h3>
                            <p><%=rs.getString("status")%></p>
                            <h5 class="card-title">Rs.<%=rs.getString("budget")%></h5>


                            <div class="d-flex justify-content-start">

                                <button class="btn btn-danger"><a class="card-text1" href="deletetrip.jsp?id=<%=id%>">Delete</a></button>

                            </div>



                        </div>
                    </div>  
                    <br>


                    <%

                            }
                        }
                    %>

                    <main class="container">

                        <button class="btn btn-success"><a href="planing.jsp" style="text-decoration:none;color:white;"> + Add New Trip </a></button>
                    </main>


                </section>


            </main>

        </div><div class="demo-content bg-alt">
                            <div class="mt-3">
                                <div class="container-lg">
                                    <div class="row">
                                        <div class="col-sm-12">
                                            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                                                <h2>Feedbacks <b>& Ratings</b></h2>
                                                <!-- Carousel indicators -->
 <%

                            Connection con;
                            PreparedStatement pstmt;
                            ResultSet rs;
                            String id = null;
                               
                            con = DBConnecter.getConnection();

                            String query = "SELECT rating, comments,fname,lname FROM feedback INNER JOIN user ON feedback.user_id = user.user_id";
                            pstmt = con.prepareStatement(query);

                            rs = pstmt.executeQuery(query);

                            while (rs.next()) {
                                
                                
                            
                                  
                              

                    %>
                                                <!-- Wrapper for carousel items -->
                                                <div class="carousel-inner">
                                                    <div class="carousel-item active">
                                                        <div class="row">
                                                            <div class="col-sm-6">
                                                                <div class="testimonial">
                                                                    <p>"<%=rs.getString("comments")%></p>
                                                                </div>
                                                                <div class="media">
                                                                    <img src="assets/img/profile.png" class="mr-3" alt="">
                                                                    <div class="media-body">
                                                                        <div class="overview">
                                                                            <div class="name"><b><%=rs.getString("fname")+" "+rs.getString("lname")%></b></div>
                                                                            

                                                                            <br>
                                                                            <div class="star-rating">
                                                                                <ul class="list-inline">
                                                                                    <% for (int i = 0; i < Integer.parseInt(rs.getString("rating")); i++) {
                                                                                         %>                                                                                   
                                                                                    <li class="list-inline-item"><i
                                                                                            class="fa fa-star"></i></li>
                                                                                    <%}%>
                                                                                </ul>
                                                                            </div>
                                                                            
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div><br>
                                                <%

                            }
                        
                    %>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>


        <footer class=" text-light text-center bottom-0 py-0 px-0 bottom-0 position-fixed w-100" style="height:45px;background-color: black;bottom: 0">
            <div class="container">
                <p>&copy; 2023 Journey Genius. All rights reserved.</p>
            </div>
        </footer> 

        <!-- Include Bootstrap JS (optional for some features) -->
        <script>
            let params = new URLSearchParams(window.location.search);
            let alert = parseInt(params.get("success"));
            if (alert == 1) {
                Swal.fire(
                        'Successfully!',
                        'User account was deleted!',
                        'success'
                        )
        }</script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
    </body>
</html>

