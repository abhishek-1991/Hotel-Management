package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("    <title>WELCOME TO XYZ HOTEL</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".aaaa {\n");
      out.write("\tcolor: #F00;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1 align=\"center\" class=\"aaaa\"><strong><u><em>HOTEL XYZ</em></u></strong></h1>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</h1>\n");
      out.write("                      <form id=\"form1\" name=\"form1\" method=\"post\" action=\"login.jsp\">\n");
      out.write("                        <p align=\"center\">\n");
      out.write("\n");
      out.write("                          <label>USER ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                            <input type=\"text\" name=\"USERID\" id=\"USER ID\" />\n");
      out.write("                          </label>\n");
      out.write("                        </p>\n");
      out.write("<p align=\"center\"><span id=\"sprypassword1\">\n");
      out.write("                          <label>PASSWORD*\n");
      out.write("                            <input type=\"password\" name=\"PASSWORD\" id=\"PASSWORD\" />\n");
      out.write("                          </label><br>\n");
      out.write("                          *Password is case sensitive\n");
      out.write("                        <span class=\"passwordRequiredMsg\"></span></span></p>\n");
      out.write("\n");
      out.write("                    </blockquote>\n");
      out.write("\n");
      out.write("                  </blockquote>\n");
      out.write("\n");
      out.write("                    <div align=\"center\">\n");
      out.write("                      <table width=\"200\">\n");
      out.write("                        <tr>\n");
      out.write("                          <td><label>\n");
      out.write("                            <input type=\"radio\" name=\"RadioGroup1\" value=\"USER\" id=\"RadioGroup1_0\"  checked=\"checked\" />\n");
      out.write("                          USER</label></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                          <td><label>\n");
      out.write("                            <input name=\"RadioGroup1\" type=\"radio\" id=\"RadioGroup1_1\" value=\"RECEPTION\" />\n");
      out.write("                            RECEPTION</label></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td><label>\n");
      out.write("                            <input name=\"RadioGroup1\" type=\"radio\" id=\"RadioGroup1_2\" value=\"RESTAURANT\"/>\n");
      out.write("                            RESTAURANT</label></td>\n");
      out.write("                        </tr>\n");
      out.write("                       \n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("  <p align=\"center\">\n");
      out.write("                      <label>\n");
      out.write("                        <input type=\"submit\" name=\"SUBMIT\" id=\"SUBMIT\" value=\"SUBMIT\" />\n");
      out.write("                      </label>\n");
      out.write("\n");
      out.write("                    \t  <label>\n");
      out.write("                    \t    <input type=\"submit\" name=\"RESET\" id=\"RESET\" value=\"RESET\" />\n");
      out.write("               \t      </label>\n");
      out.write("  </p>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("                    \n");
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
