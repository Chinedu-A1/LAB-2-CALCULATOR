<%-- 
    Document   : arithmeticCalc
    Created on : Jan 19, 2022, 3:07:03 PM
    Author     : Chinedu Alake
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
        
        <form action="arithmetic" method="post">
           <label for="first">First:</label>
           <input type="number" name="first" id="first" value="${first}">
           <br>
           <label for="second">Second:</label>
           <input type="number" name="second" id="second" value="${second}">
           <br>
           <input type="submit" name="operation" id="add" value="+">
           <input type="submit" name="operation" id="sub" value="-">
           <input type="submit" name="operation" id="multiply" value="*">
           <input type="submit" name="operation" id="divide" value="%">
           
            <br> 
           
        

        </form>
               <p>Result: ${message}</p>
            <a href="age">Age Calculator</a>
    </body>
</html>
