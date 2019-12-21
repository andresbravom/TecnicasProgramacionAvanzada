# Observer

El patrón Observer define una dependencia del tipo uno a muchos entre distintos objetos. Cuando un objeto cambia de estado, se notifica el cambio a los objetos que dependen de él. El patrón Observer se aplica en la arquitectura MVC(Model-View-Controller).

La interfaz Subject declara métodos para añadir y eliminar observadores, así como para notificarles cuando se produce un cambio en su estado.

La interfaz Observer declara métodos para actualizar el estado de los observadores.

La clase Estacion Meteorologica implementa Subject. Notifica a los observadores registrados cuando se produce un cambio en su estado.

La clase Pantalla implementa Observer. Los objetos de esta clase son informados de los cambios de estado de la clase EstacionMeteorologica.

