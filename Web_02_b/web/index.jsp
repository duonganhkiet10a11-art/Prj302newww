<%-- 
    Document   : index
    Created on : Jan 8, 2026, 4:00:42 PM
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
        <form action="MainController" method="get">
            a:<input type="txtText" name="txtA"><br>
            b:<input type="txtText" name="txtB"><br>
            <select name="txtOp">
                <option value="+">+</option>
                <option value="-">-</option>
                <option value="*">*</option>
                <option value="/">/</option>
            </select>

            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
