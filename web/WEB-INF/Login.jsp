<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="/html/header.html"/>

    
        <h1>LOGIN</h1>
        <h2>${message}</h2>
        <div>
            <form action="Login" method="post">
                Username :   <input type="text" name="usern" value="${user.username}"><br>
                Password :   <input type="text" name="passw" value="${user.password}"><br>
                <input type="submit" value="Login">
            </form>
        </div>
        ${errorMessage}

<c:import url="/html/footer.html" />
