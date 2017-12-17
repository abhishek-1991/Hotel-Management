<%-- 
    Document   : printinfo
    Created on : Apr 15, 2012, 3:53:47 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Print</title>
    </head>
    <body link="black" vlink="black">
        <%
            String name="",roomno="",idtype="",idno="",address="",city="",country="",phoneno="",date="",stt="",pass="",rtype="",rent;
                   java.util.Date d=new java.util.Date();
                   java.text.SimpleDateFormat ft=new java.text.SimpleDateFormat("HH:mm dd/MM/yy");
                   date=ft.format(d).toString();
                   name=request.getParameter("name");
                   roomno=request.getParameter("room_no");
                   idtype=request.getParameter("id_type");
                   idno=request.getParameter("id_no");
                   address=request.getParameter("address");
                   city=request.getParameter("city");
                   country=request.getParameter("country");
                   phoneno=request.getParameter("phone_no");
                   stt=request.getParameter("state");
                   pass=request.getParameter("password");
                   rtype=request.getParameter("room_type");
                   rent=request.getParameter("rent");
        %>
        <table border="1" align="center">
            
            <tbody>
                <tr>
                    <td>Name</td>
                    <td><%=name%></td>
                </tr>
                <tr>
                    <td>Room Number/User ID</td>
                    <td><%=roomno%></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><%=pass%></td>
                </tr>
            </tbody>
        </table><br>
        <hr>
        <br>
        <table border="1" align="center">
            
            <tbody>
                <tr>
                    <td>Name</td>
                    <td><%=name%></td>
                </tr>
                <tr>
                    <td>Room Number</td>
                    <td><%=roomno%></td>
                </tr>
                <tr>
                    <td>Room Type</td>
                    <td><%=rtype%></td>
                </tr>
                <tr>
                    <td>ID Type</td>
                    <td><%=idtype%></td>
                </tr>
                <tr>
                    <td>ID Number</td>
                    <td><%=idno%></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><%=address%></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><%=city%></td>
                </tr>
                <tr>
                    <td>State</td>
                    <td><%=stt%></td>
                </tr>
                <tr>
                    <td>Country</td>
                    <td><%=country%></td>
                </tr>
                <tr>
                    <td>Phone Number</td>
                    <td><%=phoneno%></td>
                </tr>
                
                <tr>
                    <td>Password</td>
                    <td><%=pass%></td>
                </tr>
                <tr>
                    <td>Room Rent</td>
                    <td><%=rent%></td>
                </tr>
                <tr>
                    <td>signature</td>
                    <td></td>
                </tr>
            </tbody>
        </table><br>
    <center><a href="javascript:window.print()">Print</a></center>
    <center><a href="receptionwelcome.jsp">Click here to return to home page</a></center>


    </body>
</html>
