<%-- 
    Document   : login
    Created on : Jan 12, 2026, 3:30:29 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="MainController" method="post">
        Username:<input type="text" name="txtUsername" />
        Password:<input type="password" name="txtPassword"/>
        <input type="submit" value="Login"/>
    </form>
        <%
        String message = request.getAttribute(name);
        %>
    </body>
</html>
