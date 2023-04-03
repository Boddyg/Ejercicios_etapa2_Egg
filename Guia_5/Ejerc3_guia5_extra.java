/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo 
por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc3_guia5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       int tam;
        System.out.println("Ingrese el tamaño de su vector");
        tam=read.nextInt();
        int[] vector= new int[tam];
        mostrarvector(rellenarvector(vector));
    }
    public static int[] rellenarvector(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i]= ((int) (Math.random()*10)); 
        }
        
        return vector;
    }
    public static void mostrarvector(int vector[]){
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[ "+vector[i]+" ]");
        }
        System.out.println("");
    }
}
