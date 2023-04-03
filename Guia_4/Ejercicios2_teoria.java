/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejercicios2_teoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrse 2 números");
        num1=read.nextInt(); num2=read.nextInt();
        esmultiplo(num1, num2);
    }
    public static void esmultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println("El número "+n1+" es multiplo de "+n2);
        } else {
            System.out.println("El número "+n1+" no es multiplo de "+n2);
        }
        
    }
}
