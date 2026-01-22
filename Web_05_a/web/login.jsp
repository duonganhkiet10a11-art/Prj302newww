<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>

        <!-- ===== FORM LOGIN ===== -->
        <!-- NOTE: gửi về MainController -->
        <form action="MainController" method="post">

            <!-- NOTE: action=login để MainController chuyển sang LoginController -->
            <input type="hidden" name="action" value="login" />

            Username:
            <!-- NOTE: required theo yêu cầu thầy -->
            <input type="text" name="txtUsername" required /> <br/>

            Password:
            <!-- NOTE: required theo yêu cầu thầy -->
            <input type="password" name="txtPassword" required /> <br/>

            <input type="submit" value="Login" />
        </form>

        <!-- ===== HIỂN THỊ THÔNG BÁO LỖI ===== -->
        <%
            // NOTE: lấy message từ LoginController
            String message = (String) request.getAttribute("message");

            // NOTE: tránh lỗi null
            if (message == null) {
                message = "";
            }
        %>

        <span style="color:red"><%= message%></span>

    </body>
</html>
