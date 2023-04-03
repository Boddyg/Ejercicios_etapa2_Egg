
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class ejercicio_prueba_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int nota;
        boolean bandera=true;
        while (bandera) {
            System.out.println("Ingrese la nota");
            nota=read.nextInt();
            if (nota > 0 && nota <= 10) {
                System.out.println("La nota es: " + nota);
                bandera=false;
            }
        }
    }
    
}
