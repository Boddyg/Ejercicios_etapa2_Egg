/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2;
import java.util.Scanner;
/**
 *
 * @author Boddy-g
 */
public class ejer5_encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número entero :D");
        num=read.nextInt();
        System.out.println("Doble: " + num*2);
        System.out.println("Triple: "+ num*3);
        System.out.println("Raiz cuadrada :" +  Math.sqrt(num));
        System.out.println("------------------------------");
        System.out.println("Cuadrado: " + Math.pow(num, 2));
        System.out.println("Cubo: " + Math.pow(num, 3));
        System.out.println("------------------------------");
        
    }
    
}
 /* Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número.  */