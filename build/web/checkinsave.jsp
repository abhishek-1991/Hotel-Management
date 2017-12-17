<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>save</title>
    </head>
    <body>
        <%
                   ArrayList pass=new ArrayList();
                   pass.add("A");
                   pass.add("B");
                   pass.add("C");
                   pass.add("D");
                   pass.add("E");
                   pass.add("F");
                   pass.add("G");
                   pass.add("H");
                   pass.add("I");
                   pass.add("J");
                   pass.add("K");
                   pass.add("L");
                   pass.add("M");
                   pass.add("N");
                   pass.add("P");pass.add("Q");pass.add("R");pass.add("S");pass.add("T");pass.add("U");pass.add("V");pass.add("W");
                   pass.add("X");pass.add("Y");pass.add("Z");
                   pass.add("a");pass.add("b");pass.add("c");pass.add("d");pass.add("e");pass.add("f");pass.add("g");pass.add("h");pass.add("i");
                   pass.add("j");pass.add("k");pass.add("m");pass.add("n");pass.add("p");pass.add("q");pass.add("r");pass.add("s");
                   pass.add("t");pass.add("u");pass.add("v");pass.add("w");pass.add("x");pass.add("y");pass.add("z");
                   pass.add("1");pass.add("2");pass.add("3");pass.add("4");pass.add("5");pass.add("6");pass.add("7");pass.add("8");pass.add("9");
                   pass.add("1");pass.add("2");pass.add("3");pass.add("4");pass.add("5");pass.add("6");pass.add("7");pass.add("8");pass.add("9");
                   pass.add("1");pass.add("2");pass.add("3");pass.add("4");pass.add("5");pass.add("6");pass.add("7");pass.add("8");pass.add("9");
                   Random r1=new Random();
                   Random r2=new Random();
                   Random r3=new Random();
                   Random r4=new Random();
                   Random r5=new Random();
                   Random r6=new Random();
                   String Password=pass.remove(r1.nextInt(75)).toString()+pass.remove(r2.nextInt(74)).toString()+pass.remove(r3.nextInt(73)).toString()+pass.remove(r4.nextInt(72)).toString()+pass.remove(r5.nextInt(71)).toString()+pass.remove(r6.nextInt(70)).toString();
                   String name="",roomno="",idtype="",idno="",address="",city="",country="",phoneno="",date1="",stt="",rent="",date2="";
                   java.util.Date d=new java.util.Date();
                   java.text.SimpleDateFormat ft1=new java.text.SimpleDateFormat("dd/MM/yy HH:mm");
                   java.text.SimpleDateFormat ft2=new java.text.SimpleDateFormat("dd/MM/yy");
                   date1=ft1.format(d).toString();
                   date2=ft2.format(d).toString();
                   name=request.getParameter("name");
                   roomno=request.getParameter("room_no");
                   idtype=request.getParameter("id_type");
                   idno=request.getParameter("id_no");
                   address=request.getParameter("address");
                   city=request.getParameter("city");
                   country=request.getParameter("country");
                   phoneno=request.getParameter("phone_no");
                   stt=request.getParameter("state");
                   rent=request.getParameter("rent");
                   Connection con;
                   Statement stmt;
                   try
                   {
                       Class.forName("org.apache.derby.jdbc.ClientDriver");
                       con=DriverManager.getConnection("jdbc:derby://localhost:1527/HOTEL_MANAGEMENT","hotel","password");
                       stmt=con.createStatement();
                       stmt.executeUpdate("UPDATE APP.USERS SET NAME='"+name+"',ID_TYPE='"+idtype+"',ID_NO='"+idno+"',ADDRESS='"+address+"',CITY='"+city+"',STATE='"+stt+"',COUNTRY='"+country+"',PHONE_NO='"+phoneno+"',PASSWORD='"+Password+"',ROOM_STATUS='OCCUPIED',CHECKIN_DATE='"+date1+"' WHERE ROOM_NO='"+roomno+"'");                       
                       stmt.executeUpdate("INSERT INTO APP.ACCOUNT(ROOM_NO,DESCRIPTION,CHARGES,\"DATE\") VALUES('"+roomno+"','ROOM RENT','"+rent+"','"+date2+"')");
                       con.close();
                   }
                   catch(Exception e){out.println(e);}                   
        %>
        <jsp:forward page="printinfo.jsp">
            <jsp:param name="password" value="<%=Password%>"/>
        </jsp:forward>
    </body>
</html>
