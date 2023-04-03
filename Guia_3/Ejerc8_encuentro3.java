/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar 
lo siguiente:
 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc8_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamaño de su cuadrado");
        tam=read.nextInt();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i == 0 || i==(tam-1) && j == j) {
                    System.out.print("*");
                }
                if (i != 0 && i != (tam-1)) {
                    if (j == 0 || j==(tam-1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } 
            System.out.println(""); 
        }
    }
}
 /* if (i==0 || i == 3) {
                for (int j = 0; j < tam; j++) {
                    System.out.print("*");
                } 
            } else {
                for (int k = 0; k < 3; k++) {
                     
                }
            } */