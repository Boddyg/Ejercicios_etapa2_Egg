
package Guia_3;
import java.util.Scanner;
/**
 *
 * @author Boddy-g
 */
public class ejercicio_prueba_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el número de motor // 1 -- 2 -- 3 -- 4");
        opcion=read.nextInt();
        switch (opcion) {
            case 1: 
                System.out.println("La bomba es una bomba de agua.");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }
    
}
