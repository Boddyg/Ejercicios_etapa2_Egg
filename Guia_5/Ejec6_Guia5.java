/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejec6_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int[][] matriz= new int[3][3];
        int num;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese un número");
                num=read.nextInt();
                while (num <0 || num >9 ) {
                    System.out.println("Ingrese de vuelta el num");
                    num=read.nextInt();
                } 
                matriz[i][j]=num;
            }
        } 
        mostrarMatriz(matriz);
        if (sumafilas(matriz) == sumaColum(matriz)) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }
        
    }
    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ "+ matriz [i][j]+" ]");
            }
            System.out.println("");
        }
    }
    public static int sumafilas(int matriz[][]) {
        int acumfilas=0, diagonal_p=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                acumfilas= acumfilas + matriz[i][j];
                if (i==j){
                    diagonal_p=diagonal_p + matriz[i][j];
                }
            }
        }
        acumfilas= acumfilas + diagonal_p;
        return acumfilas;
    }
    public static int sumaColum(int matriz[][]) {
        int acumcolum=0, diagonal_s=0;
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                acumcolum=acumcolum + matriz [i][j];
                if (i+j == matriz.length -1 ){
                    diagonal_s=diagonal_s + matriz[i][j];
                }     
            }
        }
        acumcolum=acumcolum+diagonal_s;
        return acumcolum;
    }
}
