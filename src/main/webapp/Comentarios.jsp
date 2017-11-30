<%-- 
    Document   : Experiencia
    Created on : 30/10/2017, 06:47:22 PM
    Author     : mnieto
--%>
<%@page import="Modelo.Experiencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Comentarios</title>
        <!-- Bootstrap core CSS-->
        <link href="Style/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom fonts for this template-->
        <link href="Style/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <!-- Custom styles for this template-->
        <link href="Style/css/sb-admin.css" rel="stylesheet">

        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <% String id = request.getParameter("idExp");%>
        <div class="container">
            <div class="card card-register mx-auto mt-5">
                <div class="card-header">Registro Cuenta</div>
                <div class="card-body">
                    <form action="Servlet" method="POST">    
                        >
                        <label for="Comentario">Comentario</label>
                        <input class="form-control" name="descripcion" type="text" aria-describedby="nameHelp" placeholder="Ingrese el Comentario">
                        </div>
                        <div class="form-group">
                            <div class="form-row">
                                <div class="col-md-6">
                                    <input class="form-control" name="idExpere" value="<%= id %>">
                                </div>

                                <input class="btn btn-primary btn-block " name="submit" type="submit"/>
                                </form>
                            </div>
                        </div>
                </div>
                <!-- Bootstrap core JavaScript-->
                <script src="Style/vendor/jquery/jquery.min.js"></script>
                <script src="Style/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
                <!-- Core plugin JavaScript-->
                <script src="Style/vendor/jquery-easing/jquery.easing.min.js"></script>

 </body>
                </html>
