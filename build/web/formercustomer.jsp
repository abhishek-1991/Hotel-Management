<%-- 
    Document   : formercustomer
    Created on : Apr 21, 2012, 10:35:18 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Former Customer</title>
<script type="text/javascript" language="javascript">
 function record()
 {              var name=document.getElementById("name").value; 
                var http=new XMLHttpRequest();         
                http.onreadystatechange=function()
                {if(http.readyState==4 && http.status==200)
                    {
                        var res=http.responseText;
                        document.getElementById("info").innerHTML=res;
                    }
                }
                http.open("GET", "forcustmsg.jsp?name="+name, true);
                http.send(null);
               
 }
</script>
<style type="text/css">
.aaaa {
	color: #F00;
}
</style>
    </head>
    <body link="black" vlink="black">
        <h1 align="center" class="aaaa"><strong><em><u>HOTEL XYZ</u></em></strong> </h1>
    <center>Use Upper Case Only</center>
        <form name="frm">
    <center><lable>Enter Name:</lable>
        <input type="text" name="name" value="" size="25" id="name"/>
    </center><br>
    <center><input type="button" value="Submit" name="Submit" onclick="record()"/></center>
        </form>
    <br>
    <div id="info">&nbsp;</div>
    <br>
    <br>
    <a href="javascript:window.print()">Print</a><br>
    <a href="receptionwelcome.jsp">Click Here to return to homepage</a>
    </body>
</html>
