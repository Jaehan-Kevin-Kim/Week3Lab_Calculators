<%-- 
    Document   : agecalculator
    Created on : Jan 27, 2021, 8:03:44 AM
    Author     : 841898
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
          Enter your age: <input type="text" name="age"><br>
          <button type="submit">Age next birthday</button>
         <p> ${message}</p>
        </form>
        <a href="/arithmetic">Arithmetic Calculator</a>
    </body>
</html>
