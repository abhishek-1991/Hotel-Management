package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class checkinsave_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>save</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
try
                        {  ArrayList pass=new ArrayList();
                   pass.add("A");
                   pass.add("B");
                   pass.add("C");
                   pass.add("D");
                   pass.add("E");
                   pass.add("F");
                   pass.add("G");
                   pass.add("H");
                   pass.add("I");
                   pass.add("J");
                   pass.add("K");
                   pass.add("L");
                   pass.add("M");
                   pass.add("N");
                   pass.add("P");pass.add("Q");pass.add("R");pass.add("S");pass.add("T");pass.add("U");pass.add("V");pass.add("W");
                   pass.add("X");pass.add("Y");pass.add("Z");
                   pass.add("a");pass.add("b");pass.add("c");pass.add("d");pass.add("e");pass.add("f");pass.add("g");pass.add("h");pass.add("i");
                   pass.add("j");pass.add("k");pass.add("m");pass.add("n");pass.add("p");pass.add("q");pass.add("r");pass.add("s");
                   pass.add("t");pass.add("u");pass.add("v");pass.add("w");pass.add("x");pass.add("y");pass.add("z");
                   pass.add("1");pass.add("2");pass.add("3");pass.add("4");pass.add("5");pass.add("6");pass.add("7");pass.add("8");pass.add("9");
                   pass.add("1");pass.add("2");pass.add("3");pass.add("4");pass.add("5");pass.add("6");pass.add("7");pass.add("8");pass.add("9");
                   pass.add("1");pass.add("2");pass.add("3");pass.add("4");pass.add("5");pass.add("6");pass.add("7");pass.add("8");pass.add("9");
                   Random r1=new Random();
                   Random r2=new Random();
                   Random r3=new Random();
                   Random r4=new Random();
                   Random r5=new Random();
                   Random r6=new Random();
                   String Password=pass.remove(r1.nextInt(75)).toString()+pass.remove(r2.nextInt(74)).toString()+pass.remove(r3.nextInt(73)).toString()+pass.remove(r4.nextInt(72)).toString()+pass.remove(r5.nextInt(71)).toString()+pass.remove(r6.nextInt(70)).toString();
                   out.println(Password);}
        catch(Exception e){out.println(e);}
        
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
