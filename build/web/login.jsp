<%-- 
    Document   : login
    Created on : Aug 2, 2023, 7:32:07 PM
    Author     : Thilini
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="classes.MD5" %>
<%@page import="classes.DBConnecter"%>


<%
    String email = request.getParameter("email");
    String password = MD5.getMd5(request.getParameter("password"));
    String user_id = request.getParameter("user_id");

    String query = "SELECT * FROM admin WHERE admin_email = ?";
    String query1 = "SELECT * FROM user WHERE email = ?";
    try {
        Connection con = DBConnecter.getConnection();
        PreparedStatement pstmt = con.prepareStatement(query);
        pstmt.setString(1, email);
        ResultSet rs = pstmt.executeQuery();
        String adminpw = null;
        String admin_name = null;
        String admin_id = null;

        while (rs.next()) {
            adminpw = MD5.getMd5(rs.getString("adminpw"));
            admin_name = rs.getString("admin_name");
            admin_id = rs.getString("admin_id");

        }
        if (adminpw.equals(password)) {
            Cookie ck1 = new Cookie("admin_name", admin_name);
            Cookie ck2 = new Cookie("user_id", admin_id);
            response.addCookie(ck1);
            response.addCookie(ck2);
            response.sendRedirect("admin-panel.jsp");
        } else {
            response.sendRedirect("login.html");
        }

    } catch (Exception e) {
       
                Connection con = DBConnecter.getConnection();
                PreparedStatement pstmt1 = con.prepareStatement(query1);
                pstmt1.setString(1, email);
                ResultSet rs1 = pstmt1.executeQuery();
                String pw = null;
                String fname = null;
                String lname = null;
                String userId = null;

                while (rs1.next()) {
                    pw = rs1.getString("password");
                    fname = rs1.getString("fname");
                    lname = rs1.getString("lname");
                    userId = rs1.getString("user_id");

                }
                if (pw.equals(password)) {
                    Cookie ck1 = new Cookie("fname", fname);
                    Cookie ck2 = new Cookie("lname", lname);
                    Cookie ck3 = new Cookie("user_id", userId);
                    response.addCookie(ck1);
                    response.addCookie(ck2);
                    response.addCookie(ck3);
                    response.sendRedirect("index.jsp");
                } else {
                    response.sendRedirect("login.html");
                }

        
    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login</title>
    </head>
    <body>

    </body>
</html>