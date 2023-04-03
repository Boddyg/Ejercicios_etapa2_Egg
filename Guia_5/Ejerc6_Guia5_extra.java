/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para 
niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden 
horizontal en una fila que será seleccionada de manera aleatoria. Una vez 
concluida la ubicación de las palabras, rellene los espacios no utilizados con 
un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de 
letras creada.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc6_Guia5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String palabra;
        String[][] matriz= new String[20][20];
        completarMatriz(matriz);
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra "+ (i+1));
                palabra=read.next().toUpperCase();
            } while (palabra.length() > 5 || palabra.length()<3);
            guardarPalabra(matriz, palabra);
        }
        mostrarMatriz(matriz);
    }
    public static void guardarPalabra(String matriz[][], String palabra ) {
        String letra; int j;
            do  {
                j= (int) ((Math.random()*20)); 
            } while (j<0 || j >= (20 - palabra.length()));
            System.out.println(j);
            for (int k = 0; k < 5; k++) { //filas de matriz
                for (int l = 0; l < palabra.length(); l++) {
                    letra=palabra.substring(l, l+1); //recorro la palabra
                    matriz[k][j+l]=letra; 
                }
                
                
            }
    }
    
    public static void completarMatriz(String matriz[][]) {
        String num;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                num=String.valueOf((int) (Math.random() * 10));
                matriz[i][j]= num;
            }
        }
    }
     public static void mostrarMatriz(String matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ "+ matriz [i][j]+" ]");
            }
            System.out.println("");
        }
    }
}
