Conversor de Monedas — Proyecto en Java

Este proyecto es un pequeño conversor de monedas creado en Java.
El usuario selecciona una moneda base, una moneda destino y un monto a convertir.
El programa llama a una API externa para obtener las tasas de cambio actualizadas y realiza el cálculo.
***
Objetivos del proyecto

Practicar manejo de clases, record, objetos, JSON y Gson.

Usar la ExchangeRate API para obtener datos reales.

Manejar errores con try/catch para evitar que el programa termine abruptamente.

Aprender a controlar la interacción con el usuario mediante bucles y validaciones.

Estructura del proyecto
***
1. ApiConversor

Clase encargada de:

Construir la URL según la moneda elegida.

Hacer la solicitud HTTP.

Guardar el JSON recibido.
***
2. BaseJson / DatosMonedas

BaseJson representa el JSON completo.

DatosMonedas contiene solo las monedas usadas.

Se utilizan record para mapear los valores.
***
3. Conversor

Clase que:

Recibe las tasas.

Calcula el valor convertido según la moneda elegida.

4. Principal
***
Muestra el menú.

Pide opciones al usuario.

Valida las entradas con try/catch.

Ejecuta los bucles hasta que el usuario ingrese 0 o decida salir.
