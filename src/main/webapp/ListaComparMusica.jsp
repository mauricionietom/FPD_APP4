<%-- 
    Document   : Experience
    Created on : 31/10/2017, 07:30:44 AM
    Author     : mnieto
--%>
<%@page import="Dao.DaoUsuario"%>
<%@page import="Modelo.Experiencia"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Add Albums or Singles</title>

        <!-- Bootstrap Core CSS -->
        <link href="Style2/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="Style2/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="Style2/dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="Style2/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

    </head>

    <body>
          <%
            ArrayList<Experiencia> col= (ArrayList<Experiencia>) request.getAttribute("experiencias");
            Integer vtotal = (Integer) request.getAttribute("total");
            int total = 0;
            if (vtotal == null) {
                total = 0;
            } else {
                total = vtotal.intValue();
            }

        %>

        <div id="wrapper">

            <!-- Navigation -->
            <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp">APP_Music </a>
                </div>
                <!-- /.navbar-header -->

                <ul class="nav navbar-top-links navbar-right">
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-envelope fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-messages">
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>Ana Milena Matallana</strong>
                                        <span class="pull-right text-muted">
                                            <em>Miercoles</em>
                                        </span>
                                    </div>
                                    <div>Hola Ana, Pepito Perez ha comentado tu Experiencia</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <strong>Ana Milena Matallan</strong>
                                        <span class="pull-right text-muted">
                                            <em>Yesterday</em>
                                        </span>
                                    </div>
                                    <div>Juan Carlos ha comenzado la descarga de tu experiencia</div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>Leer todos los Comentarios></strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                        <!-- /.dropdown-messages -->
                    </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-tasks fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>

                        <!-- /.dropdown-tasks -->
                    </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-bell fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-alerts">
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-comment fa-fw"></i>Tienes uevos comentario en la experiencia **
                                        <span class="pull-right text-muted small">Hace 4 minutos </span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <div>
                                        <i class="fa fa-twitter fa-fw"></i> 3 personas siguen tu experiencia
                                        <span class="pull-right text-muted small">12 minutes ago</span>
                                    </div>
                                </a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a class="text-center" href="#">
                                    <strong>Entrar a todos los mensajes</strong>
                                    <i class="fa fa-angle-right"></i>
                                </a>
                            </li>
                        </ul>
                        <!-- /.dropdown-alerts -->
                    </li>
                    <!-- /.dropdown -->
                    <li class="dropdown">
                        <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                            <i class="fa fa-user fa-fw"></i> <i class="fa fa-caret-down"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="Perfil.jsp"><i class="fa fa-user fa-fw"></i>Perfil de usuario</a>
                            </li>
                            <li class="divider"></li>
                            <li><a href="Login.jsp"><i class="fa fa-sign-out fa-fw"></i>Cerrar sesión</a>
                            </li>
                        </ul>
                        <!-- /.dropdown-user -->
                    </li>
                    <!-- /.dropdown -->
                </ul>
                <!-- /.navbar-top-links -->

                <div class="navbar-default sidebar" role="navigation">
                    <div class="sidebar-nav navbar-collapse">
                        <ul class="nav" id="side-menu">

                            <li>
                                <a href="Index.jsp"><i class="fa fa-dashboard fa-fw"></i>Inicio</a>
                            </li>
                            <li>
                                <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> Charts<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="flot.html">Flot Charts</a>
                                    </li>
                                    <li>
                                        <a href="morris.html">Morris.js Charts</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                            <li>
                                <a href="tables.html"><i class="fa fa-table fa-fw"></i> Tables</a>
                            </li>
                            <li>
                                <a href="Experience.jsp"><i class="fa fa-edit fa-fw"></i> Añadir Albumes</a>
                            </li>
                            <li>
                                <a href="Comentarios.jsp"><i class="fa fa-comment fa-fw"></i>Comentarios</a>
                            </li>


                            <li>
                                <a href="#"><i class="fa fa-files-o fa-fw"></i>Salir<span class="fa arrow"></span></a>
                                <ul class="nav nav-second-level">
                                    <li>
                                        <a href="Index.jsp">Pagina princial</a>
                                    </li>
                                    <li>
                                        <a href="Login.">Cerrr sesión</a>
                                    </li>
                                </ul>
                                <!-- /.nav-second-level -->
                            </li>
                        </ul>
                    </div>
                    <!-- /.sidebar-collapse -->
                </div>
                <!-- /.navbar-static-side -->
            </nav>

            <div id="page-wrapper">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Agregar Exitos!!</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
                <div class="row">
                    <div class="col-lg-12">
                        <div class="panel panel-default">
                            <div class="panel-heading ">
                                Escriba la información sobre el nuevo EXITO!!
                            </div>
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <form method="GET" action='ServletExperiencia' name="frr">
                                            <font color="white"><h2>HISTORIAL</h2></font>
                                            <br>

                                            <table  width="400" border="2" align="center">
                                                <caption align="top">
                                                </caption>
                                                <tr>
                                                    <th width="84" scope="col"><strong><font >Nombre Experiencia</font></strong></th>
                                                    <th width="84" scope="col"><strong><font >Curso</font></strong></th>
                                                    <th width="84" scope="col"><strong><font >Aignatura</font></strong></th>
                                                    <th width="84" scope="col"><strong><font >Tema</font></strong></th>
                                                    <th width="84" scope="col"><strong><font >descripcion</font></strong></th>
                                                    <th width="84" scope="col"><strong><font >Nombre Usuario</font></strong></th>
                                                </tr>
                                                <%    if (request.getAttribute("experiencias") != null) {
                                                        ArrayList<Experiencia> esqq = (ArrayList<Experiencia>) request.getAttribute("experiencias");
                                      
                                       
                                                        for (Experiencia e : esqq) {;
                                                %>
                                                <tr>
                                                    <td><%= e.getNombreExp() %></td>
                                                    <td><%= e.getCurso()%></td>
                                                    <td><%= e.getAsignatura() %></td>

                                                    <td><%= e.getTema() %></td>
                                                    <td><%=e.getDescripcion()%></td>
                                                    <td><%=e.getIdUser().getNombreUser() %></td>
                                                </tr>
                                                <%
                                                        }
                                                    }
                                                %>
                                            </table>
                                            <input type="submit" VALUE ="HISTORIAL"/><br/>  

                                        </form>
                                    </div>
                                    <!-- /.col-lg-6 (nested) -->
                                    <div class="col-lg-6">

                                    </div>
                                    <!-- /.col-lg-6 (nested) -->
                                </div>
                                <!-- /.row (nested) -->
                            </div>
                            <!-- /.panel-body -->
                        </div>
                        <!-- /.panel -->
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /.row -->
            </div>
            <!-- /#page-wrapper -->

        </div>
        <!-- /#wrapper -->

        <!-- jQuery -->
        <script src="Style2/vendor/jquery/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="Style2/vendor/bootstrap/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="Style2/vendor/metisMenu/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="Style2/dist/js/sb-admin-2.js"></script>

    </body>

</html>
