/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la funcion Lenght() en Java.
 */
package Guia_3;

import java.util.Scanner;



/**
 *
 * @author Boddy-g
 */
public class Ejerc3_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String cadena;
        System.out.println("Ingrese una frase");
        cadena=read.nextLine();
        if (cadena.length() == 8) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
               
    }
    
}
