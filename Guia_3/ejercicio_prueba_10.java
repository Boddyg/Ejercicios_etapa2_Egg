
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class ejercicio_prueba_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num;
        for (int i = 0; i < 4; i++) {
            System.out.println(" ");
            System.out.println("Ingrese un número entre 1-20");
            num=read.nextInt();
            System.out.println("--------------------------");
            if (num > 0 && num <= 20) {
                System.out.print(num + " ");
                for (int j = 0; j < num; j++) {
                    System.out.print("*");  
                }  
            } else {
                System.out.println("En número "+ num + " no es valido");
            }
        }
    }
    
}
