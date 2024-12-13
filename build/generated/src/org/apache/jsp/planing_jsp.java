package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class planing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
  
    
    String fname = null;
    String userId = null;

    Cookie[] cks = request.getCookies();
    if (cks != null) {
        for (Cookie ck : cks) {
            if (ck.getName().equals("fname")) {
                fname = ck.getValue();
            }
            if (ck.getName().equals("user_id")) {
                userId = ck.getValue();
            }
        }
    } else {
        response.sendRedirect("index.html");
    }
    
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html data-bs-theme=\"light\" lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("        <title>Planning Trip</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles-planing.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400,700\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/998ab80927.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background: url(assets/img/1979344-ai.jpg;) no-repeat;background-size: cover;\">\n");
      out.write("        <header>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-primary w-100\">\n");
      out.write("                <div class=\"container mb-2\">\n");
      out.write("                    <a class=\"navbar-brand d-flex justify-content-between\" href=\"index.jsp\">\n");
      out.write("                        <img src=\"logo.png\" alt=\"Logo\" width=\"15%\">\n");
      out.write("                    </a>\n");
      out.write("                    <div class=\"dropdown\">\n");
      out.write("                        <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                            ");
      out.print( fname);
      out.write("\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("                            <a class=\"dropdown-item\" href=\"logout.jsp\">Sign Out</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("               \n");
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
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-solid fa-bell\" style=\"color: black;\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div></div>\n");
      out.write("        <div class=\"container\"></div>\n");
      out.write("        <div class=\"container\"></div>\n");
      out.write("        <div class=\"col-12 d-flex mt-3\">\n");
      out.write("            <div class=\"container-fluid d-flex justify-content-center\">\n");
      out.write("                <form action=\"planning-process.jsp\" method=\"POST\" class=\"col-md-12 col-sm-12 col-lg-8\" style=\"background-color: #0f5a73\">\n");
      out.write("                    <div class=\"card shadow mb-3\">\n");
      out.write("                        <div class=\"card-header py-3\">\n");
      out.write("                            <p class=\"text-primary m-0 fw-bold\">Fill about your plan details from here...</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-12 col-md-12 col-lg-12 col-xl-12\">\n");
      out.write("                                    <div class=\"mb-3\"><label class=\"form-label\" for=\"service_name\"><strong>Plan\n");
      out.write("                                                Name</strong></label><input class=\"form-control\" type=\"text\"\n");
      out.write("                                                                    id=\"service_name\" placeholder=\"Name service\" name=\"plan_name\" required=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <div class=\"row mb-2\">\n");
      out.write("                                    <div class=\"col col-lg-8 col-sm-12 col-md-8 col-xl-6\">\n");
      out.write("                                        <div class=\"mb-3\"><label class=\"form-label\" for=\"client_description\"><strong>Plan\n");
      out.write("                                                    Date</strong></label><input class=\"form-control\"\n");
      out.write("                                                                        id=\"service_client_start_date\" type=\"date\" name=\"plan_date\"\n");
      out.write("                                                                        required=\"\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <div class=\"row mb-2\">\n");
      out.write("                                    <div class=\"col col-lg-8 col-sm-12 col-md-8 col-xl-6\">\n");
      out.write("                                        <div class=\"mb-3\"><label class=\"form-label\"\n");
      out.write("                                                                 for=\"client_description\"><strong>Location</strong></label><select\n");
      out.write("                                                                 class=\"form-select\" name=\"location\">\n");
      out.write("                                                <optgroup label=\"Select Location\">\n");
      out.write("                                                    <option value=\"Dunhida\" selected=\"\">Dunhida</option>\n");
      out.write("                                                    <option value=\"Ella Rock\">Ella Rock</option>\n");
      out.write("                                                    <option value=\"Little Adam's Peak\">Little Adam's Peak</option>\n");
      out.write("                                                    <option value=\"Ravana Ella\" selected=\"\">Ravana Ella</option>\n");
      out.write("                                                    <option value=\"Narangala\">Narangala</option>\n");
      out.write("                                                    <option value=\"Namunukula\">Namunukula</option>\n");
      out.write("                                                </optgroup>\n");
      out.write("                                            </select></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-3\"><label class=\"form-label\" for=\"service_client_payment_validated\"><strong>What\n");
      out.write("                                        You Need</strong></label>\n");
      out.write("                                <div class=\"form-group mb-3\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col col-md-3 col-sm-6 col-xs-6\">\n");
      out.write("                                            <div class=\"form-check\"><input class=\"form-check-input\" type=\"checkbox\"\n");
      out.write("                                                                           id=\"formCheck-1\" name=\"items\" value=\"6500\"><label class=\"form-check-label\"\n");
      out.write("                                                                           for=\"formCheck-1\">Camping Items</label></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col col-md-3 col-xs-6 col-sm-6\">\n");
      out.write("                                            <div class=\"form-check\"><input class=\"form-check-input\" type=\"checkbox\"\n");
      out.write("                                                                           id=\"formCheck-2\" name=\"items\" value=\"2500\"><label class=\"form-check-label\"\n");
      out.write("                                                                           for=\"formCheck-2\">Hiking Items</label></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col col-md-3 col-xs-6 col-sm-6\">\n");
      out.write("                                            <div class=\"form-check\"><input class=\"form-check-input\" type=\"checkbox\"\n");
      out.write("                                                                           id=\"formCheck-3\" name=\"items\" value=\"10000\"><label class=\"form-check-label\"\n");
      out.write("                                                                           for=\"formCheck-3\">Transport</label></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col col-md-3 col-xs-6 col-sm-6\">\n");
      out.write("                                            <div class=\"form-check\"><input class=\"form-check-input\" type=\"checkbox\"\n");
      out.write("                                                                           id=\"formCheck-6\" name=\"items\" value=\"6000\"><label class=\"form-check-label\"\n");
      out.write("                                                                           for=\"formCheck-6\">Cold Weather Clothes</label></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mb-2\">\n");
      out.write("                                <div class=\"col col-lg-8 col-sm-12 col-md-8 col-xl-6\">\n");
      out.write("                                    <div class=\"mb-3\"><label class=\"form-label\"\n");
      out.write("                                                             for=\"client_description\"><strong>Accommodations</strong></label><select\n");
      out.write("                                                             class=\"form-select\" id=\"accommodation\" onchange=\"selectAccomadation()\" name=\"accomadation\">\n");
      out.write("                                            <optgroup label=\"Select Accommodation\">\n");
      out.write("                                                <option value=\"Ella Family Resorts\" selected=\"\">Ella Family Resorts</option>\n");
      out.write("                                                <option value=\"MOUNT VIEW GUEST Diyaluma\">MOUNT VIEW GUEST Diyaluma</option>\n");
      out.write("                                                <option value=\"Boo Kirinda Holiday Resort\">Boo Kirinda Holiday Resort</option>\n");
      out.write("                                                <option value=\"Wellassa villa\">Wellassa villa</option>\n");
      out.write("                                                <option value=\"Ella Flower Garden Resort\">Ella Flower Garden Resort</option>\n");
      out.write("                                                <option value=\"Morning Dew Boutique Hotel Ella\">Morning Dew Boutique Hotel Ella</option>\n");
      out.write("                                                <option value=\"Zion View Ella Green Retreat\">Zion View Ella Green Retreat</option>\n");
      out.write("                                                <option value=\"Mountain Heavens\">Mountain Heavens</option>\n");
      out.write("                                                <option value=\"Hotel City Grand Ella\">Hotel City Grand Ella</option>\n");
      out.write("                                                <option value=\"Heart of Ella\">Heart of Ella</option>\n");
      out.write("                                            </optgroup>\n");
      out.write("                                        </select></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-12 col-md-4 col-lg-4\">\n");
      out.write("                                    <div class=\"mb-3\"><label class=\"form-label\" for=\"service_price\"><strong>Price\n");
      out.write("                                                *</strong><br></label><input class=\"form-control\" type=\"text\"\n");
      out.write("                                                                     id=\"price\" placeholder=\"\" name=\"price\" value=\"");
