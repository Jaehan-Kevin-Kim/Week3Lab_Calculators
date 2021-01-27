<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 27, 2021, 9:31:21 AM
    Author     : 841898
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post">
            First: <input type="text"  name="firstInput" value="${firstInput}"/> <br />
            Second: <input type="text" name="secondInput" value="${secondInput}" /> <br />
            <input type="submit" name="plus" value="+"/> 
            <input type="submit" name="minus" value="-" /> 
            <input type="submit" name="multiply" value="*"/> 
            <input type="submit" name="reminder" value="%"/>
         </form>
        <span name="result">Result : ${result}</span> <br />
<!--            First: <input type="text" name="firstInput"/> <br />
            Second: <input type="text"  name="secondInput"/> <br />
            <button type="submit" name="plus">+</button> <button type="submit" name="minus">-</button> <button type="submit" name="multiply">*</button> <button type="submit" name="reminder">%</button>
            <span>Result : </span><span name="result" value="${result}">---</span> <br />-->

         <a href="/age ">Age Calculator</a>
        
        
    </body>
</html>
