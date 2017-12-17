<%-- 
    Document   : receptionwelcome
    Created on : Apr 14, 2012, 6:23:45 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*" session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RECEPTIONWELCOME</title>
        <style type="text/css">
            span.left{position:absolute;left:0;}
            span.right{position:absolute;right:0;}
            div.line{position:relative;text-align:center;width:100%}
            .aaaa {
	color: #F00;
}
        </style>  
    </head>
    <body link="black" vlink="black">
        <%session=request.getSession(false);%>
        <div class="line"><span class="left">Welcome:&nbsp;<%=session.getAttribute("UserName")%></span><span class="right"><a href="logout.jsp">Logout</a></span></div><br>
        <h1 align="center" class="aaaa">XYZ HOTEL</h1>
        <%
            String single="",doub="",suite="";
            Connection con;
            Statement stmt;
            ResultSet rs1,rs2,rs3;
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                con.setAutoCommit(false);
                stmt=con.createStatement();
                rs1=stmt.executeQuery("SELECT COUNT(ROOM_NO) FROM APP.USERS WHERE ROOM_STATUS='UNOCCUPIED' AND ROOM_TYPE='SINGLEBED'");
                while(rs1.next())
                    single=rs1.getString(1);
                rs2=stmt.executeQuery("SELECT COUNT(ROOM_NO) FROM APP.USERS WHERE ROOM_STATUS='UNOCCUPIED' AND ROOM_TYPE='DOUBLEBED'");
                while(rs2.next())
                    doub=rs2.getString(1);
                rs3=stmt.executeQuery("SELECT COUNT(ROOM_NO) FROM APP.USERS WHERE ROOM_STATUS='UNOCCUPIED' AND ROOM_TYPE='SUITE'");                
                while(rs3.next())
                    suite=rs3.getString(1);
            }
            catch(Exception e)
            {out.println(e);}
        %>
        <p>Number of Single Bed Rooms Available:&nbsp;<strong><%out.println(single);%></strong> </p>
        <p>Number of Double Bed Rooms Available:&nbsp;<strong><%out.println(doub);%></strong> </p>
        <p>Number of Suites Available:&nbsp;<strong><%out.println(suite);%></strong> </p>
        <BR>
        <a href="checkin.jsp">CHECKIN A CUSTOMER</a><br>
        <a href="checkout.jsp">CHECKOUT A CUSTOMER</a><br>
        <a href="addcharges.jsp">ADD ADDITIONAL CHARGES IN A CUSTOMER'S ACCOUNT</a><br>
        <a href="currentcustomers.jsp">RECORD OF CURRENT CUSTOMERS</a><br>
        <a href="formercustomer.jsp">RECORD OF FORMER CUSTOMER</a><br>
    </body>
</html>        
        
    
