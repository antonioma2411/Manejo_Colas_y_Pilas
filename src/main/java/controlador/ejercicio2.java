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
public class ejercicio2 {
    public static void ejercicio2(Scanner leer) {
        String opcion = "";
        String persona = "" ;
        Cola<String> cola = new Cola<>();

        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE COLA ---");  //escribimos el menu
            System.out.println("1) Llegada");
            System.out.println("2) Atender");
            System.out.println("3) Mostrar cola");
            System.out.println("4) Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leer.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("--> Has seleccionado: Llegada");  //En la llegada rellenamos un nombre
                    do {
                        System.out.println("Escriba el nombre de la persona");
                        persona  = leer.nextLine();
                        if (persona.isEmpty()) {
                            System.out.println("Error! El nombre de la persona no puede estar vacía");
                        }
                    } while (persona.isEmpty());
                    cola.encolar(persona);
                    break;
                case "2":  
                    System.out.println("--> Has seleccionado: Atender");  //Aqui atendemos y sacamos al primero en entrar a la cola
                    if(cola.estaVacia()){
                        System.out.println("¡Error! La cola esta vacia, no se ha podido atender a nadie");
                    }else{
                        System.out.println("Se ha atendido a \"" + cola.desencolar() + "\"");
                        
                    }
                    break;
                    
                case "3":  
                    System.out.println("--> Has seleccionado: Mostrar cola");  //Mostramos la cola
                    System.out.println("Este es el estado de la cola: ");
                    System.out.println(cola);
                    break;
                case "4":
                    System.out.println("Saliendo del programa...");  //Salimos
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (!opcion.equals("4"));
    }
}
