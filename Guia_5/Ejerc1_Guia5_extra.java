/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc1_Guia5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        int tam;
        System.out.println("Ingrese el tamaño de su arreglo");
        tam=read.nextInt();
        int[] vector=new int[tam];
        rellenarVector(vector);
        System.out.println("La suma de todos los elementos del vector: "+ sumaVector(vector));
    }
    public static void rellenarVector(int vector[]) {
            for (int i = 0; i < vector.length; i++) {
                vector[i]= (int) (Math.random() * 100);
                System.out.println(vector[i]);
            }
    }
    public static int sumaVector(int vector[]) {
        int acum=0;
        for (int i = 0; i < vector.length; i++) {
            acum=acum + vector[i];
        }
        return acum;
    }
}
