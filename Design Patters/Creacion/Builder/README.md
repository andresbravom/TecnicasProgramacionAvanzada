# Builder

EL patrón Builder evita la sobrecarga de métodos constructores

La clase UsuarioSinBuilder es un ejemplo de una clase con métodos constructores sobrecargados en la que se puede aplicar el patrón Builder

Dentro de la clase Usuario se declara una clase estática anidada (static inner class). Esta nueva clase, UsuarioBuilder, realiza las funciones de instanciación de los objetos. El uso de clases anidadas permite agrupar y encapsular clases. La clase anidada UsuarioBuilder es un miembro de la clase externa y se puede declarar private, publico protected

