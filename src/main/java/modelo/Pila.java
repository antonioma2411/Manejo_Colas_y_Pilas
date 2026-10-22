

package modelo;

import java.util.EmptyStackException;

public class Pila<T> {
    private Nodo<T> cima;
    private int tamano;

    public Pila() {
        this.cima = null;
        this.tamano = 0;
    }

    // Verifica si la pila está vacía
    public boolean estaVacia() {
        return cima == null;
    }

    // Devuelve el número de elementos
    public int getTamano() {
        return tamano;
    }

    // Agrega un elemento a la cima (Push)
    public void apilar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        nuevoNodo.setSiguiente(cima);
        cima = nuevoNodo;
        tamano++;
    }

    // Elimina y devuelve el elemento de la cima (Pop)
    public T desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        T dato = cima.getDato();
        cima = cima.getSiguiente();
        tamano--;
        return dato;
    }

    // Devuelve el elemento de la cima sin eliminarlo (Peek)
    public T cima() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return cima.getDato();
    }

    // Vacía la pila
    public void limpiar() {
        cima = null;
        tamano = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cima -> [");
        Nodo<T> actual = cima;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append(", ");
            }
            actual = actual.getSiguiente();
        }
        sb.append("]");
        return sb.toString();
    }
}
