# Conversor de Temperaturas

## Descripción

Aplicación de consola desarrollada en Java que permite convertir una temperatura ingresada por el usuario entre **Celsius, Fahrenheit y Kelvin**.

El programa recibe una temperatura de origen, realiza las conversiones correspondientes y devuelve los tres resultados mediante un objeto `ResultadoTemperatura`.

## Objetivo

Practicar los fundamentos de programación orientada a objetos en Java mediante el desarrollo de una aplicación funcional.

El proyecto permite trabajar con:

- Clases y objetos.
- Constructores.
- Encapsulamiento.
- Métodos.
- Getters y setters.
- Listas de objetos.
- Uso de `Scanner`.
- Estructuras condicionales.
- Separación de responsabilidades entre clases.
- Creación de objetos para representar resultados.

## Funcionalidades

- Seleccionar la unidad de temperatura de origen:
    - Celsius (°C)
    - Fahrenheit (°F)
    - Kelvin (K)
- Ingresar el valor de la temperatura.
- Convertir automáticamente la temperatura a las tres unidades.
- Mostrar los resultados de Celsius, Fahrenheit y Kelvin.
- Utilizar un único método de conversión que devuelve un objeto `ResultadoTemperatura`.

### Conversiones implementadas

- Celsius → Fahrenheit
- Celsius → Kelvin
- Fahrenheit → Celsius
- Fahrenheit → Kelvin
- Kelvin → Celsius
- Kelvin → Fahrenheit

## Tecnologías

- Java 21
- Eclipse Temurin JDK 21
- IntelliJ IDEA
- Git
- GitHub

## Estructura del proyecto

```text
ConversorTemperaturas/
│
├── src/
│   ├── Main.java
│   ├── Temperatura.java
│   ├── CatalogoTemperaturas.java
│   ├── ConversorTemperaturas.java
│   └── ResultadoTemperatura.java
│
└── README.md
```

### Descripción de las clases

**Main.java**  
Controla la interacción con el usuario, recibe la unidad y el valor de temperatura y muestra los resultados.

**Temperatura.java**  
Representa una temperatura mediante su nombre, código y valor.

**CatalogoTemperaturas.java**  
Contiene las unidades de temperatura disponibles y permite buscarlas mediante su código.

**ConversorTemperaturas.java**  
Contiene la lógica de conversión y calcula los resultados para las tres unidades.

**ResultadoTemperatura.java**  
Representa el resultado de la conversión y contiene los valores de Celsius, Fahrenheit y Kelvin.

## Ejecución

1. Clonar el repositorio.
2. Abrir el proyecto en IntelliJ IDEA.
3. Verificar que esté configurado Java 21.
4. Ejecutar la clase `Main`.
5. Seleccionar la unidad de temperatura.
6. Introducir el valor a convertir.

## Ejemplo de uso

```text
Selecciona la temperatura que desea calcular:
1. Celsius
2. Fahrenheit
3. Kelvin

1

Cantidad:
25

Celsius: 25.0
Fahrenheit: 77.0
Kelvin: 298.15
```

También es posible introducir la misma temperatura utilizando otra unidad:

```text
77 °F
```

Resultado:

```text
Celsius: 25.0
Fahrenheit: 77.0
Kelvin: 298.15
```

O:

```text
298.15 K
```

Resultado:

```text
Celsius: 25.0
Fahrenheit: 77.0
Kelvin: 298.15
```

## Autor

Carolina Neri


