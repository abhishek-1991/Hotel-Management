<%-- 
    Document   : checkin
    Created on : Apr 15, 2012, 12:18:18 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>CHECKIN</title>
<script type="text/javascript">
 function select()
 {var cate=document.getElementById("rtype").value;
                
                
                var http=new XMLHttpRequest();         
                http.onreadystatechange=function()
                 {if(http.readyState==4 && http.status==200)
                    {
                        var res=http.responseText;
                        document.getElementById("room").innerHTML=res;
                    }
                }
                http.open("GET", "option.jsp?rt="+cate+"", true);
                http.send();
               
 }
 function valid()
 {
      if(document.frm.name.value=="")
                    {
                        alert("Please enter Name!!!!");
                        document.frm.name.focus();
                        return false;
                    }
       if(document.frm.id_no.value=="")
                    {
                        alert("Please enter ID Number!!!!");
                        document.frm.id_no.focus();
                        return false;
                    }
       if(document.frm.address.value=="")
                    {
                        alert("Please enter Address!!!!");
                        document.frm.address.focus();
                        return false;
                    }
       if(document.frm.city.value=="")
                    {
                        alert("Please enter City!!!!");
                        document.frm.city.focus();
                        return false;
                    }
       if(document.frm.country.value=="")
                    {
                        alert("Please enter Country!!!!");
                        document.frm.country.focus();
                        return false;
                    }
        if(document.frm.phone_no.value=="")
                    {
                        alert("Please enter Phone Number!!!!");
                        document.frm.phone_no.focus();
                        return false;
                    }
                      return true;
 }
 document.form[0].submit();
</script>
<style type="text/css">
<!--
.aaaa {
	color: #F00;
}
-->
</style>
</head>

<body link="black" vlink="black">

    <h1 align="center" class="aaaa"><strong><em><u>HOTEL XYZ</u></em></strong> </h1>
<h2 align="center">CUSTOMER CHECKIN PAGE</h2>
<div align="center">
<form id="form1" name="frm" method="post" action="checkinsave.jsp">
    <table>
      <tr>
          <td>NAME</td>
          <td><input type="text" name="name" id="NAME" /></td>
        
      </tr>
      
      <tr>
          <td>ROOM TYPE</td>
          <td><select name="room_type" id="rtype" onchange="select()">
                  <option value="0">--SELECT--</option>
            <option value="SINGLEBED">SINGLEBED ROOM</option>
            <option value="DOUBLEBED">DOUBLEBED ROOM</option>
            <option value="SUITE">SUITE</option>
         
        </select></td>

      </tr>
      <tr>
          <td>ROOM NO</td>
          <td><select name="room_no" id="room">
            <option></option>
           </select></td>
           
          
        
      </tr>
      <tr><td>ID TYPE</td>
          <td> <select name="id_type" id="jumpMenu3">
          <option value="PASSPORT">PASSPORT</option>
          <option value="DRIVING LICENSE">DRIVING LICENSE</option>
          <option value="VOTER ID">VOTER ID</option>
          <option value="AADHAAR CARD">AADHAAR CARD</option>
          <option value="RATION CARD">RATION CARD</option>
          <option value="PAN CARD">PAN CARD</option>
        </select></td>
      </tr>
      <tr>
      <td>ID NO</td>
          <td> <input type="text" name="id_no" id="ID NO" /></td>

        
      </tr>
      <tr><td>ADDRESS</td>
          <td><input type="text" name="address" id="ID NO2" /></td>
      </tr>
      <tr><td>CITY</td>
          <td><input type="text" name="city" id="ID NO3" /></td>
      </tr>
      </tr>
      <tr><td>STATE</td>
          <td><input type="text" name="state" id="ID NO3" /></td>
      </tr>
      <tr><td>COUNTRY</td>
          <td><input type="text" name="country" id="ID NO3" value="INDIA"/></td>
      </tr>
      <tr><td>PHONE NO</td>
          <td><input type="text" name="phone_no" id="ID NO4" /></td>
      </tr>
      <tr><td>ROOM RENT</td>
          <td><input type="text" name="rent" id="ID NO4" /></td>
      </tr>
      <tr>
          <td><input type="submit" value="SUBMIT" name="SUBMIT" onclick="return valid()" /></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="reset" value="RESET" name="RESET" /></td>
    </tr>
    </table><br>
    <center><a href="receptionwelcome.jsp">click here to return to home page</a></center>
</form>
</div>
</body>
</html>
