<%-- 
    Document   : result
    Created on : 25 feb. 2022, 15:49:55
    Author     : Kevin PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h1>El resultado es: </h1>
        <%
            out.print("<p>" + request.getAttribute("resul") +"</p>"); 
        %>
    </body>
</html>
