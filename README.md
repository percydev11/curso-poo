# Proyecto del curso

### Análisis de los objetos, clases y métodos de la aplicación Uber. 

Durante el curso se analizó la aplicación Uber,  se hizo la  extracción y definición de los objetos, clases y métodos que conforman la aplicación, se usó  UML para modelarla y  finalmente usando  Java se hizo la implementación de las clases y objetos de la aplicación.

##### ANÁLISIS  

Cuando un usuario  solicita  el servicio  se da un proceso que está dividido en  3 momentos o  pasos:

**1)** El usuario con su celular solicita el servicio, ya que tiene la necesidad de trasladarse de un punto a otro, debe especificar la ruta  que necesita recorrer.

**2)** La aplicación le muestra al usuario un catálogo de automóviles, de los cuales puede elegir según su necesidad (Se tienen 4 tipos de automóviles entre las opciones: 

- UberX
- UberPool
- UberBlack 
- UberVan 

Los tipos de automóvil UberX, UberPool y UberBlack, permiten el transporte de hasta 4 pasajeros, sin contar al conductor.

El tipo UberVan permite hasta 6 pasajeros sin contar al conductor. Y debe cumplir ciertas condiciones para 

Aquí también se muestra al conductor que maneja dicho automóvil.


**3) **El usuario aborda el automóvil   y realiza el viaje a la ruta definida desde un principio. Al terminar el recorrido el usuario realiza el pago por el viaje realizado.


##### OBJETOS QUE SE IDENTIFICAN DESPUÉS ANÁLISIS

**User:** Quien solicita el automóvil.

**Route:** Ruta desde un punto a otro.

**Car:**
UberX,
UberPool,
UberBlack,
UberVan.

**Driver:** Quien conduce el automóvil Uber.

**Payment:** Método de pago.
Card,
PayPal,
Cash.

**Trip:** Contiene los datos del viaje, tales como ruta, automóvil escogido, usuario que solicita el servicio, etc.

##### DIAGRAMA DE CLASES


El diagrama de clases realizado se encuentra incluido en el repositorio.