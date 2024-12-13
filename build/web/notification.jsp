<%-- 
    Document   : notification
    Created on : Aug 5, 2023, 1:32:24 PM
    Author     : Thilini
--%>





<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.time.temporal.ChronoUnit"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.*"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.*" %>
<%@page import="classes.DBConnecter" %>
<%@page import="classes.trip" %>

<%
    String fname = null;
    String lname = null;
    String userId = null;
    String tripDate = null;
    LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String today = dateObj.format(formatter);
        
        LocalDate date1=LocalDate.parse(today,formatter);
        
   

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
        response.sendRedirect("index.html");
    }

   String query= "SELECT * FROM trip";
   Connection con = DBConnecter.getConnection();
   PreparedStatement pstmt = con.prepareStatement(query);
   ResultSet rs = pstmt.executeQuery();
   while(rs.next()){
       tripDate = rs.getString("travel_date");
   }
       LocalDate date2=LocalDate.parse(tripDate,formatter);
       long days = Math.abs(ChronoUnit.DAYS.between(date2, date1));
%> 

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Notification</title>
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">

        <!-- Font Awesome CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            body{
                min-height: 100vh;
                display: flex;
                justify-content: center;
                background-color: bisque;

            }.container{
                margin: 2rem;
                width: 700px;
                background-color: whitesmoke;
                padding: 1.5rem 1rem;
                border-radius: .5rem;
            }
            header{
                display: flex;
                align-items: center;
                justify-content: space-between;
                margin-bottom: 2rem;
            }
            .Notif_Box{
                display: flex;
                align-items: center;
            }
            #notifications{
                background-color: lightskyblue;
                margin-left: .5rem;
                width: 35px;
                display: flex;
                align-items: center;
                justify-content: center;
                height: 30px;
                color: white;
                font-weight: 800;
                border-radius: .5rem;
            }
            #mark_all{
                cursor: pointer;
            }
            #mark_all:hover{
                color: blue;

            }
            p{
                color: darkslategrey;   

            }
            main{
                display: flex;
                flex-direction: column;
                gap:1rem;
            }
            .notif_card{
                display: flex;
                align-items: center;
                border-radius: .5rem;
                padding: 1rem;
            }
            img{
                width: 50px;
            }
            .description{
                margin-left: 1rem;
                display: flex;
                flex-direction: column;
                justify-content: space-between;
            }
            strong{
                color: darkturquoise;
                cursor: pointer;
            }
            strong:hover{
                color: blue;
            }
            .unread{
                background-color: lightsteelblue;
            }
            .unread p:first-of-type::after{
                content: "";
                width: 10px;
                height: 10px;
                display: inline-block;
                border-radius: 50%;
            }
            .message_card{
                display: flex;
                align-items: center;
            }.message{
                padding: 1rem;
                border: 1px black;
                border-radius: .3rem;
                cursor: pointer;
                margin: 0 0 0 5rem;
                border-color: black;
            }.message:hover{
                background-color: lightslategrey;
            }


            @media screen and (max-width: 550px){
                .container{
                    margin: 0;
                }
            }

        </style>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary w-100 position-fixed top-0">
            <div class="container-fluid">
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
                <a class="navbar-brand" href="register.html">Register</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="about-us.html">About</a>
                        </li>     
                </div>
            </div>
        </nav>
        <div class="container">
            <header>
                <div class="Notif_Box">
                    <h2 class="title">Notifications</h2>
                    
                </div>
                <p id="mark_all">Mark all as read</p>
            </header>
            <%
                if(days<=1){
                String query1 = "SELECT * FROM notification WHERE notification_id=?";
                PreparedStatement pstmt1 = con.prepareStatement(query1);
                pstmt1.setString(1, "3");
                ResultSet rs1 = pstmt1.executeQuery();
                
                    while (rs1.next()) {                            
                            
                        
            %>
            <main>
                <div class="notif_card unread">
                    <img src="1.jpg">
                    <div class="description">
                        <p class="user_activity">
                            <strong><%out.println(fname+" "+lname);%></strong> 
                        </p>
                        <p class="time"><%out.println(rs1.getString("message"));%></p>
                    </div>
                </div>
                
            </main><br>
                    <%    
                        }
                }
            %>
            
            <%
                if(days<=3){
                String query1 = "SELECT * FROM notification WHERE notification_id=?";
                PreparedStatement pstmt1 = con.prepareStatement(query1);
                pstmt1.setString(1, "2");
                ResultSet rs1 = pstmt1.executeQuery();
                
                    while (rs1.next()) {                            
                            
                        
            %>
            <main>
                <div class="notif_card unread">
                    <img src="1.jpg">
                    <div class="description">
                        <p class="user_activity">
                            <strong><%out.println(fname+" "+lname);%></strong> 
                        </p>
                        <p class="time"><%out.println(rs1.getString("message"));%></p>
                    </div>
                </div>
                
            </main><br>
                    <%    
                        }
                }
            %>
            
            <%
                if(days<=7){
                String query1 = "SELECT * FROM notification WHERE notification_id=?";
                PreparedStatement pstmt1 = con.prepareStatement(query1);
                pstmt1.setString(1, "1");
                ResultSet rs1 = pstmt1.executeQuery();
                
                    while (rs1.next()) {                            
                            
                        
            %>
            <main>
                <div class="notif_card unread">
                    <img src="1.jpg">
                    <div class="description">
                        <p class="user_activity">
                            <strong><%out.println(fname+" "+lname);%></strong> 
                        </p>
                        <p class="time"><%out.println(rs1.getString("message"));%></p>
                    </div>
                </div>
                
            </main><br>
                    <%    
                        }
                }
            %>
        </div>
        <footer class="bg-dark text-light text-center py-0 px-0 bottom-0 position-fixed w-100">
            <div class="footer">
                 <p>&copy; 2023 Journey Genius. All rights reserved.</p>
            </div>
        </footer>
        <script src="app.js"></script>
        
    </body>
</html>
