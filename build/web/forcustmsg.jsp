
<%-- 
    Document   : forcustmsg
    Created on : Apr 21, 2012, 10:50:56 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            
                <%String name=""; 
                name=request.getParameter("name");
                //out.println("faga");
                int i=0;
                Connection con;
                Statement stmt;
                ResultSet rs;
                try
                {Class.forName("org.apache.derby.jdbc.ClientDriver");
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                //con.setAutoCommit(false);
                //out.println("faga");
                stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
                rs=stmt.executeQuery("SELECT NAME,ADDRESS,CITY,STATE,COUNTRY,PHONE_NO,ROOM_NO,ROOM_TYPE,CHECKIN_DATE,CHECKOUT_DATE FROM APP.FORMER_CUTOMERS WHERE NAME='"+name+"'");
                
                rs.last();
                //out.println("aks");
                if(rs.getRow()==0)
                {out.println("<h2 align='center'>No Record Exists</h2>");}
                else
                {   rs.beforeFirst();
                    while(rs.next())
                {               
                   out.println("<table border=\"0\" align=\"center\" cellspacing=\"15\">");
            out.println("<thead>");
                out.println("<tr>");
                    out.println("<th>S.No.</th>");
                    out.println("<th>Name</th>");
                    out.println("<th>Address</th>");
                    out.println("<th>City</th>");
                    out.println("<th>State</th>");
                    out.println("<th>Country</th>");
                    out.println("<th>Phone Number</th>");
                    out.println("<th>Room Number</th>");
                    out.println("<th>Room Type</th>");
                    out.println("<th>Checkin Date</th>");
                    out.println("<th>Checkout Date</th>");
                out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");               
                    i++;
                out.println("<tr>");
                    out.println("<td>"+i+"</td>");
                    out.println("<td>"+rs.getString(1)+"</td>");
                    out.println("<td>"+rs.getString(2)+"</td>");
                    out.println("<td>"+rs.getString(3)+"</td>");
                    out.println("<td>"+rs.getString(4)+"</td>");
                    out.println("<td>"+rs.getString(5)+"</td>");
                    out.println("<td>"+rs.getString(6)+"</td>");
                    out.println("<td>"+rs.getString(7)+"</td>");
                    out.println("<td>"+rs.getString(8)+"</td>");
                    out.println("<td>"+rs.getString(9)+"</td>");
                    out.println("<td>"+rs.getString(10)+"</td>");
                out.println("</tr>");
                out.println("</tbody>");
        out.println("</table>");
                       }
                }
                }
                catch(Exception e){out.println(e);}
                %>
            

    </body>
</html>
