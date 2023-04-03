/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o 
menores de edad. Después de cada persona, el programa debe preguntarle al 
usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese 
la palabra “No”.
 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc2_encuentro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
         String salir;
        do {
            System.out.println(mostrardatos());
            System.out.println("Desea agregar más nombres? (Si/No)");
            salir=read.nextLine().toLowerCase();
        } while(salir.equals("si"));
        
    }
    public static String mostrardatos() {
        Scanner read=new Scanner(System.in);
        int edad; String nombre;
        System.out.println("Ingrese Nombre");
        nombre=read.nextLine();
        System.out.println("Ingrese edad");
        edad=read.nextInt();
        if ( edad > 18) {
            System.out.println("La persona "+ nombre +" es mayor de edad con " + edad);
        } else {
            System.out.println("La persona "+ nombre +" no es mayor de edad con " + edad);
        }
        return "";
    }
}
