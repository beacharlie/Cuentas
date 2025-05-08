<h1>Tarea para ED03: test y TDD</h1>

Tenemos el siguiente enunciado:

Tu tarea consiste en crear una función que tome cualquier entero no negativo como argumento y lo devuelva con sus dígitos en orden descendente. Básicamente, reorganiza los dígitos para obtener el mayor número posible.

Ejemplos:

Entrada: 42145 Salida: 54421

Entrada: 145263 Salida: 654321

Entrada: 123456789 Salida: 987654321
a) Investiga lo que es el TDD, como aproximación básica vamos a escribir primero los test siguiendo esta filosofía y esta estructura, ten en cuenta que los valores en el ejemplo no son los correctos: 

import org.junit.Test;

import static org.junit.Assert.assertEquals;

b)Investiga qué es el assertEquals y si hay más tipos de assert.

c) He puesto unos ejemplos, hay algún valor límite que sea interesante comprobar?

d) Ahora escribe el código para que cumpla los tests diseñados anteriormente. 

# <ins>Reordenar Dígitos Descendentemente</ins>

## <ins>Enunciado del Problema</ins>

Tu tarea consiste en crear una función que tome cualquier entero no negativo como argumento y lo devuelva con sus dígitos en orden descendente. Básicamente, reorganiza los dígitos para obtener el mayor número posible.

<br>

## <a>a)</a> <ins>Desarrollo Guiado por Pruebas (TDD)</ins>

El Desarrollo Guiado por Pruebas (TDD) es una metodología de desarrollo de software que se basa en un ciclo corto y repetitivo de los siguientes pasos:

1.  **<mark>Red (Roja)</mark>:** Escribir una prueba (test) fallida para una pequeña parte de la funcionalidad.
2.  **<mark>Green (Verde)</mark>:** Escribir la menor cantidad de código posible para que la prueba pase.
3.  **<mark>Refactor (Refactorizar)</mark>:** Mejorar el código sin alterar su comportamiento externo.

