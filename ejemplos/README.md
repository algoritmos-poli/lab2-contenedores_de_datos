# Práctica de Laboratorio: Estructuras de Datos Estáticas - Arrays en Java

## 1. Introducción

El presente documento constituye una guía de laboratorio para el estudio y la aplicación de arrays, una de las estructuras de datos fundamentales en la programación orientada a objetos con Java. El objetivo es analizar su declaración, inicialización, manipulación y los algoritmos de recorrido asociados, sentando las bases para el manejo de colecciones de datos de tamaño fijo.

## 2. Objetivos de Aprendizaje

Al completar esta práctica, el estudiante estará en capacidad de:

* Implementar la declaración e inicialización de arrays unidimensionales para tipos de datos primitivos y objetos.
* Aplicar algoritmos de recorrido (iteración) sobre los elementos de un array utilizando ciclos `for` y `for-each`.
* Desarrollar lógica de asignación de datos en arrays mediante el uso de estructuras de control condicionales.
* Utilizar la clase `Arrays` del API de Java para optimizar operaciones de manipulación de datos.
* Analizar y depurar la lógica de algoritmos que operan sobre arrays.

## 3. Fundamento Teórico

Un **array** (o arreglo) es una estructura de datos que almacena una colección de elementos de **tipo homogéneo** en una secuencia de **memoria contigua**. Sus características principales son:

* **Tamaño Fijo (Estático):** La dimensión del array se define en el momento de su creación y no puede ser modificada posteriormente.
* **Acceso Indexado:** Cada elemento ocupa una posición única identificada por un índice numérico entero, que comienza en `0`. El acceso a cualquier elemento a través de su índice es una operación de tiempo constante, **O(1)**.
* **Almacenamiento:** Puede contener tanto tipos de datos primitivos (`int`, `double`, `char`) como referencias a objetos (`String`, u objetos de clases personalizadas).

**To Do:** 
- [ ] Agregar links para profundizar....


## 4. Requisitos Previos

* **Software:**
    * Java Development Kit (JDK), versión 8 o superior.
    * Un Entorno de Desarrollo Integrado (IDE) como IntelliJ IDEA, Eclipse o Visual Studio Code.
* **Conocimientos:**
    * Sintaxis básica de Java: variables, tipos de datos y operadores.
    * Estructuras de control: condicionales (`if-else`), `switch` y bucles (`for`).

## 5. Configuración del Entorno de Desarrollo

1.  Clone o descargue el repositorio y ábralo como un proyecto en su IDE.
2.  Si lo anterior no es posible, cree un nuevo proyecto Java y copie los archivos `.java` en el directorio fuente (`src`).
3.  Verifique que la declaración de paquete (`package ejemplos;`) sea consistente con la estructura de directorios del proyecto.

---

## 6. Procedimiento Práctico

Ejecute y analice los siguientes casos de estudio para observar diferentes técnicas de manipulación de arrays.

### 6.1. [`Ejemplo1.java`](Example1.java): Inicialización Explícita

* **Objetivo:** Observar la inicialización de arrays con valores predefinidos.
* **Acción:** Ejecute el código y verifique que la salida en consola muestra el contenido de los arrays `daysOfWeek` y `monthsOfYear`, recorridos mediante un ciclo `for-each`.

### 6.2.[`Example2.java`](Example2.java): Asignación por Algoritmo

* **Objetivo:** Analizar la asignación de datos a un array vacío mediante un algoritmo iterativo.
* **Acción:** Ejecute el código. Compruebe cómo el primer ciclo `for` utiliza un índice `i` y lógica condicional para poblar el array `seats`. El segundo ciclo usa el mismo índice para generar una salida formateada y legible.

### 6.3. [`Ejemplo3.java`](Example3.java): Asignación Eficiente y Depuración

* **Objetivo:** Comparar la asignación manual con el método `Arrays.fill()` y analizar un error lógico común.
* **Acción:** Ejecute el código. Observe cómo `Arrays.fill()` simplifica la asignación de datos. **Compare la salida con la de `Example2`** y proceda a la pregunta 4 del cuestionario para analizar y depurar la discrepancia en los resultados.

---

## 7. Cuestionario de Análisis

Responda las siguientes preguntas para validar la asimilación de los conceptos.

