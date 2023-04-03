/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc2_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String cadena1="eureka";
        String cadena2;
        System.out.println("Ingrese una frase");
        cadena2=read.nextLine();
        if (cadena1.equals(cadena2)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
    
}
