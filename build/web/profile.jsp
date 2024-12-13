<%-- 
    Document   : profile
    Created on : Aug 9, 2023, 12:44:44 AM
    Author     : dilha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="classes.DBConnecter" %>
<%@page import="classes.trip" %>
<%
    String id =request.getParameter("id") ;
    DBConnecter dbcon = new DBConnecter();
    Connection con = dbcon.getConnection();
    String query = "SELECT  * FROM user WHERE user_id=?";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setString(1, id);
    ResultSet rs = pstmt.executeQuery();
    
    
%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>

  #background {
    text-align:center;
    border: 50px solid black;;
    padding: 15px;
    background: #dedbd7;
    background-clip: border-box;
    }
    .card {
      box-shadow: 0 4px 8px 0 #dedbd7;
      MAX-width: 300px;
      margin: auto;
      text-align: center;
      font-family: arial;
      color: rgb(11, 10, 10);
    }

   
    .card button {
      border: none;
      outline: 0;
      padding: 12px;
      color: white;
      background-color: #000;;
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
    img {
      display: block;
      margin-left: auto;
      margin-right: auto;
    }
    
    
    a {
  text-decoration: none;
  font-size: 22px;
  color: black;

}
    </style>
    
   
</head>
<body>

<h2 style="text-align:center">User Profile </h2>

<div class="card" >
    <%while(rs.next()){
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String contact = rs.getString("contact");
                
            %>
    <img src="assets/img/profile.png" alt="Carrie" style="width:100%">
  <h1><%out.println(fname+" "+lname);%></h1>
  <p class="title">First Name : <%out.println(fname);%></p>
  <p class="title">Last Name : <%out.println(lname);%></p>
  <p>Address : <%out.println(address);%></p>
  <p>Phone Number : <%out.println(contact);%></p>
  <p>Email : <%out.println(email);%></p> 
 
  <div style="margin: 24px 0;">
    <a href="#"><i class="fa fa-instagram"></i></a>  
    <a href="#"><i class="fa fa-whatsapp"></i></a>  
    <a href="#"><i class="fa fa-facebook"></i></a> 
  </div>
  <%}%>
</div>

</body>
</html>

