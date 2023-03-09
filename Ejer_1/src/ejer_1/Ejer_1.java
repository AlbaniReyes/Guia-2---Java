/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_1;

import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
        Scanner leer = new Scanner (System.in);
        int num1;
        int num2;
        int suma;
        System.out.println("Ingresa 2 numeros que quieras sumar");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        suma = num1 + num2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es igual a: *" + suma + "*");  
               
    }
    
}
