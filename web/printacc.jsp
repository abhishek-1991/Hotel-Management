<%-- 
    Document   : printacc
    Created on : Apr 21, 2012, 10:56:57 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body link="black" vlink="black">
        <a href="javascript:window.print()">print</a>&nbsp;&nbsp;<A href="receptionwelcome.jsp">Click Here to return to homepage</a><br>
        <%String roomno=request.getParameter("room_no");%>
        <form name="frm" action="checkoutmsg.jsp">
            <input type="hidden" name="room_no" value="<%=roomno%>" />
            <input type="submit" value="Checkout" name="Checkout" />
        </form>
    <center>Charges Description:</center>
    <table align="center" cellpadding="5" cellspacing="15">
        <thead>
        <th>Date</th>
        <th>Description</th>
        <th>Charges</th>
        </thead>
        <tbody>
    <%      float tot=0;
            Connection con;
            Statement stmt;
            ResultSet rs;
    %>
            
     <%       
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                rs=stmt.executeQuery("SELECT DESCRIPTION,CHARGES,DATE FROM APP.ACCOUNT WHERE ROOM_NO='"+roomno+"'");
                rs.last();
                if(rs.getRow()==0)
                                       {RequestDispatcher rd=request.getRequestDispatcher("wcheckout.jsp");
                    rd.forward(request, response);}
                               else{rs.beforeFirst();
                while(rs.next())
                {
                    out.println("<tr>");
                    out.println("<td>"+rs.getString(3)+"</td>");
                    out.println("<td>"+rs.getString(1)+"</td>");
                    out.println("<td>"+rs.getString(2)+"</td>");
                    out.println("</tr>");
                    tot+=Float.parseFloat(rs.getString(2));
                    
                }
                }
            }
            catch(Exception e){}
      %>
      <%    
            
      %>
      <tr>
          <td></td>
          <td><strong>Total</strong></td>
          <td><strong><%=tot%></strong></td>
      </tr>
        </tbody>
    </table><br>
    <% java.util.Date d=new java.util.Date();
       java.text.SimpleDateFormat ft2=new java.text.SimpleDateFormat("dd/MM/yy");
       String date=ft2.format(d).toString();%>
       Date:<%=date%><br><br>
    Signature
    </body>
</html>
