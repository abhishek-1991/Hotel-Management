<%-- 
    Document   : printcontent
    Created on : Apr 22, 2012, 7:43:55 PM
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
        <table border="0" cellspacing="15" align="center">
            <thead>
                <tr>
                    <th>Description</th>
                    <th>Quantity</th>
                    <th>Rate</th>
                    <th>Charges</th>
                </tr>
            </thead>
            <tbody>                
        <%
            int tot=0,size=0;
            String des,qty,rate;
            size=Integer.parseInt(request.getParameter("size").toString());
            for(int i=0;i<=size;i++)
            {   int charges=0;
                des=request.getParameter("des"+i).toString();
                qty=request.getParameter("qty"+i).toString();
                rate=request.getParameter("rate"+i).toString();
                charges=Integer.parseInt(qty)*Integer.parseInt(rate);
                tot+=charges;
                out.println("<tr>");
                out.println("<td>"+des+"</td>");
                out.println("<td>"+qty+"</td>");
                out.println("<td>"+rate+"</td>");
                out.println("<td>"+charges+"</td>");
                out.println("</tr>");
                
            }
        %>
        <tr>
            <td>Total</td>
            <td></td>
            <td></td>
            <td><%=tot%></td>
        </tr>
            </tbody>
        </table><br>
        <a href="javascript:window.print()">Print</a><br>
        <a href="reswelcome.jsp">Click Here to return to home page</a>

    </body>
</html>
