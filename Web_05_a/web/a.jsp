<%@page import="models.UserDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    // ===== BẮT BUỘC ĐĂNG NHẬP =====
    UserDTO user = (UserDTO) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Dashboard</title>
    </head>
    <body>

        Welcome <%= user.getFullName()%>, <br/><br/>

        <!-- LOGOUT -->
        <a href="MainController?action=logout">Logout</a>
        <br/><br/>

        <!-- NOTE: SEARCH THEO YÊU CẦU THẦY (REQ) -->
        <a href="MainController?req=search">Search</a>
        <br/><br/>

        Bang dieu khien <br/>
        Tinh nang 1 <br/>
        Tinh nang 2 <br/>
        Tinh nang 3 <br/>

    </body>
</html>
