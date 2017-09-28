<%-- 
    Document   : mainPage
    Created on : Sep 20, 2017, 2:36:28 PM
    Author     : 721292
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main Page</title>
    </head>
    <body>
        <h1>Main Page</h1>
        <p>Hello,<h3>${username}</h3></p><br>
        <form action="mainPage" method="post">
        <input type="submit" value="Logout">
        </form>
        
    </body>
</html>
