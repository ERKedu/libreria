<?php

$resultado = mysqli_query($conexion, "SELECT * FROM users");

while ($fila = mysqli_fetch_array($resultado)) {
    if($fila['usuario'] AND $fila['contraseña']) {
        echo "Iniciado";
    }
}


?>