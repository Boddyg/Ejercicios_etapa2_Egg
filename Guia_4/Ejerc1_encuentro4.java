/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una 
función para cada operación matemática y deben devolver sus resultados para 
imprimirlos en el main. 
 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc1_encuentro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num1, num2, opcion;
        System.out.println("Ingrse 2 números");
        num1=read.nextInt(); num2=read.nextInt();
        System.out.println("-----------------------");
        System.out.println("        Menu:          ");
        System.out.println("1. Suma                ");
        System.out.println("2. Resta               ");
        System.out.println("3. Multiplicación      ");
        System.out.println("4. División            ");
        System.out.println("-----------------------");
        opcion=read.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("SUMA " + suma(num1, num2));
                break;
            case 2:
                System.out.println("RESTA " + resta(num1, num2));
                break;
            case 3:
                System.out.println("MULTIPLICACIÓN " + multi(num1, num2));
                break;
            case 4:
                System.out.println("DIVISIÓN " + div(num1, num2));
                break;
            default:
                System.out.println("Valor Invalido");
        }
    }
    public static int suma(int n1, int n2) {
        int result;
        result= n1 + n2;
        return result;
    }
    public static int resta(int n1, int n2) {
        int result;
        result= n1 - n2;
        return result;
    }
    public static int multi(int n1, int n2) {
        int result;
        result= n1 * n2;
        return result;
    }
     public static double div(int n1, int n2) {
        double result;
        result= n1 / n2;
        return result;
    }
}
