/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Albani
 */
public class Ejer_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
        // Nota: investigar la función toUpperCase() y toLowerCase() en Java.
        Scanner leer = new Scanner (System.in);
        String frase;
        System.out.println("Ingresa una frase. El sistema la escribira en letras *minusculas* y *MAYUSCULAS*");
        frase = leer.nextLine();
        System.out.println("minusculas: " + toLowerCase(frase)); 
        System.out.println("minusculas: " + toUpperCase(frase)); 
    }
    
}
