/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_4;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
        Scanner leer = new Scanner (System.in);
        double cen;
        double fah;
        
        System.out.println("Ingresa la cantidad de grados centigrados. El sistema mostrara su equivalente en grados Fahrenheit ");
        cen = leer.nextDouble();
        
        fah = 32 + (9 * cen / 5);
        
    System.out.println( cen + "°C son equivalentes a " + fah + " °F "); 
    }
    
}