out.println("Rs.9000");
      out.write("\" readonly=\"\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                <div class=\"row mb-2\">\n");
      out.write("                                    <div class=\"col col-lg-8 col-sm-12 col-md-8 col-xl-6\">\n");
      out.write("                                        <div class=\"mb-3\"><label class=\"form-label\"\n");
      out.write("                                                                 for=\"client_description\"><strong>What time do you want to go</strong></label><select\n");
      out.write("                                                                 class=\"form-select\" name=\"time\">\n");
      out.write("                                                <optgroup label=\"Select Time\">\n");
      out.write("                                                    <option value=\"Morning\" selected=\"\">Morning</option>\n");
      out.write("                                                    <option value=\"Afternoon\">Afternoon</option>\n");
      out.write("                                                    <option value=\"Evening\">Evening</option>\n");
      out.write("                                                    <option value=\"Night\">Night</option>\n");
      out.write("                                                </optgroup>\n");
      out.write("                                            </select></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"row mb-2\">\n");
      out.write("                                <div class=\"col-sm-12 col-md-12 col-lg-12 col-xl-12\">\n");
      out.write("                                    <div class=\"mb-3\"><label class=\"form-label\"\n");
      out.write("                                                             for=\"service_name\"><strong>Note</strong></label><textarea\n");
      out.write("                                                             class=\"form-control\" name=\"note\"></textarea></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text-end mb-3\"><input class=\"btn btn-primary btn-lg\" type=\"submit\" value=\"Save Plan\" /></div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/price.js\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
