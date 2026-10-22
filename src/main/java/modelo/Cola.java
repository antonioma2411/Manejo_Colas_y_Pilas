package modelo;
    

import java.util.NoSuchElementException;

public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamano;

    public Cola() {
        this.frente = null;
        this.fin = null;
        this.tamano = 0;
    }

    // Verifica si la cola está vacía
    public boolean estaVacia() {
        return frente == null;
    }

    // Devuelve el número de elementos
    public int getTamano() {
        return tamano;
    }

    // Agrega un elemento al final de la cola (Enqueue / Offer)
    public void encolar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (estaVacia()) {
            frente = nuevoNodo;
        } else {
            fin.setSiguiente(nuevoNodo);
        }
        fin = nuevoNodo;
        tamano++;
    }

    // Elimina y devuelve el elemento del frente (Dequeue / Poll)
    public T desencolar() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null; // Si quedó vacía, actualizamos también el puntero fin
        }
        tamano--;
        return dato;
    }

    // Devuelve el elemento del frente sin eliminarlo (Peek)
    public T frente() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return frente.getDato();
    }

    // Vacía la cola
    public void limpiar() {
        frente = null;
        fin = null;
        tamano = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Frente -> [");
        Nodo<T> actual = frente;
        while (actual != null) {
            sb.append(actual.getDato());
            if (actual.getSiguiente() != null) {
                sb.append(", ");
            }
            actual = actual.getSiguiente();
        }
        sb.append("] <- Fin");
        return sb.toString();
    }
}
