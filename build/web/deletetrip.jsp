<%-- 
    Document   : deletetrip
    Created on : Aug 7, 2023, 5:59:49 PM
    Author     : Navaneethan
--%>

<%@page import="java.sql.*" %> 

<%@page import="java.sql.*" %>
<%@page import="classes.DBConnecter" %>
<%@page import="classes.trip" %>
<%
    String id = request.getParameter("id");
    
    DBConnecter dbcon = new DBConnecter();
    Connection con = dbcon.getConnection();
    String query = "DELETE FROM trip WHERE trip_id=?";
    String query1 = "DELETE FROM itineryitem WHERE trip_id=?";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setString(1, id);
    PreparedStatement pstmt1 = con.prepareStatement(query1);
    pstmt1.setString(1, id);
    int a=pstmt.executeUpdate();
    int b=pstmt1.executeUpdate();
    if (a>0 && b>0) {
            response.sendRedirect("index.jsp?success=1");
        }
    
    
%>