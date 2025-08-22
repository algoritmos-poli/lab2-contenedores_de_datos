# Laboratorio 2 - Arreglos

## Introducción

Manipular y crear arrays de objetos es una habilidad crucial para cualquier desarrollador de software, especialmente al tratar con conjuntos de datos complejos. En muchas aplicaciones del mundo real, necesitará gestionar colecciones de objetos relacionados de manera eficiente.

Este laboratorio le permitirá poner en práctica el conocimiento que ha adquirido al guiarlo a través de la creación y manipulación de arrays de objetos.

> [!TIP] 
> Un *array de objetos* se refiere a una colección de datos en un array donde cada elemento es un objeto de una clase específica. Esto significa que estos arrays pueden almacenar múltiples instancias de una clase.

Imagine que está desarrollando un sistema de gestión de registros de estudiantes para una universidad. Organizar, acceder y manipular los datos de los estudiantes es esencial para mantener registros precisos y actualizados, tales como los resultados de los exámenes. La universidad está lanzando una nueva plataforma para gestionar los registros de estudiantes de manera eficiente.

Dispone de los siguientes datos:
* **Un array** `Students[]` con un tamaño de 5 en la clase `Main.java`
* **Atributos**: `rollNumber`, `name`, `age` en la clase `Student`

## Objetivo

> ¿Puede construir la funcionalidad central del sistema de gestión de registros de estudiantes, comenzando con la organización de los registros a partir de una muestra de datos de estudiantes? Usted creará objetos de diferentes clases, poblará un array almacenando objetos en él y realizará operaciones sobre ellos

## Instrucciones

### Tarea 1 - Modifique la clase `Main.java` 

En la carpeta src se encuentra una clase llamada `Main.java`. Usted utilizará esta la clase `Main.java` para escribir los métodos principales y actualizar el array relacionado con el código, que es la operación esencial que utiliza la clase `Student`.

Abra el código de inicio desde la carpeta `src`, en el cual encontrará la siguiente configuración:
* La clase `Student` que incluye los atributos, el constructor y los métodos getter/setter. Adicionalmente, encontrará la clase `Main` con una estructura de método predefinida.

Empieze la codificación siguiendo las siguientes instrucciones.
* Utilice un array predefinido llamado `students` que puede contener 5 objetos de estudiante.
* **TODO 1**: cree los otros 4 objetos de la clase `student` y asígnelos al array de `Students`.
* **TODO 2**: descomente la llamada al método una vez que haya completado las tareas mencionadas.

```java
Class Main{
    public static void main(String args[]){
    // TODO 1: create other 4 objects of the student class and assign them to the array Students
    // TODO 2: uncomment the method call once you have completed the mentioned tasks

    }
}
```

> [!WARNING]
> **Recordatorio**: En el constructor, debe pasar los valores en el mismo orden definido en la clase.

### Tarea 2 - Removiendo un elemento

Considere una situación en la que un estudiante se ha graduado o ha sido transferido a otra universidad, y necesita eliminar su registro del sistema de gestión de estudiantes. Gestionar eficientemente los registros de los estudiantes, incluyendo la capacidad de eliminar entradas obsoletas o irrelevantes, es crucial para mantener la integridad de la base de datos.

En esta tarea, usted escribirá la lógica para eliminar un estudiante del array de registros de estudiantes. Esto implica crear un nuevo array con un tamaño una unidad menor que el array original y copiar todos los elementos excepto aquel que necesita ser eliminado.

Utilice el método predefinido `removeElement` en la clase `Main.java`.
* **TODO 3**: cree un nuevo array con una longitud una unidad menor que la del existente. Por ejemplo, si su array existente es `students`, el tamaño del nuevo array será `students.length - 1`.
* **TAREA 4**: utilice un bucle `for` para copiar todos los elementos del array existente al nuevo array, a excepción del elemento en el índice que desea eliminar.
* **TAREA 5**: si es necesario, reasigne el nuevo array a su variable de array original.
* **TAREA 6**: llame al método `printArray` y pase **"Remove"** y el nuevo array como argumentos.
  
```java
Class Main{
    public static void removeElement(int indexToDelete, Student[] originalArray){
        // TODO 3: create a new array with a length less than the existing one
        //TODO 4: use a for loop to copy all elements from the existing array to the new array
        //TODOs continue
    }
}
```

#### Punto de reflexión

Esta es una posible solución para eliminar un elemento. ¿Qué otras maneras existen?

> [!TIP]
> A diferencia de la modificación, la eliminación afecta el tamaño del array, ya que los arrays no son redimensionables dinámicamente. En lugar de '-1', ¿qué podría hacer usted?

### Tarea 3 - Agregar un nuevo elemento

Suponga que un nuevo estudiante se ha matriculado en la universidad y necesita añadir su registro al sistema de gestión de estudiantes. Esta tarea implica expandir el array actual para alojar el nuevo registro de estudiante y asegurar que los datos se inserten correctamente en el array.

En esta tarea, usted escribirá la lógica para añadir un nuevo estudiante al array de registros de estudiantes. Esto implica crear un nuevo array con un tamaño una unidad mayor que el array original y copiar todos los elementos al nuevo array antes de añadir el nuevo objeto de estudiante.

Utilice el método predefinido `addElement` en la clase `Main.java`.
* **TODO 7**: defina un nuevo array con una longitud de `students.length + 1`. Esto asegura que haya espacio para el nuevo elemento.
* **TODO 8**: utilice un bucle `for` para copiar todos los elementos del array `students` existente al nuevo array. Itere sobre cada elemento y asígnelo al índice correspondiente en el nuevo array.
* **TODO 9**: cree un objeto `newStudent` y asígnelo al último índice del nuevo array, que es `newArray[newArray.length - 1]`.
* **TODO 10**: llame al método `printArray` y pase **"Add"** y el nuevo array como argumentos.

