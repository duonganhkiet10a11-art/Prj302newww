<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>403 - Forbidden</title>
    </head>
    <body style="text-align:center;font-family:Arial">
        <h2>403 - Access Denied</h2>

        <!-- NOTE: Hiển thị lý do bị từ chối -->
        <p style="color:red">
            <%= request.getAttribute("message") == null
                    ? "Your account is disabled."
                    : request.getAttribute("message")%>
        </p>

        <a href="login.jsp">Back to Login</a>
    </body>
</html>
