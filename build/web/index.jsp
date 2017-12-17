<%-- 
    Document   : index
    Created on : Apr 8, 2012, 7:46:38 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <title>WELCOME TO XYZ HOTEL</title>
<style type="text/css">
<!--
.aaaa {
	color: #F00;
}
-->
</style>


</head>

<body>

<h1 align="center" class="aaaa"><strong><u><em>HOTEL XYZ</em></u></strong></h1>

</h1>
                      <form id="form1" name="form1" method="post" action="login.jsp">
                        <p align="center">

                          <label>USER ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="text" name="USERID" id="USER ID" />
                          </label>
                        </p>
<p align="center"><span id="sprypassword1">
                          <label>PASSWORD*
                            <input type="password" name="PASSWORD" id="PASSWORD" />
                          </label><br>
                          *Password is case sensitive
                        <span class="passwordRequiredMsg"></span></span></p>

                    </blockquote>

                  </blockquote>

                    <div align="center">
                      <table width="200">
                        <tr>
                          <td><label>
                            <input type="radio" name="RadioGroup1" value="USER" id="RadioGroup1_0"  checked="checked" />
                          USER</label></td>
                        </tr>

                        <tr>
                          <td><label>
                            <input name="RadioGroup1" type="radio" id="RadioGroup1_1" value="RECEPTION" />
                            RECEPTION</label></td>
                        </tr>
                        <tr>
                          <td><label>
                            <input name="RadioGroup1" type="radio" id="RadioGroup1_2" value="RESTAURANT"/>
                            RESTAURANT</label></td>
                        </tr>
                       
                        </table>
                    </div>
  <p align="center">
                      <label>
                        <input type="submit" name="SUBMIT" id="SUBMIT" value="SUBMIT" />
                      </label>

                    	  <label>
                    	    <input type="submit" name="RESET" id="RESET" value="RESET" />
               	      </label>
  </p>
</form>


</body>
</html>
                    
