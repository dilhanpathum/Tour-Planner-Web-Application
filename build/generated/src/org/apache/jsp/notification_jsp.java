package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.time.temporal.ChronoUnit;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Date;
import java.sql.*;
import classes.DBConnecter;
import classes.trip;

public final class notification_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Notification</title>\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Font Awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                min-height: 100vh;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                background-color: bisque;\n");
      out.write("\n");
      out.write("            }.container{\n");
      out.write("                margin: 2rem;\n");
      out.write("                width: 700px;\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("                padding: 1.5rem 1rem;\n");
      out.write("                border-radius: .5rem;\n");
      out.write("            }\n");
      out.write("            header{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                margin-bottom: 2rem;\n");
      out.write("            }\n");
      out.write("            .Notif_Box{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            #notifications{\n");
      out.write("                background-color: lightskyblue;\n");
      out.write("                margin-left: .5rem;\n");
      out.write("                width: 35px;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                height: 30px;\n");
      out.write("                color: white;\n");
      out.write("                font-weight: 800;\n");
      out.write("                border-radius: .5rem;\n");
      out.write("            }\n");
      out.write("            #mark_all{\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #mark_all:hover{\n");
      out.write("                color: blue;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                color: darkslategrey;   \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            main{\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap:1rem;\n");
      out.write("            }\n");
      out.write("            .notif_card{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                border-radius: .5rem;\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("            img{\n");
      out.write("                width: 50px;\n");
      out.write("            }\n");
      out.write("            .description{\n");
      out.write("                margin-left: 1rem;\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("            strong{\n");
      out.write("                color: darkturquoise;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            strong:hover{\n");
      out.write("                color: blue;\n");
      out.write("            }\n");
      out.write("            .unread{\n");
      out.write("                background-color: lightsteelblue;\n");
      out.write("            }\n");
      out.write("            .unread p:first-of-type::after{\n");
      out.write("                content: \"\";\n");
      out.write("                width: 10px;\n");
      out.write("                height: 10px;\n");
      out.write("                display: inline-block;\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("            .message_card{\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }.message{\n");
      out.write("                padding: 1rem;\n");
      out.write("                border: 1px black;\n");
      out.write("                border-radius: .3rem;\n");
      out.write("                cursor: pointer;\n");
      out.write("                margin: 0 0 0 5rem;\n");
      out.write("                border-color: black;\n");
      out.write("            }.message:hover{\n");
      out.write("                background-color: lightslategrey;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            @media screen and (max-width: 550px){\n");
      out.write("                .container{\n");
      out.write("                    margin: 0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary w-100 position-fixed top-0\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <a class=\"navbar-brand d-flex justify-content-between\" href=\"index.jsp\">\n");
      out.write("                    <img src=\"logo.png\" alt=\"Logo\" width=\"15%\">\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            ");
      out.print( fname);
      out.write("\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"logout.jsp\">Sign Out</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                <a class=\"navbar-brand\" href=\"register.html\">Register</a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">About</a>\n");
      out.write("                        </li>     \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"Notif_Box\">\n");
      out.write("                    <h2 class=\"title\">Notifications</h2>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <p id=\"mark_all\">Mark all as read</p>\n");
      out.write("            </header>\n");
      out.write("            ");

                if(days<=1){
                String query1 = "SELECT * FROM notification WHERE notification_id=?";
                PreparedStatement pstmt1 = con.prepareStatement(query1);
                pstmt1.setString(1, "3");
                ResultSet rs1 = pstmt1.executeQuery();
                
                    while (rs1.next()) {                            
                            
                        
            
      out.write("\n");
      out.write("            <main>\n");
      out.write("                <div class=\"notif_card unread\">\n");
      out.write("                    <img src=\"1.jpg\">\n");
      out.write("                    <div class=\"description\">\n");
      out.write("                        <p class=\"user_activity\">\n");
      out.write("                            <strong>");
out.println(fname+" "+lname);
      out.write("</strong> \n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"time\">");
out.println(rs1.getString("message"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </main><br>\n");
      out.write("                    ");
    
                        }
                }
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                if(days<=3){
                String query1 = "SELECT * FROM notification WHERE notification_id=?";
                PreparedStatement pstmt1 = con.prepareStatement(query1);
                pstmt1.setString(1, "2");
                ResultSet rs1 = pstmt1.executeQuery();
                
                    while (rs1.next()) {                            
                            
                        
            
      out.write("\n");
      out.write("            <main>\n");
      out.write("                <div class=\"notif_card unread\">\n");
      out.write("                    <img src=\"1.jpg\">\n");
      out.write("                    <div class=\"description\">\n");
      out.write("                        <p class=\"user_activity\">\n");
      out.write("                            <strong>");
out.println(fname+" "+lname);
      out.write("</strong> \n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"time\">");
out.println(rs1.getString("message"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </main><br>\n");
      out.write("                    ");
    
                        }
                }
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                if(days<=7){
                String query1 = "SELECT * FROM notification WHERE notification_id=?";
                PreparedStatement pstmt1 = con.prepareStatement(query1);
                pstmt1.setString(1, "1");
                ResultSet rs1 = pstmt1.executeQuery();
                
                    while (rs1.next()) {                            
                            
                        
            
      out.write("\n");
      out.write("            <main>\n");
      out.write("                <div class=\"notif_card unread\">\n");
      out.write("                    <img src=\"1.jpg\">\n");
      out.write("                    <div class=\"description\">\n");
      out.write("                        <p class=\"user_activity\">\n");
      out.write("                            <strong>");
out.println(fname+" "+lname);
      out.write("</strong> \n");
      out.write("                        </p>\n");
      out.write("                        <p class=\"time\">");
out.println(rs1.getString("message"));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </main><br>\n");
      out.write("                    ");
    
                        }
                }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"bg-dark text-light text-center py-0 px-0 bottom-0 position-fixed w-100\">\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                 <p>&copy; 2023 Journey Genius. All rights reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"app.js\"></script>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
