package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import classes.DBConnecter;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");

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



      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Trip Plan</title>\n");
      out.write("        <!-- Include Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\" />\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unicons.iconscout.com/release/v4.0.0/css/line.css\" />\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/998ab80927.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"assets/js/script.js\" defer></script>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                font-family: \"Open Sans\", sans-serif;\n");
      out.write("            }\n");
      out.write("            h2 {\n");
      out.write("                color: #000;\n");
      out.write("                font-size: 26px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                position: relative;\n");
      out.write("                margin: 0 0 50px 0;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                display: inline-block;\n");
      out.write("            }\n");
      out.write("            h2::after {\n");
      out.write("                content: \"\";\n");
      out.write("                width: 50%;\n");
      out.write("                position: absolute;\n");
      out.write("                height: 4px;\n");
      out.write("                border-radius: 1px;\n");
      out.write("                background: #ff5555;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: -20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            main {\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            section {\n");
      out.write("                margin-bottom: 2rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card {\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                width: 180vh;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                background-color:#007bff3d;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-body {\n");
      out.write("                padding: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-title {\n");
      out.write("                text-align: left;\n");
      out.write("                color: #333;\n");
      out.write("                font-weight: bold;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card-text {\n");
      out.write("                text-align: left;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("            .card-text1{\n");
      out.write("                text-align: left;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .d-flex.justify-content-start {\n");
      out.write("                justify-content: flex-start; /* Align buttons to the left side */\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn {\n");
      out.write("                margin-right: 0.5rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .add-trip-button {\n");
      out.write("                margin-top: 1rem;\n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .carousel {\n");
      out.write("                margin: 50px auto;\n");
      out.write("            }\n");
      out.write("            .carousel .carousel-item {\n");
      out.write("                color: #999;\n");
      out.write("                overflow: hidden;\n");
      out.write("                min-height: 120px;\n");
      out.write("                font-size: 13px;\n");
      out.write("            }\n");
      out.write("            .carousel .media {\n");
      out.write("                position: relative;\n");
      out.write("                padding: 0 0 0 20px;\n");
      out.write("                margin-left: 20px;\n");
      out.write("            }\n");
      out.write("            .carousel .media img {\n");
      out.write("                width: 75px;\n");
      out.write("                height: 75px;\n");
      out.write("                display: block;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                box-shadow: 0 2px 4px rgba(0,0,0,0.2);\n");
      out.write("                border: 2px solid #fff;\n");
      out.write("            }\n");
      out.write("            .carousel .testimonial {\n");
      out.write("                color: #fff;\n");
      out.write("                position: relative;    \n");
      out.write("                background: #9b9b9b;\n");
      out.write("                padding: 15px;\n");
      out.write("                margin: 0 0 20px 20px;\n");
      out.write("            }\n");
      out.write("            .carousel .testimonial::before, .carousel .testimonial::after {\n");
      out.write("                content: \"\";\n");
      out.write("                display: inline-block;\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                bottom: -20px;\n");
      out.write("            }\n");
      out.write("            .carousel .testimonial::before {\n");
      out.write("                width: 20px;\n");
      out.write("                height: 20px;\n");
      out.write("                background: #9b9b9b;\n");
      out.write("                box-shadow: inset 12px 0 13px rgba(0,0,0,0.5);\n");
      out.write("            }\n");
      out.write("            .carousel .testimonial::after {\n");
      out.write("                width: 0;\n");
      out.write("                height: 0;\n");
      out.write("                border: 10px solid transparent;\n");
      out.write("                border-bottom-color: #fff;\n");
      out.write("                border-left-color: #fff;\n");
      out.write("            }\n");
      out.write("            .carousel .carousel-item .row > div:first-child .testimonial {\n");
      out.write("                margin: 0 20px 20px 0;\n");
      out.write("            }\n");
      out.write("            .carousel .carousel-item .row > div:first-child .media {\n");
      out.write("                margin-left: 0;\n");
      out.write("            }\n");
      out.write("            .carousel .testimonial p {\n");
      out.write("                text-indent: 40px;\n");
      out.write("                line-height: 21px;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            .carousel .testimonial p::before {\n");
      out.write("                content: \"\\201D\";\n");
      out.write("                font-family: Arial,sans-serif;\n");
      out.write("                color: #fff;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 68px;\n");
      out.write("                line-height: 70px;\n");
      out.write("                position: absolute;\n");
      out.write("                left: -25px;\n");
      out.write("                top: 0;\n");
      out.write("            }\n");
      out.write("            .carousel .overview {\n");
      out.write("                padding: 3px 0 0 15px;\n");
      out.write("            }\n");
      out.write("            .carousel .overview .details {\n");
      out.write("                padding: 5px 0 8px;\n");
      out.write("            }\n");
      out.write("            .carousel .overview b {\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                color: #ff5555;\n");
      out.write("            }\n");
      out.write("            .carousel-control-prev, .carousel-control-next {\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                background: #666;\n");
      out.write("                text-shadow: none;\n");
      out.write("                top: 4px;\n");
      out.write("            }\n");
      out.write("            .carousel-control-prev i, .carousel-control-next i {\n");
      out.write("                font-size: 16px;\n");
      out.write("            }\n");
      out.write("            .carousel-control-prev {\n");
      out.write("                left: auto;\n");
      out.write("                right: 40px;\n");
      out.write("            }\n");
      out.write("            .carousel-control-next {\n");
      out.write("                left: auto;\n");
      out.write("            }\n");
      out.write("            .carousel-indicators {\n");
      out.write("                bottom: -80px;\n");
      out.write("            }\n");
      out.write("            .carousel-indicators li, .carousel-indicators li.active {\n");
      out.write("                width: 17px;\n");
      out.write("                height: 17px;\n");
      out.write("                border-radius: 0;\n");
      out.write("                margin: 1px 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .carousel-indicators li {\t\n");
      out.write("                background: #e2e2e2;\n");
      out.write("                border: 4px solid #fff;\n");
      out.write("            }\n");
      out.write("            .carousel-indicators li.active {\n");
      out.write("                color: #fff;\n");
      out.write("                background: #ff5555;\n");
      out.write("                border: 5px double;    \n");
      out.write("            }\n");
      out.write("            .star-rating li {\n");
      out.write("                padding: 0 2px;\n");
      out.write("            }\n");
      out.write("            .star-rating i {\n");
      out.write("                font-size: 14px;\n");
      out.write("                color: #ffdc12;\n");
      out.write("            }\n");
      out.write("            .demo-content.bg-alt{\n");
      out.write("                background: #dfe7f0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .demo-content{\n");
      out.write("                padding: 15px;\n");
      out.write("                font-size: 18px;\n");
      out.write("                background:   #dfe7f0;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .add-trip-button {\n");
      out.write("                margin-top: 1rem;\n");
      out.write("                float: right;\n");
      out.write("                background-color: #3498db; /* Add your desired background color here */\n");
      out.write("                color: #fff; /* Set the text color to white for better contrast */\n");
      out.write("            }\n");
      out.write("            .a{\n");
      out.write("                color: #fff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                background-color: transparent;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary w-100\">\n");
      out.write("                <div class=\"container mb-2\">\n");
      out.write("                    <a class=\"navbar-brand d-flex justify-content-between\" href=\"index.jsp\">\n");
      out.write("                        <img src=\"logo.png\" alt=\"Logo\" width=\"15%\">\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                             ");
      out.print( fname);
      out.write("\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"logout.jsp\">Sign Out</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\">About</a>\n");
      out.write("                            </li> \n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"feedback.html\">Feedback</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"notification.jsp\"><i class=\"fa fa-solid fa-bell\" style=\"color: black;\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"demo-content position-reltive mt-4\" style=\"margin-top: 50px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <main class=\"container\">\n");
      out.write("                <section>\n");
      out.write("                    <h2>Your Plans</h2>\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <section style=\"width:100vh\">\n");
      out.write("\n");
      out.write("                    ");
if (userId.length() > 0) {

                            Connection con;
                            PreparedStatement pstmt;
                            ResultSet rs;
                            String id = null;

                            con = DBConnecter.getConnection();

                            String query = "select * from trip WHERE user_id='" + userId + "'";
                            pstmt = con.prepareStatement(query);

                            rs = pstmt.executeQuery(query);

                            while (rs.next()) {
                                id = rs.getString("trip_id");
                    
      out.write("\n");
      out.write("                    <div class=\"card\" >\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h3 class=\"card-title\">");
      out.print(rs.getString("plan_name"));
      out.write("</h3>\n");
      out.write("                            <p>");
      out.print(rs.getString("status"));
      out.write("</p>\n");
      out.write("                            <h5 class=\"card-title\">Rs.");
      out.print(rs.getString("budget"));
      out.write("</h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"d-flex justify-content-start\">\n");
      out.write("\n");
      out.write("                                <button class=\"btn btn-danger\"><a class=\"card-text1\" href=\"deletetrip.jsp?id=");
      out.print(id);
      out.write("\">Delete</a></button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>  \n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");


                            }
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <main class=\"container\">\n");
      out.write("\n");
      out.write("                        <button class=\"btn btn-success\"><a href=\"planing.jsp\" style=\"text-decoration:none;color:white;\"> + Add New Trip </a></button>\n");
      out.write("                    </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </main>\n");
      out.write("\n");
      out.write("        </div><div class=\"demo-content bg-alt\">\n");
      out.write("                            <div class=\"mt-3\">\n");
      out.write("                                <div class=\"container-lg\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-sm-12\">\n");
      out.write("                                            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                                                <h2>Feedbacks <b>& Ratings</b></h2>\n");
      out.write("                                                <!-- Carousel indicators -->\n");
      out.write(" ");


                            Connection con;
                            PreparedStatement pstmt;
                            ResultSet rs;
                            String id = null;
                               
                            con = DBConnecter.getConnection();

                            String query = "SELECT rating, comments,fname,lname FROM feedback INNER JOIN user ON feedback.user_id = user.user_id";
                            pstmt = con.prepareStatement(query);

                            rs = pstmt.executeQuery(query);

                            while (rs.next()) {
                                
                                
                            
                                  
                              

                    
      out.write("\n");
      out.write("                                                <!-- Wrapper for carousel items -->\n");
      out.write("                                                <div class=\"carousel-inner\">\n");
      out.write("                                                    <div class=\"carousel-item active\">\n");
      out.write("                                                        <div class=\"row\">\n");
      out.write("                                                            <div class=\"col-sm-6\">\n");
      out.write("                                                                <div class=\"testimonial\">\n");
      out.write("                                                                    <p>\"");
      out.print(rs.getString("comments"));
      out.write("</p>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <div class=\"media\">\n");
      out.write("                                                                    <img src=\"assets/img/profile.png\" class=\"mr-3\" alt=\"\">\n");
      out.write("                                                                    <div class=\"media-body\">\n");
      out.write("                                                                        <div class=\"overview\">\n");
      out.write("                                                                            <div class=\"name\"><b>");
      out.print(rs.getString("fname")+" "+rs.getString("lname"));
      out.write("</b></div>\n");
      out.write("                                                                            \n");
      out.write("\n");
      out.write("                                                                            <br>\n");
      out.write("                                                                            <div class=\"star-rating\">\n");
      out.write("                                                                                <ul class=\"list-inline\">\n");
      out.write("                                                                                    ");
 for (int i = 0; i < Integer.parseInt(rs.getString("rating")); i++) {
                                                                                         
      out.write("                                                                                   \n");
      out.write("                                                                                    <li class=\"list-inline-item\"><i\n");
      out.write("                                                                                            class=\"fa fa-star\"></i></li>\n");
      out.write("                                                                                    ");
}
      out.write("\n");
      out.write("                                                                                </ul>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            \n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div><br>\n");
      out.write("                                                ");


                            }
                        
                    
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer class=\" text-light text-center bottom-0 py-0 px-0 bottom-0 position-fixed w-100\" style=\"height:45px;background-color: black;bottom: 0\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>&copy; 2023 Journey Genius. All rights reserved.</p>\n");
      out.write("            </div>\n");
      out.write("        </footer> \n");
      out.write("\n");
      out.write("        <!-- Include Bootstrap JS (optional for some features) -->\n");
      out.write("        <script>\n");
      out.write("            let params = new URLSearchParams(window.location.search);\n");
      out.write("            let alert = parseInt(params.get(\"success\"));\n");
      out.write("            if (alert == 1) {\n");
      out.write("                Swal.fire(\n");
      out.write("                        'Successfully!',\n");
      out.write("                        'User account was deleted!',\n");
      out.write("                        'success'\n");
      out.write("                        )\n");
      out.write("        }</script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
