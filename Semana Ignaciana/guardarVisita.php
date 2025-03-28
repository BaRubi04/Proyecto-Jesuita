<?php

//Conecta con la base de datos ($conexión)
	session_start();
    include 'configdb.php'; //include del archivo con los datos de conexión
	$conexion = new mysqli(SERVIDOR, USUARIO, PASSWORD, BBDD); //Conecta con la base de datos
    $conexion->set_charset("utf8"); //Usa juego caracteres UTF8
	//Desactiva errores
	$controlador = new mysqli_driver();
    $controlador->report_mode = MYSQLI_REPORT_OFF;
	
	 $idJesuita=$_SESSION["idJesuita"];
	 $_SESSION["ip"]=$ip=$_POST["select_ciudades"];
	
//Cadena de caracteres de la consulta sql	
	$sql="INSERT INTO visitas(idjesuita,ip) VALUES(".$idJesuita.",'".$ip."');";
	// echo $sql;
	
//Ejecuta la consulta
	 $conexion->query($sql);
		if($conexion->affected_rows>0){
			echo "<h2>Visita realizada</h2>";
			echo '<h3><a href="Ciudad.php">Contempla tu lugar</a></h3>';}
		else{
			echo "<h2>La visita no se ha realizado</h2>";
			echo '<h3><a href="elegirLugar.php">Vuelve a intentarlo</a></h3>';
		}
// //Cierra la conexión
	 $conexion->close();
?>