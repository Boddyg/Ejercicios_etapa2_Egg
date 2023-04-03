/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia_5;

/**
 *
 * @author Boddy-g
 */
public class Ejerc4_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i] [j]= (int) (Math.random() * 10);
            }
        }
        mostrarMatriz(matriz);
        System.out.println("---------------");
        trasponerMatriz(matriz);
    }
    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ "+ matriz [i][j]+" ]");
            }
            System.out.println("");
        }
    }
    public static void trasponerMatriz(int matriz[][]) {
        int[][] matrizTrasp =new int[4][4];
        for (int i = 0; i < matrizTrasp.length; i++) {
            for (int j = 0; j < matrizTrasp.length; j++) {
                matrizTrasp [i][j]= matriz[j][i];
            }
        }
        mostrarMatriz(matrizTrasp);
    }
}
