
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class ejercicio_prueba_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int num, acum=0, cont=0;
        do {
            System.out.println("Ingrese un número");
            num=read.nextInt();
            if (num > 0) {
                acum= acum + num;
                cont= cont + 1;
            } else if (num==0) {
                System.out.println("Se capturo el número 0");
                break;
            }
        } while (cont < 20);
        System.out.println("La suma de todos los números son: " + acum);
        System.out.println("La cantidad de números que ingresaste es de: " + cont );
    }
    
}
