### Recorriendo Arrays, ArrayList y HashMap en Java

Cuando trabajamos con colecciones de datos en Java, es muy común tener que recorrer todos los elementos. Como ya conoces los bucles (for, while, for-each), ahora aprenderás la sintaxis en Java para recorrer:

- Arrays
- ArrayList
- HashMap

## 1. Arrays

Un array es una colección de elementos del mismo tipo, con tamaño fijo.

Ejemplo:
```java
int[] numeros = {10, 20, 30, 40};

//  Recorriendo con for tradicional
for (int i = 0; i < numeros.length; i++) {
        System.out.println("Elemento en posición " + i + ": " + numeros[i]);
}

//  Recorriendo con for-each
        for (int num : numeros) {
        System.out.println("Número: " + num);
}
```
## 2. ArrayList

Un ArrayList es como un array dinámico: puedes agregar o quitar elementos sin preocuparte por el tamaño.

Ejemplo:
```java
import java.util.ArrayList;

ArrayList<String> frutas = new ArrayList<>();
frutas.add("Manzana");
frutas.add("Banana");
frutas.add("Mango");

//  Recorriendo con for tradicional
for (int i = 0; i < frutas.size(); i++) {
        System.out.println("Fruta en posición " + i + ": " + frutas.get(i));
        }

//  Recorriendo con for-each
        for (String fruta : frutas) {
        System.out.println("Fruta: " + fruta);
}
```
## 3. HashMap

Un HashMap almacena datos en pares clave → valor.

Ejemplo:
```java
import java.util.HashMap;

HashMap<Integer, String> estudiantes = new HashMap<>();
estudiantes.put(1, "Ana");
estudiantes.put(2, "Luis");
estudiantes.put(3, "Maria");

// Recorriendo solo las claves
for (Integer clave : estudiantes.keySet()) {
    System.out.println("Clave: " + clave);
}

// Recorriendo solo los valores
for (String nombre : estudiantes.values()) {
    System.out.println("Nombre: " + nombre);
}

// Recorriendo clave → valor
for (var entry : estudiantes.entrySet()) {
    System.out.println("Clave: " + entry.getKey() + " → Valor: " + entry.getValue());
}
```

## Taller de práctica

Ahora que ya sabes cómo recorrer cada estructura, resuelve los siguientes ejercicios.

Arrays:

- Crea un array de 5 números enteros.
- Recorre el array con un for y muestra cada número multiplicado por 2.
- Luego crea un array sobre numeros con 6 posiciones de espacio y luego llenalo pidiendole al usuario
  por consola los numeros uno a uno

ArrayList:

- Crea un ArrayList<String> con al menos 4 nombres de tus compañeros.
- Recorre el ArrayList e imprime: "Hola, <nombre>".

HashMap:

- Crea un HashMap<Integer, String> que guarde el número de documento como clave y el nombre como valor.
- Recorre el mapa e imprime un mensaje así:

Documento: <clave> → Nombre: <valor>


## Ejercicios de bucles

1. Crea una aplicación que pida un número y calcule su factorial (El factorial de un número es el producto de todos los enteros entre 1 y el propio número y se representa por el número seguido de un signo de exclamación. Por ejemplo 5! = 1x2x3x4x5=120),

2. Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido,a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de intentos te muestra el número que había generado.

3. Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la media de todos los números introducidos.

4. Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a introducir). El programa debe informar de cuantos números introducidos son mayores que 0, menores que 0 e iguales a 0.

5. Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso contrario, el programa termina cuando se introduce un espacio.

6. Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario.

7. Realizar una algoritmo que muestre la tabla de multiplicar de un número introducido por teclado.

8. Escribe un programa que pida el limite inferior y superior de un intervalo. Si el límite inferior es mayor que el superior lo tiene que volver a pedir. A continuación se van introduciendo números hasta que introduzcamos el 0. Cuando termine el programa dará las siguientes informaciones:

   La suma de los números que están dentro del intervalo (intervalo abierto).
   Cuantos números están fuera del intervalo.
   He informa si hemos introducido algún número igual a los límites del intervalo.

9. Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador de potencia.

10. Algoritmo que muestre la tabla de multiplicar de los números 1,2,3,4 y 5.
