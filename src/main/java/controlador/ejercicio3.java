/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import java.util.Scanner;

/**
 *
 * @author antonioma2411
 */
public class ejercicio3 {
    public static void ejercicio3(Scanner leer) {
        Cola<Character> cola = new Cola<>();
        Pila<Character> pila = new Pila<>();
        String nombre="";
        boolean cond = true;
        do {
            System.out.println("Escriba una sola palabra");  //obligamos que solo sea una palabra y borramos los espacios
            nombre = leer.nextLine().toLowerCase().trim();
            if (nombre.isEmpty()) {
                System.out.println("Error! La palabra no puede estar vacía");  //Comprobamos que no este vacia
            }else if(nombre.contains(" ")){
                System.out.println("Error! Debe introducir una unica palabra");  //Comprobamos que no sea mas de una palabra
            }
        } while (nombre.isEmpty()|| nombre.contains(" "));  //Repetimos si esta bacia o contiene un espacio en medio
        
        for (char c: nombre.toCharArray()){  //Rellenamos tanto la cola como la pila
            pila.apilar(c);
            cola.encolar(c);
        }
        
        
        
        while (!pila.estaVacia()){
            if (!pila.desapilar().equals(cola.desencolar())){  //si alguna letra del final de la pila no coincide con las primeras de la cola, es que no es palindroma
                cond = false;
            }
        }
        
        if (cond){
            System.out.println("La palabra es palindroma");
        }else{
            System.out.println("La palabra no es palindroma");
        }
    }
    
}
