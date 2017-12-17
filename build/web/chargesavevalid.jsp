<%-- 
    Document   : chargesavevalid
    Created on : Apr 20, 2012, 8:58:42 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="5;URL=http://localhost:8080/Hotel_Management/addcharges.jsp">
        <title>JSP Page</title>
    </head>
    <body>
        <%         String r=request.getParameter("room_no");
                   int flag=0;
                   Connection con;
                   Statement stmt;
                   ResultSet rs;
                   try
                   {
                       Class.forName("org.apache.derby.jdbc.ClientDriver");
                       con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                       stmt=con.createStatement();
                       rs=stmt.executeQuery("SELECT ROOM_NO FROM APP.USERS WHERE ROOM_STATUS='OCCUPIED'");
                       while(rs.next())
                       {
                           if(rs.getString(1).equals(r))
                               flag=1;
                       }
                       if(flag==1)
                       {
                           RequestDispatcher rd=request.getRequestDispatcher("chargesave.jsp");
                           rd.include(request, response);
                       }
                       else
                       {
                           out.println("<center>Room is not occupied enter again</center>");
                           out.println("<center>Redirecting.....</center>");
                           
                       }
                       con.close();
                       
                   }
                   catch(Exception e){}
        %>
    </body>
</html>
