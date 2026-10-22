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
public class ejercicio1 {
    
    public static void ejercicio1(Scanner leer){
      String cadena = "";
        Pila<Character> pila = new Pila<>();
        String cadenaInvert = ""; //aqui guardaremos la cadena invertida

        do {
            System.out.println("Escriba una cadena de caracteres(Al menos 2 caracteres)"); //pedimos el texto, almenos dos caracteres para que se vea la inversion
            cadena = leer.nextLine();
            if (cadena.length() < 2) {
                System.out.println("Error! La cadena debe tener al menos 2 caracteres "); //Control de errores
            }
        } while (cadena.length() < 2);

        for (char c : cadena.toCharArray()) { //Convertimos el texto en un array de caracteres para guardarlos en una pila de caracteres
            pila.apilar(c); //los guardamos
        }

        while (!pila.estaVacia()) {
            cadenaInvert = cadenaInvert + pila.desapilar(); //el untimo en entrar es el primero en salir, asi conseguimos invertir la cadena directamente
        }

        System.out.println(cadenaInvert);
    }
}