```java
Class Main{
    public static void addElement(Student newStudent, Student[] originalArray){
        //TODO 7: define a new array with a length of students.length + 1
        // TODO 8: use a ‘for loop’ to copy all elements from the existing students array to the new array 

    }
}
```

A medida que trabaje en estas tareas, considere la eficiencia y la sobrecarga potencial de añadir elementos a un array. Dado que los arrays tienen un tamaño fijo, cada adición requiere la creación de un nuevo array y la copia de todos los elementos existentes, lo cual puede ser intensivo en recursos. Reflexione sobre cómo esto impacta el rendimiento y explore estructuras de datos alternativas que podrían ofrecer soluciones más eficientes para la gestión dinámica de datos.

### Tarea 4 - Actualice un elemento

Usted ya ha aprendido cómo eliminar y añadir estudiantes al array. Ahora, es importante comprender cómo actualizar los registros existentes. Para esto, puede utilizar el método `updateElement` en la clase `Main.java`.

Imagine que un estudiante ha cambiado legalmente su nombre, o que su edad ha sido registrada incorrectamente en el sistema, y necesita actualizar su registro. En esta tarea, usted actualizará el registro de un estudiante en el array de registros de estudiantes. Esto implica localizar el objeto de estudiante correcto por su índice y modificar sus propiedades utilizando métodos setter.

Utilice el método predefinido `updateElement` en la clase `Main.java`.
* **TAREA 11**: localice el elemento que necesita actualizar. Utilice el índice del elemento en el array.
* **TAREA 12**: una vez que tenga el índice, acceda al elemento y actualice sus propiedades. Utilice el método *'setter'* en la clase `Student` para cambiar valores como el nombre, la edad o el ID.

```java
public class Main{
    public static void updateElement(int indexToUpdate, Student[]originalArray){
        // TODO 11: locate the element you need to update. Use the element's index of the array.
        //TODO 12: once you have the index, access the element and update
    }
}
```

### Tarea 5 - Desplegar el array de elementos

Analice el método `printArray`, que se proporciona en la clase `Main.java`. Este método está diseñado para imprimir los detalles de todos los estudiantes en el array. Es simple pero crucial para observar el estado actual de cada elemento del array.

¿En qué escenario podría ser esto relevante? Imagine que necesita presentar la lista actual de estudiantes a la administración de la universidad o para un informe. Mostrar todos los registros de estudiantes de manera clara y precisa es esencial para la transparencia y la comunicación efectiva. 

Utilice el método predefinido `printArray` en la clase `Main.java`.
* **TODO 13**: incluya una declaración de impresión para indicar la acción actual que se está realizando, tal como **'Removing student'**, **'Adding student'**, o **'Updating student'**.
* **TODO 14**: utilice un bucle for para recorrer cada elemento en el array.
* **TODO 15**: dentro del bucle, utilice el método getter para obtener los detalles de cada estudiante e imprimirlos utilizando el objeto de estudiante.

```java
public class Main{
    public static void printArray(String message, Student[] students){
        //TODO 13:include a print statement to indicate the current action being performed
        //TODO 14: use a ‘for loop’ to go through each element in the array
        // TODOs continue
    }
}
```

### Tarea 6 - Evaluar y confirmar la funcionalidad del proyecto

Imagine que se está acercando a la fecha límite para el proyecto del sistema de gestión de registros de estudiantes, y es crucial asegurar que todas las funcionalidades operen como se espera antes del despliegue final. Probar el código exhaustivamente le ayudará a identificar y corregir cualquier problema, asegurando una operación fluida y libre de errores del sistema.

En esta tarea, usted compilará y ejecutará su código para verificar que todas las operaciones sobre el array de estudiantes (añadir, eliminar, actualizar y mostrar) funcionen correctamente. Usted comparará la salida de su programa con los resultados esperados para asegurar la precisión.
* Compile y ejecute el código.
* Compare la salida de su programa con los resultados esperados.

#### Salida esperada

```
Remove element at 4
Operation:Remove
Student Name : John
Student Name : Mary
Student Name : Krish
Student Name : Sara
Add new student rollNumber :6, Name : shally, Age: 3
Operation:Add
Student Name : John
Student Name : Mary
Student Name : Krish
Student Name : Sara
Student Name : Harry
Student Name : shally
Update an element at index 2
Operation:Update
Student Name : John
Student Name : Mary
Student Name : Jenny
Student Name : Sara
Student Name : Harry
```

## Conclusión

¡Felicitaciones! Ha completado la Actividad: Manipulación de arrays. En este laboratorio, usted ha manipulado arrays de objetos, una habilidad fundamental para cualquier desarrollador de software. Su objetivo era modificar la clase `Main.java` y eliminar, añadir, actualizar y mostrar elementos en un array.

Al trabajar en estas tareas, usted ha desarrollado una sólida comprensión de la manipulación de arrays y se ha preparado para tareas de codificación más complejas de la vida real. Ser capaz de manipular arrays de objetos es crucial en contextos como la gestión de inventarios, donde se rastrean y actualizan los detalles de los productos y los niveles de stock, y la gestión de relaciones con el cliente (CRM), donde mantener información precisa del cliente e historiales de transacciones es esencial para proporcionar servicios personalizados. Este conocimiento fundamental lo posiciona favorablemente para abordar diversos desafíos de gestión de datos en aplicaciones del mundo real.

## Nota importante

> [!WARNING]
> Este laboratorio es una adaptación al español de la practica **Manipulating Arrays** del curso **Data Structures and Algorithms** ([link](https://www.coursera.org/learn/developer-data-structures-and-algorithms?specialization=amazon-junior-software-developer)).