<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : checkoutmsg
    Created on : Apr 21, 2012, 9:22:32 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="refresh" content="5;URL=http://localhost:8080/Hotel_Management/checkout.jsp">
        <title>Message</title>
    </head>
    <body>
        <%
            String roomno=request.getParameter("room_no"),name="",address="",city="",country="",phoneno="",rtype="",cdate="",state="";
            java.util.Date d=new java.util.Date();
            java.text.SimpleDateFormat ft2=new java.text.SimpleDateFormat("dd/MM/yy HH:mm");
            String date=ft2.format(d).toString();
            Connection con;
            Statement stmt;
            ResultSet rs;
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT NAME,ADDRESS,CITY,COUNTRY,PHONE_NO,ROOM_TYPE,CHECKIN_DATE,STATE FROM APP.USERS WHERE ROOM_NO='"+roomno+"'");
                while(rs.next())
                {
                    name=rs.getString(1);
                    address=rs.getString(2);
                    city=rs.getString(3);
                    country=rs.getString(4);
                    phoneno=rs.getString(5);
                    rtype=rs.getString(6);
                    cdate=rs.getString(7);
                    state=rs.getString(8);
                }
                stmt.executeUpdate("UPDATE APP.USERS SET NAME='',ID_TYPE='',ID_NO='',ADDRESS='',CITY='',STATE='',COUNTRY='',PHONE_NO='',PASSWORD='',ROOM_STATUS='UNOCCUPIED',CHECKIN_DATE='' WHERE ROOM_NO='"+roomno+"'");
                stmt.executeUpdate("DELETE FROM APP.ACCOUNT WHERE ROOM_NO = '"+roomno+"'");
                stmt.executeUpdate("INSERT INTO APP.FORMER_CUTOMERS(NAME,ADDRESS,CITY,STATE,COUNTRY,PHONE_NO,ROOM_NO,ROOM_TYPE,CHECKIN_DATE,CHECKOUT_DATE) VALUES('"+name+"','"+address+"','"+city+"','"+state+"','"+country+"','"+phoneno+"','"+roomno+"','"+rtype+"','"+cdate+"','"+date+"')");
                out.println("<h1 align='center'>Checked Out Successfully</h1>");
                out.println("<h2 align='center'>Redirecting...</h2>");
            }
            catch(Exception e)
            {
                out.println("<h1 align='center'>Checked Out Unsuccessfull</h1>");
                out.println("<h2 align='center'>Redirecting...</h2>");
                out.println(e);
            }
            
        %>
    </body>
</html>
