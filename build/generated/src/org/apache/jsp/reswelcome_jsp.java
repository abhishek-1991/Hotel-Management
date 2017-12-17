package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reswelcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Restaurant</title>\n");
      out.write("        <SCRIPT language=\"javascript\">\n");
      out.write("        function addRow(tableID) {\n");
      out.write(" \n");
      out.write("            var table = document.getElementById(tableID);\n");
      out.write(" \n");
      out.write("            var rowCount = table.rows.length;\n");
      out.write("            var row = table.insertRow(rowCount);\n");
      out.write("            var index = rowCount;\n");
      out.write("            index=index-1;\n");
      out.write(" \n");
      out.write("            var cell1 = row.insertCell(0);           \n");
      out.write("            cell1.innerHTML=\"<input type='text' name='des\"+index+\"' size='25'>\";\n");
      out.write(" \n");
      out.write("            var cell2 = row.insertCell(1);            \n");
      out.write("            cell2.innerHTML=\"<input type='text' name='qty\"+index+\"' size='25'>\";\n");
      out.write(" \n");
      out.write("            var cell3 = row.insertCell(2);\n");
      out.write("            cell3.innerHTML=\"<input type='text' name='rate\"+index+\"' size='25'>\";\n");
      out.write("            \n");
      out.write("                document.getElementById(\"size\").value=index;\n");
      out.write(" \n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            span.left{position:absolute;left:0;}\n");
      out.write("            span.right{position:absolute;right:0;}\n");
      out.write("            div.line{position:relative;text-align:center;width:100%}\n");
      out.write("            .aaaa {\n");
      out.write("\tcolor: #F00;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body link=\"black\" vlink=\"black\">\n");
      out.write("        ");
session=request.getSession(false);
      out.write("\n");
      out.write("        <div class=\"line\"><span class=\"left\">Welcome:&nbsp;");
      out.print(session.getAttribute("UserName"));
      out.write("</span><span class=\"right\"><a href=\"logout.jsp\">Logout</a></span></div><br>\n");
      out.write("        <h1 align=\"center\" class=\"aaaa\">XYZ HOTEL</h1>\n");
      out.write("        <form name=\"frm\" action=\"printcontent.jsp\">\n");
      out.write("        \n");
      out.write("            <table border=\"0\" cellspacing=\"15\" id=\"dataTable\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Description</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Rate</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"des0\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    <td><input type=\"text\" name=\"qty0\" value=\"\" size=\"25\" /></td>\n");
      out.write("                    <td><input type=\"text\" name=\"rate0\" value=\"\" size=\"25\" /></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("        <input type=\"hidden\" name=\"size\" id=\"size\">\n");
      out.write("        <input type=\"button\" value=\"Add Item\" name=\"additem\" onclick=\"addRow('dataTable')\"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <input type=\"submit\" value=\"Submit\" name=\"Submit\" />\n");
      out.write("        </form>\n");
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
