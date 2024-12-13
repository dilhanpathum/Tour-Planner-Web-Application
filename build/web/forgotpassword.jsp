<%-- 
    Document   : forgotpassword
    Created on : Aug 3, 2023, 11:57:04 PM
    Author     : Thilini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="classes.MD5" %>
<%@page import="classes.DBConnecter"%>
<%

    String email = request.getParameter("email");
    String newpassword = MD5.getMd5(request.getParameter("newpassword"));

    String query = "update registation set password=? where email =?";
    Connection con = DBConnecter.getConnection();
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setString(1, newpassword);
    pstmt.setString(2, email);
    int a = pstmt.executeUpdate();

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot password</title>
    </head>
    <body>
        <%
            if (a > 0) {
                response.sendRedirect("index.html?success=1");
            } else {
                response.sendRedirect("forgotpassword.jsp?error=1");
            }
        %>
        <h1><%out.println(a);%></h1>
         <h1><%out.println(newpassword);%></h1>
    </body>
</html>
