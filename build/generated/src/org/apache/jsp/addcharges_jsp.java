package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addcharges_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Additional Charges</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".aaaa {\n");
      out.write("\tcolor: #F00;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1 align=\"center\" class=\"aaaa\"><strong><em><u>HOTEL XYZ</u></em></strong> </h1>\n");
      out.write("         Enter Information:\n");
      out.write("         <form name=\"frm\" action=\"chargesavevalid.jsp\" method=\"POST\">\n");
      out.write("         \n");
      out.write("         <table border=\"0\" align=\"center\">\n");
      out.write("             <tbody>\n");
      out.write("                 <tr>\n");
      out.write("                     <td>Room Number</td>\n");
      out.write("                     <td>:&nbsp;<input type=\"text\" name=\"room_no\" value=\"\" size=\"25\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td>Description</td>\n");
      out.write("                     <td>:&nbsp;<input type=\"text\" name=\"des\" value=\"\" size=\"25\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td>Charges</td>\n");
      out.write("                     <td>:&nbsp;<input type=\"text\" name=\"charges\" value=\"\" size=\"25\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td><input type=\"submit\" value=\"Submit\" name=\"Submit\" /></td>\n");
      out.write("                     <td><input type=\"reset\" value=\"Reset\" name=\"Reset\" /></td>\n");
      out.write("                 </tr>\n");
      out.write("             </tbody>\n");
      out.write("         </table></form><br>\n");
      out.write("         <a href=\"receptionwelcome.jsp\">Click Here to return to homepage</a>\n");
      out.write("\n");
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
