package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class userwelcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String a[];
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
      out.write("        <title>Welcome Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            span.left{position:absolute;left:0;}\n");
      out.write("            span.right{position:absolute;right:0;}\n");
      out.write("            div.line{position:relative;text-align:center;width:100%}\n");
      out.write("            .aaaa {\n");
      out.write("\tcolor: #F00;\n");
      out.write("}\n");
      out.write("        </style>  \n");
      out.write("    </head>\n");
      out.write("    <body link=\"black\" vlink=\"black\">\n");
      out.write("        ");
session=request.getSession(false);
      out.write("\n");
      out.write("         <div class=\"line\"><span class=\"left\">Welcome:&nbsp;");
      out.print(session.getAttribute("UserName"));
      out.write("</span><span class=\"right\"><a href=\"logout.jsp\">Logout</a></span></div><br>\n");
      out.write("         <h1 align=\"center\" class=\"aaaa\">XYZ HOTEL</h1>\n");
      out.write("         ");

                String name=session.getAttribute("UserName").toString();
                String roomno=request.getParameter("USERID");
         
      out.write("\n");
      out.write("         <table align=\"center\">\n");
      out.write("             <tr>\n");
      out.write("                 <td>Name</td>\n");
      out.write("                 <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td>Room Number</td>\n");
      out.write("                 <td>");
      out.print(roomno);
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("         </table>\n");
      out.write("    <center>Account Description:</center>\n");
      out.write("    <table align=\"center\" cellpadding=\"5\">\n");
      out.write("        <thead>\n");
      out.write("        <th>Date</th>\n");
      out.write("        <th>Description</th>\n");
      out.write("        <th>Charges</th>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("    ");
      float tot=0;
            Connection con;
            Statement stmt;
            ResultSet rs;
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("     ");
       
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT DESCRIPTION,CHARGES,DATE FROM APP.ACCOUNT WHERE ROOM_NO='"+roomno+"'");
                while(rs.next())
                {
                    out.println("<tr>");
                    out.println("<td>"+rs.getString(3)+"</td>");
                    out.println("<td>"+rs.getString(1)+"</td>");
                    out.println("<td>"+rs.getString(2)+"</td>");
                    out.println("</tr>");
                    tot+=Float.parseFloat(rs.getString(2));
                    
                }
            }
            catch(Exception e){}
      
      out.write("\n");
      out.write("      ");
    
            
      
      out.write("\n");
      out.write("      <tr>\n");
      out.write("          <td></td>\n");
      out.write("          <td><strong>Total</strong></td>\n");
      out.write("          <td><strong>");
      out.print(tot);
      out.write("</strong></td>\n");
      out.write("      </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
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
