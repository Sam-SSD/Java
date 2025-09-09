# Misión de Investigación: Exploradores de Datos en Java

## Objetivo
Descubrir cómo **acceder y manipular** tres estructuras muy usadas en Java:
- `Array`
- `ArrayList`
- `HashMap`

---

## Contexto
Imagina que eres un **explorador digital** que ha encontrado tres cofres mágicos  en una mazmorra de programación:
- El **Cofre de Array**  → guarda elementos ordenados en posiciones fijas.
- El **Cofre de ArrayList**  → una mochila mágica que se expande para guardar más cosas.
- El **Cofre de HashMap**  → un mapa secreto con **claves** y **tesoros** (valores).

Tu misión es **investigar cómo abrir cada cofre** y obtener sus tesoros.

---

## 1. Array – El Cofre Ordenado
### Pista
- Los elementos están guardados en **celdas numeradas** que comienzan desde el **índice 0**.
- Para entrar a una celda, usas **corchetes `[]`** con el número de índice.

### Reto
1. Declara un `Array` de 5 enteros con tus números favoritos.
2. Accede al primer y al último número.
3. Cambia el valor de la posición 2 y vuelve a mostrarlo.

---

## 2. ArrayList – La Mochila Mágica
### Pista
- No tiene límite fijo, **se agranda sola** cuando agregas más cosas.
- Usa el método `.add()` para guardar, `.get()` para sacar y `.remove()` para eliminar.

### Reto
1. Crea un `ArrayList<String>` llamado `mochila`.
2. Guarda 3 objetos que llevarías a una aventura (ej: "Espada", "Mapa", "Poción").
3. Muestra el segundo objeto usando `.get(1)`.
4. Quita un objeto con `.remove()` y muestra la mochila actualizada.

---

## 3. HashMap – El Mapa del Tesoro
### Pista
- Cada tesoro se guarda con una **clave**.
- Para guardar usas `.put(clave, valor)`.
- Para buscar un tesoro, usas `.get(clave)`.

### Reto
1. Crea un `HashMap<String, Integer>` llamado `tesoros`.
2. Guarda 3 pares clave-valor: ("Oro", 100), ("Plata", 50), ("Diamantes", 5).
3. Muestra cuántos diamantes tienes usando la clave `"Diamantes"`.
4. Actualiza el valor de `"Oro"` a 200 y vuelve a imprimirlo.

---

## 4. Desafío Final
Con lo que investigaste:
1. Usa un `Array` para guardar **3 códigos secretos** (ej: 123, 456, 789).
2. Usa un `ArrayList` para guardar los nombres de **3 exploradores**.
3. Usa un `HashMap` para asignar a cada explorador la cantidad de oro que encontró.
4. Muestra el explorador con más oro.

---

Con esta misión, aprenderás a **acceder y manipular** `Array`, `ArrayList` y `HashMap` mientras juegas a ser un explorador de datos en Java.