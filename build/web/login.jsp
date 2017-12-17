<%-- 
    Document   : login
    Created on : Apr 13, 2012, 3:39:35 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*;import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
" session="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
       <%
            String uid="",pass="",type="",name="";
            uid=request.getParameter("USERID");
            pass=request.getParameter("PASSWORD");
            type=request.getParameter("RadioGroup1");
            if(uid.equals("reception")||uid.equals("RECEPTION"))
                uid="RECEPTION";
            if(uid.equals("restaurant")||uid.equals("RESTAURANT"))
                uid="RESTAURANT";
            Connection con;
            Statement stmt;
            ResultSet rs;
            int flag=0;
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT ROOM_NO,PASSWORD,USER_TYPE,NAME FROM APP.USERS");
                while(rs.next())
                {
                  if(uid.equals(rs.getString(1)) && pass.equals(rs.getString(2)) && type.equals(rs.getString(3)))
                  {
                      flag=1;
                      if(type.equals("USER"))
                      {name=rs.getString(4); }
                  }
                }
                con.close();
                if(type.equals("USER") && flag==1)
                {
                    session.setAttribute("UserName", name);
                    RequestDispatcher rd=request.getRequestDispatcher("userwelcome.jsp");
                    rd.forward(request, response);
                }
                if(type.equals("RECEPTION") && flag==1)
                {
                    session.setAttribute("UserName", "RECEPTION");
                    RequestDispatcher rd=request.getRequestDispatcher("receptionwelcome.jsp");
                    rd.forward(request, response);
                }
                if(type.equals("RESTAURANT") && flag==1)
                {
                    session.setAttribute("UserName", "RESTAURANT");
                    RequestDispatcher rd=request.getRequestDispatcher("reswelcome.jsp");
                    rd.forward(request, response);
                }
                else
                {
                     RequestDispatcher rd=request.getRequestDispatcher("wrong.jsp");
                     rd.forward(request, response);
                } 
            }
           catch(Exception e)
           {out.println(e);}
       %> 
    </body>
</html>
