<%-- 
    Document   : addcharges
    Created on : Apr 20, 2012, 4:23:44 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Additional Charges</title>
        <style type="text/css">
<!--
.aaaa {
	color: #F00;
}
-->
</style>
    </head>
    <body>
         <h1 align="center" class="aaaa"><strong><em><u>HOTEL XYZ</u></em></strong> </h1>
         <%     String roomno="",des="",charges="";
                roomno=request.getParameter("room_no");
                des=request.getParameter("des");
                charges=request.getParameter("charges");
                java.util.Date d=new java.util.Date();
                java.text.SimpleDateFormat ft2=new java.text.SimpleDateFormat("dd/MM/yy");
                String date=ft2.format(d).toString();
                Connection con;
                   Statement stmt;
                   try
                   {
                       Class.forName("org.apache.derby.jdbc.ClientDriver");
                       con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                       stmt=con.createStatement();
                       stmt.executeUpdate("INSERT INTO APP.ACCOUNT(ROOM_NO,DESCRIPTION,CHARGES,\"DATE\") VALUES('"+roomno+"','"+des+"','"+charges+"','"+date+"')");
                   }
                   catch(Exception e)
                   {
                       out.println("Error Occured!!!");
                       out.println("<a href=\"receptionwelcome.jsp\">Click Here to return to homepage</a>");
                   }
         %>
    <table align="center">
    <tr >
        <td  bgcolor="#FAFAD2">Added Successfully</td>
    </tr>
</table>
         Enter Information:
         <form name="frm" action="chargesavevalid.jsp" method="POST">
         <table border="0" align="center">
             <tbody>
                 <tr>
                     <td>Room Number</td>
                     <td>:&nbsp;<input type="text" name="room_no" value="" size="25" /></td>
                 </tr>
                 <tr>
                     <td>Description</td>
                     <td>:&nbsp;<input type="text" name="des" value="" size="25" /></td>
                 </tr>
                 <tr>
                     <td>Charges</td>
                     <td>:&nbsp;<input type="text" name="charges" value="" size="25" /></td>
                 </tr>
                 <tr>
                     <td><input type="submit" value="Submit" name="Submit" /></td>
                     <td><input type="reset" value="Reset" name="Reset" /></td>
                 </tr>
             </tbody>
         </table></form><br>
         <a href="receptionwelcome.jsp">Click Here to return to homepage</a>

    </body>
</html>
