<%-- 
    Document   : logout
    Created on : Aug 8, 2023, 12:27:16 PM
    Author     : Thilini
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Cookie ck1 = new Cookie("fname", "");
    Cookie ck2 = new Cookie("lname", "");
        Cookie ck3 = new Cookie("user_id", "");
        
        ck1.setMaxAge(0);
        ck2.setMaxAge(0);
        ck3.setMaxAge(0);
        
        response.addCookie(ck1);
        response.addCookie(ck2);
        response.addCookie(ck3);
        response.sendRedirect("index.html");
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
