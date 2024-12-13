<%-- 
    Document   : deleteProfile
    Created on : Aug 9, 2023, 12:57:25 AM
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
    String query = "DELETE FROM user WHERE user_id=?";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setString(1, id);
    int a=pstmt.executeUpdate();
    if (a>0) {
            response.sendRedirect("admin-panel.jsp?success=1");
        }
    
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
