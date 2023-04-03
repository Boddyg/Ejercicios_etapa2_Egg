/*
Crea una aplicación que nos pida un número por teclado y con una función 
se lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class ejerc4_repeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número");
        num=read.nextInt();
        System.out.println("Es primo? " + es_primo(num));
        
    }
    public static boolean es_primo(int n) {
        boolean bandera=true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                bandera=false;
                break;
            }
            
        }
        return bandera;
    }
}
