<%-- 
    Document   : logout
    Created on : Apr 16, 2012, 10:30:40 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
        <%HttpSession hs=request.getSession(false);
            if(hs!=null)
                hs.invalidate();
        RequestDispatcher rd=request.getRequestDispatcher("logoutmsg.jsp");
                rd.include(request, response);
        %>
        
    </body>
</html>
