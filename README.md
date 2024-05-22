# Pokémon Battle Game

Este es un sencillo juego de batalla de Pokémon desarrollado en Java. El proyecto demuestra el uso de interfaces y clases abstractas para la implementación de las mecánicas del juego.

## Características

- Utilización de interfaces para definir comportamientos comunes.
- Implementación de clases abstractas para representar a los Pokémon.
- Diferentes tipos de Pokémon con ataques específicos.
- Mecánica de batalla básica.

## Descripción General

### Interfaces

El proyecto incluye interfaces que definen comportamientos esenciales para los Pokémon. Por ejemplo, hay una interfaz para las acciones de ataque (`Attackable`) y otra para las acciones de defensa (`Defendable`).

### Clases Abstractas

La clase abstracta principal (`Pokemon`) proporciona una plantilla para todos los tipos de Pokémon. Esta clase incluye atributos y métodos comunes como nombre, salud, métodos de ataque y defensa. Las subclases concretas de Pokémon (por ejemplo, `FirePokemon`, `WaterPokemon`, `GrassPokemon`) extienden esta clase abstracta y pueden agregar comportamientos específicos.

### Tipos de Pokémon

Existen diferentes tipos de Pokémon en el juego, cada uno con sus propias características y ataques específicos:

- **FirePokemon**: Pokémon de tipo fuego con ataques de fuego.
- **WaterPokemon**: Pokémon de tipo agua con ataques de agua.
- **GrassPokemon**: Pokémon de tipo planta con ataques de planta.

### Mecánica de Batalla

La mecánica de batalla básica permite a los Pokémon enfrentarse entre sí utilizando sus ataques y defensas. Los jugadores pueden seleccionar su Pokémon y ejecutar ataques contra sus oponentes hasta que uno de ellos gane la batalla.

## Cómo Ejecutar el Juego

Para ejecutar el juego, simplemente compila y ejecuta la clase principal del proyecto (`Main`). Asegúrate de tener todas las dependencias y archivos necesarios en su lugar.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el juego o añadir nuevas características, no dudes en abrir un pull request o una issue en el repositorio.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.

