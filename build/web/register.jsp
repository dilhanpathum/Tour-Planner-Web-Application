<%-- 
    Document   : register.jsp
    Created on : Aug 2, 2023, 8:30:58 AM
    Author     : Thilini
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="classes.MD5"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="classes.DBConnecter"%>
<%@page import="classes.trip" %>


<%
    Connection con = DBConnecter.getConnection();
    
    trip trip = new trip();
   String user_id= "u"+((trip.getUserID()>9)?"00":"000")+String.valueOf(trip.getUserID());
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String address = request.getParameter("address");
    String contact = request.getParameter("contact");
    String hashText = MD5.getMd5(password);
    
    String query = "INSERT INTO user (user_id,fname,lname,email,password,address,contact) VALUES (?,?,?,?,?,?,?)";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setString(1, user_id);
    pstmt.setString(2, fname);
    pstmt.setString(3, lname);
    pstmt.setString(4, email);
    pstmt.setString(5, hashText);
    pstmt.setString(6, address);
    pstmt.setString(7, contact);
    int a = pstmt.executeUpdate();
    
    if (a > 0) {
        response.sendRedirect("index.html");
    } else {
        out.println("Failed");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
    </head>
    <body>
        <h1><%out.println("Successfully Registered!");%></h1>
    </body>
</html>
