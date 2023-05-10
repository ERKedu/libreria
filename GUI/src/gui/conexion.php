<?php

// Conexión a la base de datos
$servidor = "fdb1030.awardspace.net";
$usuario = "4283659_aplicacion";
$password = "Temporal123-";
$basedatos = "4283659_aplicacion";

$myCon = mysqli_connect($servidor, $usuario, $password, $basedatos);
// Check connection
if ($myCon->connect_error) {
    die("LA CONEXION HA LA BASE DE DATOS HA FALLADO: " . $myCon->connect_error);
}
?>