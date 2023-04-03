/*
Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el 
programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package Guia_3;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Boddy-g
 */
public class Ejerc6_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String salir= "N";
        int opcion;
        double result, num1, num2 ;
        do {
            System.out.println("------------------------");
            System.out.println("          Menu:         ");
            System.out.println("1. Sumar.               ");
            System.out.println("2. Restar.              ");
            System.out.println("3. Multiplicación.      ");
            System.out.println("4. División.            ");
            System.out.println("5. Salir.               ");
            System.out.println("------------------------");
            System.out.print(">>");
            opcion=read.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los números que desea sumar");
                    num1=read.nextInt(); num2=read.nextInt();
                    result= num1 + num2;
                    System.out.println("La suma es: " + result);
                    break;
                case 2:
                    System.out.println("Ingrese los números que desea restar");
                    num1=read.nextInt(); num2=read.nextInt();
                    result= num1-num2;
                    System.out.println("La suma es: " + result);
                    break;
                case 3:
                    System.out.println("Ingrese los números que desea Multiplicar");
                    num1=read.nextInt(); num2=read.nextInt();
                    result= num1*num2;
                    System.out.println("La suma es: " + result);
                    break;
                case 4:
                    System.out.println("Ingrese los números que desea Dividir");
                    num1=read.nextInt(); num2=read.nextInt();
                    result= num1/num2;
                    System.out.println("La suma es: " + result);
                    break;
                case 5:
                    System.out.println("Desea salir del programa (S/N)");
                    salir=read.next();
                    salir=toUpperCase(salir);
            }
        } while(!salir.equals("S")); // (salir != "S") salir contiene el caracter N
    }   
}
