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
public class Ejer1_encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner read= new Scanner(System.in);
        System.out.println("Ingrese el primer y el segundo número");
        num1=read.nextInt(); num2=read.nextInt();
        num1=num1+num2;
        System.out.println("El valor de la suma es: " + num1);
    }
    
}
