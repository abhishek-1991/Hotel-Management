package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class formercustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Former Customer</title>\n");
      out.write("<script type=\"text/javascript\" language=\"javascript\">\n");
      out.write(" function record()\n");
      out.write(" {              var name=document.getElementById(\"name\").value; \n");
      out.write("                var http=new XMLHttpRequest();         \n");
      out.write("                http.onreadystatechange=function()\n");
      out.write("                {if(http.readyState==4 && http.status==200)\n");
      out.write("                    {\n");
      out.write("                        var res=http.responseText;\n");
      out.write("                        document.getElementById(\"info\").innerHTML=res;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                http.open(\"GET\", \"forcustmsg.jsp?name=\"+name, true);\n");
      out.write("                http.send(null);\n");
      out.write("               \n");
      out.write(" }\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".aaaa {\n");
      out.write("\tcolor: #F00;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body link=\"black\" vlink=\"black\">\n");
      out.write("        <h1 align=\"center\" class=\"aaaa\"><strong><em><u>HOTEL XYZ</u></em></strong> </h1>\n");
      out.write("        <form name=\"frm\">\n");
      out.write("    <center><lable>Enter Name:</lable>\n");
      out.write("        <input type=\"text\" name=\"name\" value=\"\" size=\"25\" id=\"name\"/>\n");
      out.write("    </center><br>\n");
      out.write("    <center><input type=\"button\" value=\"Submit\" name=\"Submit\" onclick=\"record()\"/></center>\n");
      out.write("        </form>\n");
      out.write("    <br>\n");
      out.write("    <div id=\"info\">jhskjhdkahsd</div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <a href=\"javascript:window.print()\">Print</a><br>\n");
      out.write("    <a href=\"receptionwelcome.jsp\">Click Here to return to homepage</a>\n");
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
