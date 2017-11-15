<%-- 
    Document   : Login
    Created on : 30/10/2017, 09:03:16 PM
    Author     : mnieto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Login APP_FPD</title>
  <!-- Bootstrap core CSS-->
  <link href="Style/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="Style/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="Style/css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-login mx-auto mt-5">
      <div class="card-header">Inicio de Sesión</div>
      <div class="card-body">
          <form action="ServletLogin" method="POST">
          <div class="form-group">
            <label for="email">Email address</label>
            <input class="form-control" name="email" type="email" aria-describedby="emailHelp" placeholder="Enter email"/>
          </div>
          <div class="form-group">
            <label for="pswd">Password</label>
            <input class="form-control" name="pswd" type="password" placeholder="Password"/>
          </div>
          <div class="form-group">
            <div class="form-check">
              <label class="form-check-label">
                <input class="form-check-input" type="checkbox"> Recordar Contraseña</label>
            </div>
          </div>
          <input type="submit" name="submit" class="btn btn-primary  btn-block"/>
        </form>
        <div class="text-center">
          <a class="d-block small mt-3" href="Registro.jsp">Registrar una cuenta</a>
        </div>
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
