<%-- 
    Document   : Experiencia
    Created on : 30/10/2017, 06:47:22 PM
    Author     : mnieto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div>COMENTARIO</div>
        <form action="ServletComentario" method="POST">
            Comentario <input type="text" name="descripcion"/>
            <input type="submit" name="submit"/> 
        </form>
    </body>
</html>
