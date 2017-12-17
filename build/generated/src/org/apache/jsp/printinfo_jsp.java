package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class printinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Print</title>\n");
      out.write("    </head>\n");
      out.write("    <body link=\"black\" vlink=\"black\">\n");
      out.write("        ");

            String name="",roomno="",idtype="",idno="",address="",city="",country="",phoneno="",date="",stt="",pass="",rtype="",rent;
                   java.util.Date d=new java.util.Date();
                   java.text.SimpleDateFormat ft=new java.text.SimpleDateFormat("HH:mm dd/MM/yy");
                   date=ft.format(d).toString();
                   name=request.getParameter("name");
                   roomno=request.getParameter("room_no");
                   idtype=request.getParameter("id_type");
                   idno=request.getParameter("id_no");
                   address=request.getParameter("address");
                   city=request.getParameter("city");
                   country=request.getParameter("country");
                   phoneno=request.getParameter("phone_no");
                   stt=request.getParameter("state");
                   pass=request.getParameter("password");
                   rtype=request.getParameter("room_type");
                   rent=request.getParameter("rent");
        
      out.write("\n");
      out.write("        <table border=1 align=\"center\">\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Room Number/User ID</td>\n");
      out.write("                    <td>");
      out.print(roomno);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td>");
      out.print(pass);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            \n");
      out.write("            <tbody>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name</td>\n");
      out.write("                    <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Room Number</td>\n");
      out.write("                    <td>");
      out.print(roomno);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Room Type</td>\n");
      out.write("                    <td>");
      out.print(rtype);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ID Type</td>\n");
      out.write("                    <td>");
      out.print(idtype);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>ID Number</td>\n");
      out.write("                    <td>");
      out.print(idno);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td>");
      out.print(address);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>City</td>\n");
      out.write("                    <td>");
      out.print(city);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>State</td>\n");
      out.write("                    <td>");
      out.print(stt);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Country</td>\n");
      out.write("                    <td>");
      out.print(country);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Phone Number</td>\n");
      out.write("                    <td>");
      out.print(phoneno);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td>");
      out.print(pass);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Room Rent</td>\n");
      out.write("                    <td>");
      out.print(rent);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>signature</td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("            </tbody>\n");
      out.write("        </table><br>\n");
      out.write("    <center><a href=\"javascript:window.print()\">Print</a></center>\n");
      out.write("    <center><a href=\"receptionwelcome.jsp\">Click here to return to home page</a></center>\n");
      out.write("\n");
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
