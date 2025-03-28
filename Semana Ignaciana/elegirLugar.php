<?php
	/* Para usar la sesión	*/
	session_start();
	
//Conecta con la base de datos ($conexión)
    include 'configdb.php'; //include del archivo con los datos de conexión
	$conexion = new mysqli(SERVIDOR, USUARIO, PASSWORD, BBDD); //Conecta con la base de datos
    $conexion->set_charset("utf8"); //Usa juego caracteres UTF8
	//Desactiva errores
	$controlador = new mysqli_driver();
    $controlador->report_mode = MYSQLI_REPORT_OFF;
//Cadena de caracteres de la consulta sql
	$sql="SELECT ip,lugar FROM maquinas;";
	$resultado=$conexion->query($sql);
?>
<!DOCTYPE html>
<html class="jesuitas">
	<head>
		<meta charset="UTF-8">
		<title>Visita</title>
		<meta name="author" content="Rubí Villalón Arranz">
		<meta name="description" content="1DAW"/>
		<link rel="stylesheet" type="text/css" href="Camino.css" />
		<link href="https://fonts.googleapis.com/css2?family=Bodoni+Moda+SC:wght@400;700&display=swap" rel="stylesheet">
	</head>
	<body class="jesuitas">
		<h1 class="jesuitas">HOLA, <?php echo $_SESSION["nombre"] ?>. ¿Dónde quieres ir?</h1>
		<form class="jesuitas" action="guardarVisita.php" method="POST">
			<div class="jesuitas">
				<label for="select_ciudades"></label>				
					<?php
						if($resultado->num_rows>0){
							echo '<select id="ciudades" class="visita" name="select_ciudades">';
							while($fila=$resultado->fetch_array()){
								echo '<option class="visita" value="'.$fila["ip"].'">'.$fila["lugar"].'</option>';													
							}
							echo '</select>';
							echo '<br><br>';
							echo '<input type="submit" value="Enviar"></input>';
						}
						else{
							echo "<h2>El jesuita o el código son incorrectos</h2>";
							echo '<br>';
							echo '<h3><a href="Jesuitas.html"> Vuelve a intentarlo</a></h3>';
						}
						// $_SESSION["ip"]=$fila["ip"];
						$conexion->close();
					?>		
			</div>
		</form>
	</body>
</html>