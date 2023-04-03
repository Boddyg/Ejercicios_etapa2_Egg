
package Guia_3;
import java.util.Scanner;
/**
 *
 * @author Boddy-g
 */
public class ejercicios_prueba_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner read=new Scanner(System.in);
       int num1, num2;
       
        System.out.println("Ingrese 2 números enteros");
        System.out.print(">>");
        num1=read.nextInt(); num2=read.nextInt();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1>25){ 
            System.out.println("El número 1 "+ num1 + " es mayor a 25");
        } else if (num2 >25){
            System.out.println("El número 2 "+ num2 + " es mayor a 25");
        }
        
    }
    
}
