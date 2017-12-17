package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>CHECKIN</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write(" function select()\n");
      out.write(" {var cate=document.getElementById(\"rtype\").value;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var http=new XMLHttpRequest();         \n");
      out.write("                http.onreadystatechange=function()\n");
      out.write("                 {if(http.readyState==4 && http.status==200)\n");
      out.write("                    {\n");
      out.write("                        var res=http.responseText;\n");
      out.write("                        document.getElementById(\"room\").innerHTML=res;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                http.open(\"GET\", \"option.jsp?rt=\"+cate+\"\", true);\n");
      out.write("                http.send();\n");
      out.write("               \n");
      out.write(" }\n");
      out.write(" function valid()\n");
      out.write(" {\n");
      out.write("      if(document.frm.name.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter Name!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("       if(document.frm.id_no.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter ID Number!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("       if(document.frm.address.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter Address!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("       if(document.frm.city.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter City!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("       if(document.frm.country.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter Country!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("        if(document.frm.phone_no.value==\"\")\n");
      out.write("                    {\n");
      out.write("                        alert(\"Please enter Phone Number!!!!\");\n");
      out.write("                        document.frm.pass.focus();\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                      return true;\n");
      out.write(" }document.form[0].submit();\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".aaaa {\n");
      out.write("\tcolor: #F00;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <h1 align=\"center\" class=\"aaaa\"><strong><em><u>HOTEL XYZ</u></em></strong> </h1>\n");
      out.write("<h2 align=\"center\">CUSTOMER CHECKIN PAGE</h2>\n");
      out.write("<div align=\"center\">\n");
      out.write("<form id=\"form1\" name=\"frm\" method=\"post\" action=\"\">\n");
      out.write("    <table>\n");
      out.write("      <tr>\n");
      out.write("          <td>NAME</td>\n");
      out.write("          <td><input type=\"text\" name=\"name\" id=\"NAME\" /></td>\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("          <td>ROOM TYPE</td>\n");
      out.write("          <td><select name=\"room_type\" id=\"rtype\" onchange=\"select()\">\n");
      out.write("                  <option value=\"0\">--SELECT--</option>\n");
      out.write("            <option value=\"SINGLEBED\">SINGLEBED ROOM</option>\n");
      out.write("            <option value=\"DOUBLEBED\">DOUBLEBED ROOM</option>\n");
      out.write("            <option value=\"SUITE\">SUITE</option>\n");
      out.write("         \n");
      out.write("        </select></td>\n");
      out.write("\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td>ROOM NO</td>\n");
      out.write("          <td><select name=\"room_no\" id=\"room\">\n");
      out.write("            <option></option>\n");
      out.write("           </select></td>\n");
      out.write("           \n");
      out.write("          \n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("      <tr><td>ID TYPE</td>\n");
      out.write("          <td> <select name=\"id_type\" id=\"jumpMenu3\">\n");
      out.write("          <option value=\"PASSPORT\">PASSPORT</option>\n");
      out.write("          <option value=\"DRIVING LICENSE\">DRIVING LICENSE</option>\n");
      out.write("          <option value=\"VOTER ID\">VOTER ID</option>\n");
      out.write("          <option value=\"AADHAAR CARD\">AADHAAR CARD</option>\n");
      out.write("          <option value=\"RATION CARD\">RATION CARD</option>\n");
      out.write("          <option value=\"PAN CARD\">PAN CARD</option>\n");
      out.write("        </select></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("      <td>ID NO</td>\n");
      out.write("          <td> <input type=\"text\" name=\"id_no\" id=\"ID NO\" /></td>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      </tr>\n");
      out.write("      <tr><td>ADDRESS</td>\n");
      out.write("          <td><input type=\"text\" name=\"address\" id=\"ID NO2\" /></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr><td>CITY</td>\n");
      out.write("          <td><input type=\"text\" name=\"city\" id=\"ID NO3\" /></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr><td>COUNTRY</td>\n");
      out.write("          <td><input type=\"text\" name=\"country\" id=\"ID NO3\" value=\"INDIAN\"/></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr><td>PHONE NO</td>\n");
      out.write("          <td><input type=\"text\" name=\"phone_no\" id=\"ID NO4\" /></td>\n");
      out.write("      </tr>\n");
      out.write("      <tr>\n");
      out.write("          <td><input type=\"submit\" value=\"SUBMIT\" name=\"SUBMIT\" /></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<td><input type=\"reset\" value=\"RESET\" name=\"RESET\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    </table><br>\n");
      out.write("    <center><a href=\"receptionwelcome.jsp\">click here to return to home page</a></center>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
