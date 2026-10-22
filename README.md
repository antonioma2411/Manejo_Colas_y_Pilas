# UD01 - Ejercicios 02: Pilas y Colas

Ejercicios de estructuras de datos en Java usando una **pila** y una **cola** implementadas desde cero con nodos enlazados y genéricos (sin usar `Stack`, `Queue` ni `Deque` de `java.util`).

**Autor:** Antonio Manuel González

## Estructura del proyecto

```
UD01_Ejercicios02_AntonioManuelGonzalez
├── pom.xml
└── src/main/java
    ├── com.mycompany.ud01_ejercicios02_antoniomanuelgonzalez
    │   └── UD01_Ejercicios02_AntonioManuelGonzalez.java   (main)
    ├── controlador
    │   ├── ejercicio1.java
    │   ├── ejercicio2.java
    │   ├── ejercicio3.java
    │   └── ejercicio4.java
    └── modelo
        ├── Nodo.java
        ├── Pila.java
        └── Cola.java
```

- **modelo**: las estructuras de datos.
- **controlador**: la lógica de cada ejercicio.
- **main**: crea un único `Scanner` y ejecuta los 4 ejercicios en orden.

## Estructuras de datos

### `Nodo<T>`
Nodo genérico con un dato y una referencia al siguiente nodo.

### `Pila<T>` (LIFO)
| Método | Descripción |
|---|---|
| `apilar(T)` | Añade un elemento a la cima (push) |
| `desapilar()` | Quita y devuelve la cima (pop). Lanza `EmptyStackException` si está vacía |
| `cima()` | Devuelve la cima sin quitarla (peek) |
| `estaVacia()` | Indica si está vacía |
| `getTamano()` | Número de elementos |
| `limpiar()` | Vacía la pila |

### `Cola<T>` (FIFO)
| Método | Descripción |
|---|---|
| `encolar(T)` | Añade un elemento al final |
| `desencolar()` | Quita y devuelve el primero. Lanza `NoSuchElementException` si está vacía |
| `frente()` | Devuelve el primero sin quitarlo |
| `estaVacia()` | Indica si está vacía |
| `getTamano()` | Número de elementos |
| `limpiar()` | Vacía la cola |

Ambas tienen `toString()` para mostrar su contenido.

## Ejercicios

### Ejercicio 1 - Invertir una cadena
Pide una cadena (mínimo 2 caracteres), apila cada carácter y los desapila para obtener la cadena invertida.

### Ejercicio 2 - Gestión de una cola de personas
Menú interactivo:

1. **Llegada**: añade una persona a la cola (el nombre no puede estar vacío).
2. **Atender**: atiende a la primera persona. Si la cola está vacía, muestra un error.
3. **Mostrar cola**: imprime el estado actual de la cola.
4. **Salir**.

### Ejercicio 3 - Palíndromos
Pide una sola palabra (sin espacios ni vacía) y guarda sus letras a la vez en una pila y en una cola. Al sacarlas, la pila da la palabra del revés y la cola del derecho; si todas coinciden, la palabra es palíndroma.

### Ejercicio 4 - Decimal a binario
Pide un número entero positivo (validado con expresión regular), divide entre 2 apilando los restos y desapila para obtener el número en binario. Caso especial: el `0` se muestra directamente como `0`.

## Cómo ejecutarlo

Requisitos: **JDK** instalado (y Maven si se compila con `pom.xml`).

Con Maven:

```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.mycompany.ud01_ejercicios02_antoniomanuelgonzalez.UD01_Ejercicios02_AntonioManuelGonzalez"
```

O desde **NetBeans**: abrir el proyecto y pulsar *Run* (F6).

Los ejercicios se ejecutan seguidos: al terminar uno, empieza el siguiente.

## Ejemplo de salida

```
Escriba una cadena de caracteres(Al menos 2 caracteres)
hola
aloh
```
