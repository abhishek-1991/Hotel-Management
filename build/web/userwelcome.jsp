<%-- 
    Document   : userwelcome
    Created on : Apr 16, 2012, 9:30:27 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
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
         <%
                String name=session.getAttribute("UserName").toString();
                String roomno=request.getParameter("USERID");
         %>
         <table align="center">
             <tr>
                 <td>Name</td>
                 <td><%=name%></td>
             </tr>
             <tr>
                 <td>Room Number</td>
                 <td><%=roomno%></td>
             </tr>
         </table>
    <center>Account Description:</center>
    <table align="center" cellpadding="5">
        <thead>
        <th>Date</th>
        <th>Description</th>
        <th>Charges</th>
        </thead>
        <tbody>
    <%      float tot=0;
            Connection con;
            Statement stmt;
            ResultSet rs;%>
            <%!String a[];%>
     <%       
            try
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                stmt=con.createStatement();
                rs=stmt.executeQuery("SELECT DESCRIPTION,CHARGES,DATE FROM APP.ACCOUNT WHERE ROOM_NO='"+roomno+"'");
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
    </table>
    </body>
</html>
