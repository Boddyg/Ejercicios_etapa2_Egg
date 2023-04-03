/*
 
Crear un programa que dado un número determine si es par o impar.

 */
package Guia_3;
import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc1_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número");
        num=read.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número "+ num +" es PAR");
        } else {
            System.out.println("El número "+ num +" es IMPAR");
        }
    }
    
}
