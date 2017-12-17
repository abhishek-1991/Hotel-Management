<%-- 
    Document   : addcharges
    Created on : Apr 20, 2012, 4:23:44 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
