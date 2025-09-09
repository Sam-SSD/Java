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

// 🔹 Recorriendo con for tradicional
for (int i = 0; i < frutas.size(); i++) {
    System.out.println("Fruta en posición " + i + ": " + frutas.get(i));
}

// 🔹 Recorriendo con for-each
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

- Documento: <clave> → Nombre: <valor>

