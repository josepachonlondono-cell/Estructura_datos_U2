Nombre de la aplicación: Sistema de Fila para Carnet.

Descripción no técnica: sistema que organiza el turno de los estudiante que esperan su carnet universitario, Se atienda primero a quien llegó primero.

Descripción de la solución: Programa en java  que simula una fila de atención utilizando una estructura de datos secuencial con punteros de inicio y fin.

Estructura de datos seleccionada: Cola implementada mediante un vector.

Justificación técnica: Garantiza la regla FIFO similar a una fila de atención real. El uso del opeardor modulo nos permite reciclar los espacios vacíos del vector, logrando operaciones de inserción y eliminación eficientes .

Análisis de otra estructura: Implementar este sistema con una Pila resultaría en una rgla LIFO. El último estudiante en llegar sería atendido primero, causando un error lógico en la práctica y perjudicando a los primeros en la fila.

Instrucciones de ejecución: Compilar con javac ColaCarnet.java y ejecutar con java ColaCarnet.

Casos de prueba: Inserción y atención normal secuencial. Prueba de desbordamiento al superar el límite del vector. Prueba de subdesbordamiento al intentar extraer datos de un arreglo vacío.

Limitaciones y mejoras: La estructura tiene un tamaño máximo inmutable definido en tiempo de compilación. Se podría mejorar utilizando colecciones dinámicas de Java.

Enlace al video: https://drive.google.com/file/d/1os08SxBIAUPwkGZSN7i6NUEeP5nb_Mb8/view?usp=sharing

