/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
import modelo.Pila;

/**
 *
 * @author antonioma2411
 */
public class ejercicio4 {
   Pila<Character> pila = new Pila<>();
   public static void ejercicio4(Scanner leer) {
        Pila<Character> pila = new Pila<>(); //Pila de caracteres para que a la hora de desencolar no sume los numeros, y los concatene
        String numBinario="";
        int num=0;
        int resto=0;
        
        do{
            System.out.println("Escriba un numero");
            numBinario = leer.nextLine();
            if (!numBinario.matches("\\d+")){ //Obligamos a que introduzca un numero positivo
                System.out.println("Error! el numero debe ser un numero positivo y entero");
            }
        }while(!numBinario.matches("\\d+"));
        
        num= Integer.parseInt(numBinario); //No hace falta un try catch por que la expresion regular se encarga de que si o si sea un numero
        if(num==0){
            pila.apilar(numBinario.charAt(0)); //Si es 0 lo introducimos como unico numero en la pila
        }else{
            while(num>0){ 
                resto=num%2;
                num=num/2;
                pila.apilar(Character.forDigit(resto, 10)); //pasamos el modulo a char con esta funcion
            
            }
        }
        numBinario=""; //vaciamos el numero para rellenarlo con la solucion
        while (!pila.estaVacia()) {
            numBinario = numBinario + pila.desapilar();  //Como hay que invertirlos, la pila lo hace solo
        }
        System.out.println("El numero introducido en binario es: " + numBinario); //Lo mostramos
    }
    
    
}
