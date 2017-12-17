package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class option_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            \n");
      out.write("        ");
Connection con;
          Statement stmt;
          ResultSet rs;
          String cate=request.getParameter("cate"),r="";
          //cate="SINGLEBED";
          out.println("<select name=\"room\">");
          try
          {
              Class.forName("org.apache.derby.jdbc.ClientDriver");
              con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
              con.setAutoCommit(false);
              stmt=con.createStatement();
              rs=stmt.executeQuery("SELECT ROOM_NO FROM APP.USERS WHERE ROOM_TYPE='"+cate+"' AND ROOM_STATUS='UNOCCUPIED'");
              while(rs.next())
              {   r=rs.getString(1);
                  //out.println(r);
                  out.println("<option value=\""+r+"\">"+r+"</option>");
              }
             
             out.println("</select>");
          }
          catch(Exception e)
                                   {out.println(e);}
       
        
      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        </select>\n");
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