1.  Defina un array en términos de su tipo de almacenamiento, dimensionalidad y mutabilidad de tamaño.
2.  Compare la inicialización literal (`daysOfWeek`) con la inicialización anónima (`monthsOfYear`) en `Ejemplo1.java`. ¿Existe alguna ventaja práctica de una sobre la otra?
3.  Explique las ventajas en términos de mantenibilidad y rendimiento del uso de `Arrays.fill()` sobre un algoritmo de asignación iterativo manual como el de `Example2`.
4.  **Análisis Crítico:** Al comparar la salida de `Example2` y `Example3`, notará que los números de asiento impresos por `Ejemplo3` son incorrectos (ej. "Seat 2: Balcony", "Seat 3: Premium").
    * ¿Cuál es la causa de este error lógico en el bucle `for-each` de `Ejemplo3`?
    * ¿Por qué el bucle `for` con índice de `Example2` produce el resultado correcto?
    * ¿Cómo modificaría el bucle de `Ejemplo3` para corregir la salida sin dejar de usar un `for-each`? (Pista: necesitará una variable externa).
5.  **Ejercicio de Implementación:** Modifique la clase `Ejemplo1.java` para declarar e inicializar un array de tipo `double` que contenga 5 calificaciones numéricas. Posteriormente, implemente un algoritmo que recorra el array para calcular y mostrar el promedio de dichas calificaciones.

## 8. Desafío: Inicializando y manipulando arrays en Java

Crea un programa de Java que inicialice dinámicamente un array para mostrar el número de días en cada mes de un año no bisiesto (con febrero teniendo 28 días). El programa debería luego imprimir el número de días en cada mes y el nombre del mes correspondiente.

### Instrucciones

Completa estos pasos para finalizar el desafío:
1. Crea una clase pública de Java llamada `Main` con un método `main`.
2. Declara un array de enteros `daysInMonth` con un tamaño de 12.
3. Inicializa el array `daysInMonth` con el número de días para cada mes.
4. Declara e inicializa un array de String `monthNames` con los nombres de los meses.
5. Usa un bucle for para iterar a través de `daysInMonth`
6. Selecciona Ejecutar para ver la salida.
7. Examina la salida.

Use el codigo que se muestra a continuación para escribir su código:

```java
public class Main {
    public static void main(String[] arg) {
        int[] daysInMonth = new int[12];
        for(int i = 0; i < daysInMonth.length; i++) {
            if(i == 1) {
                daysInMonth[i] = 28;
            }
            else if (i == 3 | i == 5 | i == 8 | i == 10) {
                daysInMonth[i] = 30;
            }
            else {
                daysInMonth[i] = 31;
            }
        }
        String[] monthNames =  new String[ ]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i = 0; i < daysInMonth.length; i++) {
            System.out.println(monthNames[i] + ": " + daysInMonth[i] + " days");
        }
    }
}
```

### Salida esperada

La siguiente salida refleja la salida deseada para el desafío.

```
Jan: 31 days
Feb: 28 days
Mar: 31 days
Apr: 30 days
May: 31 days
Jun: 30 days
Jul: 31 days
Aug: 31 days
Sep: 30 days
Oct: 31 days
Nov: 30 days
Dec: 31 days
```

### Prácticas recomendadas para la codificación

Si no obtuvo el resultado esperado, dedique tiempo a la depuración de su código. La aparición de errores es una ocurrencia común para todos, incluyendo a los desarrolladores de software más experimentados. La resolución de estos es una parte integral del trabajo.

Si encontró dificultades, se recomienda considerar lo siguiente:
* **Analice detenidamente los mensajes de error**: los mensajes de error de Java son descriptivos y lo dirigirán al número de línea y al tipo de error específico. Intente corregirlo mediante un proceso de prueba y error.
* **Verifique la existencia de errores comunes**:
  * **Errores de sintaxis**: Asegúrese de que todas las llaves `{}`, corchetes `[]`, puntos y comas `;`, y paréntesis `()` estén posicionados correctamente.
  * **Inicialización de variables**: Verifique que cada variable haya sido inicializada antes de su utilización.
  * **Tipos de datos**: Compruebe que todos los tipos de datos sean correctos y compatibles, especialmente al realizar operaciones.

Dedique un momento a reflexionar sobre el desafío completado, planteándose las siguientes preguntas:
* ¿En qué áreas se presentaron dificultades y cuál fue la causa?
* ¿Qué metodología aplicó para la depuración de errores (si los hubo)?
* ¿Qué conocimientos o lecciones ha adquirido para futuras implementaciones?


## 9. Anexo: Comparativa de Estructuras de Datos Lineales

| Característica | Array | ArrayList |
| :--- | :--- | :--- |
| **Tamaño** | **Estático**. Definido en la compilación/creación. | **Dinámico**. Se ajusta en tiempo de ejecución. |
| **Tipo de Datos** | Primitivos (`int`) y Objetos (`String`). | Solo Objetos y sus wrappers (`Integer`, `String`). |
| **Rendimiento** | Acceso directo **O(1)**. Alto rendimiento. | Acceso **O(1)**, pero con sobrecarga. Inserciones/eliminaciones pueden ser **O(n)**. |
| **API** | Limitada (propiedad `length`). | API rica en métodos (`add`, `remove`, `size`, `contains`). |