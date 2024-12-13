<%-- 
    Document   : planning-process
    Created on : Aug 3, 2023, 10:52:01 AM
    Author     : dilha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="classes.DBConnecter" %>
<%@page import="classes.trip" %>
<%
    String fname = null;
    String lname = null;
    String userId = null;

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
        response.sendRedirect("login.html");
    }
    trip trip = new trip();
    
    String itrm_id = "im"+((trip.getItemID()>9)?"00":"000")+String.valueOf(trip.getItemID());
    String trip_id = "tp"+((trip.getTripID()>9)?"00":"000")+String.valueOf(trip.getTripID());
    String planName = request.getParameter("plan_name");
    String planDate = request.getParameter("plan_date");
    String location = request.getParameter("location");
    String [] item = request.getParameterValues("items");
    String accomadation = request.getParameter("accomadation");
    String price = request.getParameter("price").substring(request.getParameter("price").length()-4);
    String time = request.getParameter("time");    
    String note = request.getParameter("note");
    int cost = 0;
    
    for (String items : item) {
            cost = Integer.parseInt(items)+cost;
        }

    int budget = cost + Integer.parseInt(price);
   
    trip saveTrips = new trip(itrm_id,userId, trip_id, planName, planDate, location, accomadation, price, time, note, cost, budget);
    
   int a = saveTrips.saveTrip();
   if(a>0){
       
       saveTrips.savePlan();
       response.sendRedirect("index.jsp");
   }
    
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%out.println(itrm_id);%></h1>
        <h1><%out.println(trip_id);%></h1>
        <h1><%out.println(planName);%></h1>
        <h1><%out.println(planDate);%></h1>
        <h1><%out.println(location);%></h1
        <h1><%for (String items : item) {
               %><h1><% out.println(items);%></h1><%
            }
%></h1>
        <h1><%out.println(accomadation);%></h1>

        <h1><%out.println(price);%></h1>
        <h1><%out.println(time);%></h1>
        <h1><%out.println(note);%></h1>
        <h1><%out.println(budget);%></h1>
        <h1><%if(a>0){out.println(a);};%></h1>
        
    </body>
</html>
