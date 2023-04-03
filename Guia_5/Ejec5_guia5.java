/*
Realice un programa que compruebe si una matriz dada es antisimétrica. 
Se dice que una matriz A es antisimétrica cuando ésta es igual a su 
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica 
si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se 
obtiene cambiando sus filas por columnas (o viceversa).
 */
package Guia_5;

/**
 *
 * @author Boddy-g
 */
public class Ejec5_guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = {{0, -2, 4}, {2,0,2}, {-4, -2, 0}};
        int[][] matrizTrasp=new int[3][3];
        mostrarMatriz(matriz);
        trasponerMatriz(matriz, matrizTrasp);
        System.out.println("-------------------");
        mostrarMatriz(matrizTrasp);
        System.out.println("-------------------");
        System.out.println("La matriz es ANTISIMETRICA? "+ esantisimetrica(matriz, matrizTrasp));
    }
    public static void trasponerMatriz(int matriz[][], int matrizTrasp[][]) {
        for (int i = 0; i < matrizTrasp.length; i++) {
            for (int j = 0; j < matrizTrasp.length; j++) {
                matrizTrasp [i][j]= matriz[j][i];
            }
        }
    }
    public static boolean esantisimetrica(int matriz[][], int matrizTrasp[][]) {
        boolean bandera=false; int cont=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == -matrizTrasp[i][j])  {
                    cont++;
                }
            }
        }
        if (cont == 9) {
            bandera=true;
        }
        return bandera;
    }
    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[ "+ matriz [i][j]+" ]");
            }
            System.out.println("");
        }
    }
}
