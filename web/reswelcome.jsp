<%-- 
    Document   : reswelcome
    Created on : Apr 22, 2012, 6:40:10 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restaurant</title>
        <SCRIPT language="javascript">
        function addRow(tableID) {
 
            var table = document.getElementById(tableID);
 
            var rowCount = table.rows.length;
            var row = table.insertRow(rowCount);
            var index = rowCount;
            index=index-1;
 
            var cell1 = row.insertCell(0);           
            cell1.innerHTML="<input type='text' name='des"+index+"' size='25'>";
 
            var cell2 = row.insertCell(1);            
            cell2.innerHTML="<input type='text' name='qty"+index+"' size='25'>";
 
            var cell3 = row.insertCell(2);
            cell3.innerHTML="<input type='text' name='rate"+index+"' size='25'>";
            
                document.getElementById("size").value=index;
 
        }
        </script>
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
        <form name="frm" action="printcontent.jsp">
        
            <table border="0" cellspacing="15" id="dataTable" align="center">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Quantity</th>
                    <th>Rate</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td><input type="text" name="des0" value="" size="25" /></td>
                    <td><input type="text" name="qty0" value="" size="25" /></td>
                    <td><input type="text" name="rate0" value="" size="25" /></td>
                </tr>
            </tbody>
        </table><br>
        <input type="hidden" name="size" id="size">
        <center><input type="button" value="Add Item" name="additem" onclick="addRow('dataTable')"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <input type="submit" value="Submit" name="Submit" /></center>
        </form>
    </body>
</html>
