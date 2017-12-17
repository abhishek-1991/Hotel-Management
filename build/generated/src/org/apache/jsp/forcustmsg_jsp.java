package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class forcustmsg_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
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
      out.write("                ");
String name=""; 
                name=request.getParameter("name");
                //out.println("faga");
                int i=0;
                Connection con;
                Statement stmt;
                ResultSet rs;
                try
                {Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                //con.setAutoCommit(false);
                //out.println("faga");
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT NAME,ADDRESS,CITY,STATE,COUNTRY,PHONE_NO,ROOM_NO,ROOM_TYPE,CHECKIN_DATE,CHECKOUT_DATE FROM APP.FORMER_CUSTOMERS WHERE NAME='"+name+"'");
                
                rs.last();
                //out.println("aks");
                if(rs.getRow()==0)
                {out.println("<h2 align='center'>No Record Exists</h2>");}
                else
                {   rs.beforeFirst();
                    while(rs.next())
                {               
                   out.println("<table border=\"0\" align=\"center\" cellspacing=\"15\">");
            out.println("<thead>");
                out.println("<tr>");
                    out.println("<th>S.No.</th>");
                    out.println("<th>Name</th>");
                    out.println("<th>Address</th>");
                    out.println("<th>City</th>");
                    out.println("<th>State</th>");
                    out.println("<th>Country</th>");
                    out.println("<th>Phone Number</th>");
                    out.println("<th>Room Number</th>");
                    out.println("<th>Room Type</th>");
                    out.println("<th>Checkin Date</th>");
                    out.println("<th>Checkout Date</th>");
                out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");               
                    i++;
                out.println("<tr>");
                    out.println("<td>"+i+"</td>");
                    out.println("<td>"+rs.getString(1)+"</td>");
                    out.println("<td>"+rs.getString(2)+"</td>");
                    out.println("<td>"+rs.getString(3)+"</td>");
                    out.println("<td>"+rs.getString(4)+"</td>");
                    out.println("<td>"+rs.getString(5)+"</td>");
                    out.println("<td>"+rs.getString(6)+"</td>");
                    out.println("<td>"+rs.getString(7)+"</td>");
                    out.println("<td>"+rs.getString(8)+"</td>");
                    out.println("<td>"+rs.getString(9)+"</td>");
                    out.println("<td>"+rs.getString(10)+"</td>");
                out.println("</tr>");
                out.println("</tbody>");
        out.println("</table>");
                       }
                }
                }
                catch(Exception e){out.println("Error Occured");}
                
      out.write("\n");
      out.write("            \n");
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
