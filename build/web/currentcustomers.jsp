<%-- 
    Document   : currentcustomers
    Created on : Apr 20, 2012, 2:16:49 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current Customer's Information</title>
    </head>
    <body link="black" vlink="black">
        <table border="1">
            <thead>
                <tr>
                    <th>S.No.</th>
                    <th>Name</th>
                    <th>Room Number</th>
                    <th>Room Type</th>
                    <th>ID Type</th>
                    <th>ID No.</th>
                    <th>Address</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Country</th>
                    <th>Phone No.</th>
                    <th>Checkin date</th>
                    
                </tr>
            </thead>
            <tbody>
                <%
                Connection con;
            Statement stmt;
            ResultSet rs;
            int flag=0,i=0;
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT NAME,ROOM_NO,ROOM_TYPE,ID_TYPE,ID_NO,ADDRESS,CITY,STATE,COUNTRY,PHONE_NO,CHECKIN_DATE FROM APP.USERS WHERE ROOM_STATUS='OCCUPIED'");
                while(rs.next())
                {
                    i++;
                out.println("<tr>");
                    out.println("<td align='left'>"+i+"</td>");
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
                    out.println("<td>"+rs.getString(11)+"</td>");
                out.println("</tr>");
                }
                con.close();
            }
                catch(Exception e)
                  {}
           %>
            </tbody>
        </table><br>
        <a href="javascript:window.print()">Print</a><br>
        <a href="receptionwelcome.jsp">Click here to return to Home Page</a>
        
        

    </body>
</html>
