package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import classes.DBConnecter;
import classes.trip;

public final class admin_002dpanel_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    int num1;
    try {

        DBConnecter dbcon = new DBConnecter();
        Connection con = dbcon.getConnection();
        String query = "SELECT  * FROM user";
        PreparedStatement pstmt = con.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();

    

    String fname1 = null;
    String lname1 = null;
    String userId = null;

    Cookie[] cks = request.getCookies();
    if (cks != null) {
        for (Cookie ck : cks) {
            if (ck.getName().equals("fname")) {
                fname1 = ck.getValue();
            }
            if (ck.getName().equals("lname")) {
                lname1 = ck.getValue();
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
      out.write("        <style>\n");
      out.write("\n");
      out.write("            #background {\n");
      out.write("                text-align:center;\n");
      out.write("                border: 50px solid white;\n");
      out.write("                padding: 15px;\n");
      out.write("                background: #808080\t;\n");
      out.write("                background-clip: border-box;\n");
      out.write("            }\n");
      out.write("            .card {\n");
      out.write("                box-shadow: 0 4px 8px 0 black;\n");
      out.write("                MAX-width: 300px;\n");
      out.write("                margin: auto;\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: arial;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .footer {\n");
      out.write("                left: 0;\n");
      out.write("                bottom: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: black;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 1px;\n");
      out.write("                position:relative;\n");
      out.write("                position: fixed;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .card button {\n");
      out.write("                border: none;\n");
      out.write("                outline: 0;\n");
      out.write("                padding: 12px;\n");
      out.write("                color: white;\n");
      out.write("                background-color: black;;\n");
      out.write("                text-align: center;\n");
      out.write("                cursor: pointer;\n");
      out.write("                width: 100%;\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card button:hover {\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("            .grid-container {\n");
      out.write("                display: grid;\n");
      out.write("                grid-column-gap: 100px;\n");
      out.write("                grid-row-gap: 50px;\n");
      out.write("                padding: 50px;\n");
      out.write("            }\n");
      out.write("            .img1 {\n");
      out.write("                display: block;\n");
      out.write("                margin-left: auto;\n");
      out.write("                margin-right: auto;\n");
      out.write("                padding-top: 15px;\n");
      out.write("                height: auto;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Travel Planner | RAD</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!--footer file link css-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"footerstyle.css\">\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("    <script src=\"assets/js/delete.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:white;\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary w-100\">\n");
      out.write("                <div class=\"container mb-2\">\n");
      out.write("                    <a class=\"navbar-brand d-flex justify-content-between\" href=\"index.jsp\">\n");
      out.write("                        <img src=\"logo.png\" alt=\"Logo\" width=\"15%\">\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            ");
      out.print( fname1);
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
      out.write("                                <a class=\"nav-link\" href=\"#\">Feedback</a>\n");
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
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"background\">\n");
      out.write("        <h1 style=\"color:black;\">Admin Panel</h1>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\" container-fluid\">\n");
      out.write("\n");
      out.write("        <div class=\"row grid-container\">\n");
      out.write("            ");
while (rs.next()) {
                    String fname = rs.getString("fname");
                    String lname = rs.getString("lname");
                    int id = rs.getInt("user_id");
                    num1 = id;
            
      out.write("\n");
      out.write("            <div style=\"background-color: white;\" class=\"card col-3 \" id=\"card\">\n");
      out.write("                <img class=\"img1\" src=\"assets/img/profile.png\" alt=\"\" style=\"width:100%\" >\n");
      out.write("                <h4>");
out.println(fname + " " + lname);
      out.write("</h4>\n");
      out.write("                <p><a href=\"profile.jsp?id=");
out.println(id);
      out.write("\"><button>Veiw Profile</button> </a></p>\n");
      out.write("                <p><a href=\"deleteProfile.jsp?id=");
out.println(id);
      out.write("\"><button name=\"delete\" >Delete Profile</button></a></p>\n");
      out.write("            </div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        let params = new URLSearchParams(window.location.search);\n");
      out.write("        let alert = parseInt(params.get(\"success\"));\n");
      out.write("    if(alert==1){\n");
      out.write("    Swal.fire(\n");
      out.write("                'Successfully!',\n");
      out.write("                'User account was deleted!',\n");
      out.write("                'success'\n");
      out.write("                )}</script>\n");
      out.write("        \n");
      out.write("   \n");
      out.write("    ");


        } catch (Exception e) {
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <!--Footer section start-->\n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <p>&copy; All rights reserved by <b>Travel Planner</b></p>\n");
      out.write("    </div>\n");
      out.write("    <!--footer section end-->\n");
      out.write("    \n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("    <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/delete.js\"></script>\n");
      out.write("</body>\n");
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
