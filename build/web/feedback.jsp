<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Connection"%>
<%@page import="classes.DBConnecter"%>

<%  String fname = null;
    String user_id = null;

    Cookie[] cks = request.getCookies();
    if (cks != null) {
        for (Cookie ck : cks) {
            if (ck.getName().equals("fname")) {
                fname = ck.getValue();
            }
            if (ck.getName().equals("user_id")) {
                user_id = ck.getValue();
            }
        }
    } else {
        response.sendRedirect("index.html");
    }

        Connection con = DBConnecter.getConnection();
        // Retrieve form data
        
        String rating = request.getParameter("rating");
        String comments = request.getParameter("comments");

        //SQL query to insert feedback data into the database
        String insertQuery = "INSERT INTO feedback (user_id,rating,comments) VALUES (?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(insertQuery);
        pstmt.setString(1, user_id);
        pstmt.setString(2, rating);
        pstmt.setString(3, comments);
        int a = pstmt.executeUpdate();

        if (a > 0) {
            response.sendRedirect("index.jsp");
            out.println("Feedback submitted successfully!");
        } else {
            response.sendRedirect("feedback.html");
            out.println("Failed to submit feedback.");
        }

    

%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback</title>
    </head>
    <body>
        
    </body>
</html>
