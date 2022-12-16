#language: es

Característica: Validar nombre del producto en la pagina que contiene su descripción

  @VerificarProducto

  Escenario: Validar nombre del producto en la pagina que continene su descripcion exitosamente

    Dado Que me encuentro en la pagina principal de https://corona.co/

    Cuando hago clic el cuarto producto

    Entonces Reviso que el producto sea el mismo