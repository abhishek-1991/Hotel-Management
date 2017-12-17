<%-- 
    Document   : wcheckout
    Created on : Apr 22, 2012, 11:30:14 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Incorrect Name</title>
         <style type="text/css">
<!--
.aaaa {
	color: #F00;
}
-->
</style>
    </head>
    <body>
        <h1 align="center" class="aaaa"><strong><em><u>HOTEL XYZ</u></em></strong> </h1><br>
        <table align="center">
    <tr >
        <td  bgcolor="#FAFAD2">The Room is already unoccupied</td>
    </tr>
</table>
        <form name="frm" action="printacc.jsp">
            <center>Enter Room Number:&nbsp;<input type="text" name="room_no" value="" size="15" /></center><br>
            <center><input type="submit" value="Submit" name="Submit" /></center>
        </form><BR>
        <A href="receptionwelcome.jsp">Click Here to return to homepage</a>
    </body>
</html>
