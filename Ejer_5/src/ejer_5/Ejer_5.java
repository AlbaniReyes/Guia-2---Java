/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_5;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Albani
 */
public class Ejer_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
        // Nota: investigar la función Math.sqrt().
        
        Scanner leer = new Scanner (System.in);
        int num;
        int doble;
        int triple;
        double raiz;
        System.out.println("Ingresa un numero entero");
        num = leer.nextInt();
        System.out.println("El programa dara como resultado el doble, el triple y la raiz cuadrada del numero que ingresaste");
        
        doble = num *2;
        triple = num *3;
        raiz = sqrt(num);
                
        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("El triple de " + num + " es " + triple);
        System.out.println("La raiz cuadrada de " + num + " es " + raiz);
        
    }
}
