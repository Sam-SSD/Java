#  Ejercicio: Cotizador Simple – FitPro Gym

## Objetivo
Aplicar **variables**, **operadores** y **condicionales** en un caso realista de cotización de membresías.

---

## Entradas (con `Scanner`)
1. `String nombre`
2. `int edad`
3. `double altura` (en metros)
4. `double peso` (en kg)
5. `String plan` (`BASICO`, `PLUS`, `PREMIUM`)
6. `boolean primeraVez`

---

## Reglas de negocio

1. **Precio base del plan (mensual)**
    - `BASICO` → 80.0
    - `PLUS` → 120.0
    - `PREMIUM` → 180.0

2. **Descuentos**
    - Primera vez → 10%
    - Joven (16–25 años) → 10%
    - El total de descuentos no puede superar el **20%**.

3. **Edad mínima**
    - Si es menor de 14 → mostrar ` No elegible`.
    - Si es menor de 18 → mostrar ` Requiere autorización de acudiente`.

4. **Cálculo de BMI**
    - `bmi = peso / (altura * altura)`
    - Solo imprimir la categoría:
        - `<18.5` → Bajo peso
        - `18.5–24.9` → Normal
        - `25–29.9` → Sobrepeso
        - `>=30` → Obesidad

5. **Resultado final**
    - Mostrar **nombre**, **plan elegido**, **precio base**, **descuento aplicado**, **precio final** y **categoría de BMI**.

---


