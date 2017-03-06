<%-- 
    Document   : createHomework
    Created on : 6/03/2017, 08:36:24 AM
    Author     : ingenieria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>hi, do yo want to create</h1>
        
        <form action="CreateHomeWork" method="post">
            HomwWork name=<input name="homework">
            Address: <input name="address">
            Grade: <input name="grade"type="number">
            <input type="submit">
            
        </form>
    </body>
</html>
