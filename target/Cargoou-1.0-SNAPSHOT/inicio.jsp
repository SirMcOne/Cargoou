<%-- 
    Document   : index
    Created on : 3 oct. 2023, 18:25:25
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html lang="es">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>CarGoou | Inicio</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/adminlte.min.css">
</head>
<body class="hold-transition sidebar-mini">
<div class="wrapper">

  <!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-white navbar-light">
    <!-- Left navbar links -->
    <%@include file="WEB-INF/jspf/encabezado.jspf" %>
  </nav>
  <!-- /.navbar -->

  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <%@include file="WEB-INF/jspf/logo.jspf" %>


      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          
          <li class="nav-item">
            <a href="tablero.jsp" class="nav-link">
              <i class="nav-icon fas fa-tachometer-alt"></i>
              <p>
                Tablero
                
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-th"></i>
              <p>
                Registro
                <i class="right fas fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="bus" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Bus</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="ruta.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Ruta</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="conductor.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Conductor</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="horario.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Horario</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="viaje.jsp" class="nav-link">
                  <i class="far fa-circle nav-icon"></i>
                  <p>Viaje</p>
                </a>
              </li>
            </ul>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-file-alt"></i>
              <p>
                Reportes
              </p>
            </a>
          </li>
          <li class="nav-item">
            <a href="#" class="nav-link">
              <i class="nav-icon fas fa-envelope"></i>
              <p>
                Mensajes
                <span class="right badge badge-danger">2</span>
              </p>
            </a>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0">Inicio</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item active">Inicio</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->
    <div class="content">
      <div class="container-fluid">
        <div class="row">
          <div class="col-lg-6">
            <div class="card">
              <div class="card-header">
                <h5 class="m-0">Bienvenido</h5>
              </div>
              <div class="card-body">
                <h6 class="card-title">Actualiza tus datos.</h6>

                <p class="card-text">Para empezar te aconsejamos cambiar tus datos y contraseña.</p>
                <a href="#" class="btn btn-primary">Ir</a>
              </div>
            </div>

          </div>
          <!-- /.col-md-6 -->
                    <div class="col-lg-6">
            <div class="card">
              <div class="card-body">
                <h5 class="card-title">Configura</h5>

                <p class="card-text">
                  En la parte lateral encontraras un menu totalemente dinamico e intuitivo.
                </p>

                <a href="#" class="card-link">Tablero</a>
                <a href="#" class="card-link">Reportes</a>
              </div>
            </div>

            <!-- /.card -->
          </div>
          <!-- /.col-md-6 -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
    <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
    <div class="p-3">
      <h5>Title</h5>
      <p>Sidebar content</p>
    </div>
  </aside>
  <!-- /.control-sidebar -->
  <%@include file="WEB-INF/jspf/footer.jspf" %>
</div>
<!-- ./wrapper -->

<!-- REQUIRED SCRIPTS -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>
</body>
</html>
