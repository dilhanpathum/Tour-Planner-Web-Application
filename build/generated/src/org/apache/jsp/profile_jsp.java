package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("<style>\n");
      out.write("\n");
      out.write("  #background {\n");
      out.write("    text-align:center;\n");
      out.write("    border: 50px solid black;;\n");
      out.write("    padding: 15px;\n");
      out.write("    background: #dedbd7;\n");
      out.write("    background-clip: border-box;\n");
      out.write("    }\n");
      out.write("    .card {\n");
      out.write("      box-shadow: 0 4px 8px 0 #dedbd7;\n");
      out.write("      MAX-width: 300px;\n");
      out.write("      margin: auto;\n");
      out.write("      text-align: center;\n");
      out.write("      font-family: arial;\n");
      out.write("      color: rgb(11, 10, 10);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("   \n");
      out.write("    .card button {\n");
      out.write("      border: none;\n");
      out.write("      outline: 0;\n");
      out.write("      padding: 12px;\n");
      out.write("      color: white;\n");
      out.write("      background-color: #000;;\n");
      out.write("      text-align: center;\n");
      out.write("      cursor: pointer;\n");
      out.write("      width: 100%;\n");
      out.write("      font-size: 18px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .card button:hover {\n");
      out.write("      opacity: 0.7;\n");
      out.write("    }\n");
      out.write("    .grid-container {\n");
      out.write("      display: grid;\n");
      out.write("      grid-column-gap: 100px;\n");
      out.write("      grid-row-gap: 50px;\n");
      out.write("      padding: 50px;\n");
      out.write("    }\n");
      out.write("    img {\n");
      out.write("      display: block;\n");
      out.write("      margin-left: auto;\n");
      out.write("      margin-right: auto;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    a {\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 22px;\n");
      out.write("  color: black;\n");
      out.write("\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h2 style=\"text-align:center\">User Profile </h2>\n");
      out.write("\n");
      out.write("<div class=\"card\" >\n");
      out.write("    <img src=\"assets/img/profile.png\" alt=\"Carrie\" style=\"width:100%\">\n");
      out.write("  <h1>Carrie</h1>\n");
      out.write("  <p class=\"title\">Member since : July 18,2021</p>\n");
      out.write("  <p>Phone Number : 0770564535</p>\n");
      out.write("  <p>Email : john@gmail.com</p> \n");
      out.write("  <p>Booking completed : 1</p>\n");
      out.write("  <div style=\"margin: 24px 0;\">\n");
      out.write("    <a href=\"#\"><i class=\"fa fa-instagram\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-whatsapp\"></i></a>  \n");
      out.write("    <a href=\"#\"><i class=\"fa fa-facebook\"></i></a> \n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
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
