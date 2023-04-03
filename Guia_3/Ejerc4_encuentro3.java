/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de 
esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc4_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase");
        cadena=read.nextLine();
        if (cadena.substring(0, 1).equals("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
        
    }
    
}
