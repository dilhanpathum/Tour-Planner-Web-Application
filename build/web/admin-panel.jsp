<%-- 
    Document   : admin-panel
    Created on : Aug 8, 2023, 9:11:36 PM
    Author     : dilha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="classes.DBConnecter" %>
<%@page import="classes.trip" %>
<%
    int num1;
    try {

        DBConnecter dbcon = new DBConnecter();
        Connection con = dbcon.getConnection();
        String query = "SELECT  * FROM user";
        PreparedStatement pstmt = con.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

    

    String fname1 = null;
    String lname1 = null;
    String userId = null;

    Cookie[] cks = request.getCookies();
    if (cks != null) {
        for (Cookie ck : cks) {
            if (ck.getName().equals("admin_name")) {
                fname1 = ck.getValue();
            }
            if (ck.getName().equals("lname")) {
                lname1 = ck.getValue();
            }
            if (ck.getName().equals("user_id")) {
                userId = ck.getValue();
            }
        }
    } else {
        response.sendRedirect("index.html");
    }


%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <style>

            #background {
                text-align:center;
                border: 50px solid white;
                padding: 15px;
                background: #808080	;
                background-clip: border-box;
            }
            .card {
                box-shadow: 0 4px 8px 0 black;
                MAX-width: 300px;
                margin: auto;
                text-align: center;
                font-family: arial;
                color: black;
            }
            .footer {
                left: 0;
                bottom: 0;
                width: 100%;
                background-color: black;
                color: white;
                text-align: center;
                padding: 1px;
                position:relative;
                position: fixed;
            }



            .card button {
                border: none;
                outline: 0;
                padding: 12px;
                color: white;
                background-color: black;;
                text-align: center;
                cursor: pointer;
                width: 100%;
                font-size: 18px;
            }

            .card button:hover {
                opacity: 0.7;
            }
            .grid-container {
                display: grid;
                grid-column-gap: 100px;
                grid-row-gap: 50px;
                padding: 50px;
            }
            .img1 {
                display: block;
                margin-left: auto;
                margin-right: auto;
                padding-top: 15px;
                height: auto;

            }

        </style>

    </script>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Travel Planner | RAD</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>



    <!--footer file link css-->
    <link rel="stylesheet" href="footerstyle.css">
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="assets/js/delete.js"></script>
</head>
<body style="background-color:white;">
    

            <nav class="navbar navbar-expand-lg navbar-dark bg-primary w-100">
                <div class="container mb-2">
                    <a class="navbar-brand d-flex justify-content-between" href="index.jsp">
                        <img src="logo.png" alt="Logo" width="15%">
                    </a>
                    <div class="dropdown">
                        <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <%= fname1%>
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
                                <a class="nav-link" href="#">Feedback</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="notification.jsp"><i class="fa fa-solid fa-bell" style="color: black;"></i></a>
                            </li>


                        </ul>
                    </div>
                </div>
            </nav>
       



    <div id="background">
        <h1 style="color:black;">Admin Panel</h1>
    </div>


    <div class=" container-fluid">

        <div class="row grid-container">
            <%while (rs.next()) {
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    String id = rs.getString("user_id");
                    
            %>
            <div style="background-color: white;" class="card col-3 " id="card">
                <img class="img1" src="assets/img/profile.png" alt="" style="width:100%" >
                <h4><%out.println(fname + " " + lname);%></h4>
                <p><a href="profile.jsp?id=<%out.println(id);%>"><button>Veiw Profile</button> </a></p>
                <p><a href="deleteProfile.jsp?id=<%out.println(id);%>"><button name="delete" >Delete Profile</button></a></p>
            </div>
            <%}%>
        </div>
    </div>

    
    <script>
        let params = new URLSearchParams(window.location.search);
        let alert = parseInt(params.get("success"));
    if(alert==1){
    Swal.fire(
                'Successfully!',
                'User account was deleted!',
                'success'
                )}</script>
        
   
    <%

        } catch (Exception e) {
        }
    %>
    
    <!--Footer section start-->
    <div class="footer">
        <p>&copy; All rights reserved by <b>Travel Planner</b></p>
    </div>
    <!--footer section end-->
    
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
    <script src="assets/js/delete.js"></script>
</body>
</html>

