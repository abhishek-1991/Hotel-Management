<%-- 
    Document   : checkout
    Created on : Apr 21, 2012, 10:49:54 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>checkout</title>
        <style type="text/css">
<!--
.aaaa {
	color: #F00;
}
-->
</style>
    </head>
    <body link="black" vlink="black">
        <h1 align="center" class="aaaa"><strong><em><u>HOTEL XYZ</u></em></strong> </h1><br>
        
        <form name="frm" action="printacc.jsp">
            <center>Enter Room Number:&nbsp;<input type="text" name="room_no" value="" size="15" /></center><br>
            <center><input type="submit" value="Submit" name="Submit" /></center>
        </form><BR>
        <A href="receptionwelcome.jsp">Click Here to return to homepage</a>
    
    </body>
</html>
