
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Registro de Usuario</title>
  <!-- Bootstrap core CSS-->
  <link href="Style/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Custom fonts for this template-->
  <link href="Style/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  <!-- Custom styles for this template-->
  <link href="Style/css/sb-admin.css" rel="stylesheet">
</head>

<body class="bg-dark">
  <div class="container">
    <div class="card card-register mx-auto mt-5">
      <div class="card-header">Registro Cuenta</div>
      <div class="card-body">
          <form action="ServletRegistro" method="POST">    
             <div class="form-group">
            <label for="colegio">Colegio</label>
            <input class="form-control" name="colegio" type="text" aria-describedby="nameHelp" placeholder="Ingrese el Colegio">
          </div>
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="nombre">Nombre</label>
                <input class="form-control" name="nombre" type="text" aria-describedby="nameHelp" placeholder="Enter first name">
              </div>
              <div class="col-md-6">
                <label for="apellido">Apellido</label>
                <input class="form-control" name="apellido" type="text" aria-describedby="nameHelp" placeholder="Enter last name">
              </div>
            </div>
          </div>
          <div class="form-group">
            <label for="email">Email</label>
            <input class="form-control" name="email" type="email" aria-describedby="emailHelp" placeholder="Enter email">
          </div>
               
          <div class="form-group">
            <div class="form-row">
              <div class="col-md-6">
                <label for="pswd">Password</label>
                <input class="form-control" name="pswd" type="password" placeholder="Password">
              </div>
              <div class="col-md-6">
                <label for="pswd2">Confirmar password</label>
                <input class="form-control" name="pswd2" type="password" placeholder="Confirm password"/>
              </div>
            </div>
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
