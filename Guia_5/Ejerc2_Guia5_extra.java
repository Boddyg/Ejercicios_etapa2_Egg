/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
los elementos).
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc2_Guia5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read= new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamaño de su arreglo");
        tam=read.nextInt();
        int[] vector1= new int[tam];
        int[] vector2= new int[tam];
        rellenarVector(vector1);
        rellenarVector(vector2);
        System.out.println("Son iguales los 2 vectores? "+ iguales(vector1, vector2));
        
    }
    public static void rellenarVector(int vector[]) {
            for (int i = 0; i < vector.length; i++) {
                vector[i]= (int) (Math.random() * 3);
                System.out.println(vector[i]);
            }
    }
    public static boolean iguales(int vector1[], int vector2[]){
        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }
        return true;
    }
}
