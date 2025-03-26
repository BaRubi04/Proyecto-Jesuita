<?php
	session_start();
	
//Conecta con la base de datos ($conexión)
    include 'configdb.php'; //include del archivo con los datos de conexión
	$conexion = new mysqli(SERVIDOR, USUARIO, PASSWORD, BBDD); //Conecta con la base de datos
    $conexion->set_charset("utf8"); //Usa juego caracteres UTF8
	//Desactiva errores
	$controlador = new mysqli_driver();
    $controlador->report_mode = MYSQLI_REPORT_OFF;
	$ciudad=$_POST["select_ciudades"];
?>
<!DOCTYPE html>
<html class="jesuitas">
	<head>
		<meta charset="UTF-8">
		<title>Ciudad</title>
		<meta name="author" content="Rubí Villalón Arranz">
		<meta name="description" content="1DAW"/>
		<link rel="stylesheet" type="text/css" href="Camino.css" />
	</head>
	<body class="jesuitas">
		<form action="" method="POST">
			<h1 class="centrado">Bienvenido a <?php echo $ciudad; ?></h1>
		</form>
	</body>
</html>