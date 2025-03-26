<?php
	//Conecta con la base de datos ($conexión)
		include 'configdb.php'; //include del archivo con los datos de conexión
		$conexion = new mysqli(SERVIDOR, USUARIO, PASSWORD, BBDD); //Conecta con la base de datos
		$conexion->set_charset("utf8"); //Usa juego caracteres UTF8
		//Desactiva errores
		$controlador = new mysqli_driver();
		$controlador->report_mode = MYSQLI_REPORT_OFF;
		
	//Verificación
		$sql="SELECT idJesuita, nombre from jesuita
				where nombre='".$_POST["nombre"]."' AND codigo='".$_POST["codigo"]."';";
		// echo $sql;	
	//Ejecuta la consulta para verificar
		$resultado=$conexion->query($sql);
		if($resultado->num_rows==1){
			echo "<h2>Inicio realizado</h2>";
			echo '<h3><a href="elegirLugar.php">Elige tu lugar</a></h3>';}
		else{
			echo "<h2>La visita no se ha realizado</h2>";
			echo '<h3><a href="InicioSesion.html">Vuelve a intentarlo</a></h3>';
		}	
	/* Para inicio de sesión */
		session_start();
		$fila=$resultado->fetch_array();
		$_SESSION["idJesuita"]=$fila["idJesuita"];
		$_SESSION["nombre"]=$fila["nombre"];
		
	// Cierra la conexión
		$conexion->close();
?>