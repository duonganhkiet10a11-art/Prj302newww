<%-- 
    Document   : a
    Created on : Jan 12, 2026, 3:30:35 PM
    Author     : ASUS
--%>

<%@page import="Model.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            UserDTO user = (UserDTO) request.getAttribute("user");

        %>
        welcome<%= user.getFullname()%>, </br>
        Bang dieu khien <br/>
        Tinh nang 1 <br/>
        Tinh nang 2 <br/>
        Tinh nang 3 <br/>
    </body>
</html>
