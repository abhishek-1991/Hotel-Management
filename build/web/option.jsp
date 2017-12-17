<%-- 
    Document   : option
    Created on : Apr 15, 2012, 2:00:19 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            
        <%Connection con;
          Statement stmt;
          ResultSet rs;
          String cate=request.getParameter("rt"),r="";
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
       
        %>
        
            
        </select>
    </body>
</html>
