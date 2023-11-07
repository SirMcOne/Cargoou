<%-- 
    Document   : index
    Created on : 3 oct. 2023, 17:40:28
    Author     : user
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>CarGoou | Acceso</title>

  <!-- Google Font: Source Sans Pro -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700&display=fallback">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
  <!-- icheck bootstrap -->
  <link rel="stylesheet" href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/adminlte.min.css">
</head>
<body class="hold-transition lockscreen">
<!-- Automatic element centering -->
<div class="lockscreen-wrapper">
  <div class="lockscreen-logo">
    <a href="#"><b>Car</b>Goou</a>
  </div>
  <!-- User name -->
  <div class="lockscreen-name">Bus A001</div>

  <!-- START LOCK SCREEN ITEM -->
  <div class="lockscreen-item">
    <!-- lockscreen image -->
    <input id="text" type="hidden" value="A001:05" /><br />
    <div id="qrcode" style="width:100px; height:100px; margin:auto;"></div>
    <br>
    <!-- /.lockscreen-image -->

    <!-- lockscreen credentials (contains the form) -->

    <!-- /.lockscreen credentials -->
</div>
  
  <!-- /.lockscreen-item -->
  <div class="help-block text-center">
    Escanee el QR para pagar
  </div>
  <div class="text-center">
    <a href="login.jsp">O inicie sesión</a>
  </div>
  <div class="lockscreen-footer text-center">
    Copyright &copy; 2023 <b><a href="#" class="text-black">.</a></b><br>
    Santa Catalina SA
  </div>
</div>
<!-- /.center -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="plugins/qrcodejs/qrcode.js"></script>
<script type="text/javascript">
var qrcode = new QRCode(document.getElementById("qrcode"), {
	width : 100,
	height : 100
});

function makeCode () {		
	var elText = document.getElementById("text");
	
	if (!elText.value) {
		alert("Input a text");
		elText.focus();
		return;
	}
	
	qrcode.makeCode(elText.value);
}

makeCode();

$("#text").
	on("blur", function () {
		makeCode();
	}).
	on("keydown", function (e) {
		if (e.keyCode == 13) {
			makeCode();
		}
	});
</script>
</body>
</html>