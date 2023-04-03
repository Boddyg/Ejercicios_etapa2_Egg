/*
Escriba un programa en el cual se ingrese un valor limite positivo, y a 
continuacion solicite numeros al usuario hasta que la suma de los numeros 
introducidos supere el límite inicial.
 */
package Guia_3;
import java.util.Scanner;
/**
 *
 * @author Boddy-g
 */
public class Ejerc5_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int limite, acum=0, num;
        System.out.println("Ingrese el Limite del bucle");
        limite=read.nextInt();
        do {
            System.out.println("Ingrese un número");
            System.out.print(">>");
            num=read.nextInt();
            acum=acum + num;
        } while (acum<=limite);
        System.out.println("Su limite es: "+ limite);
        System.out.println("Sus números superaron el limite: " + acum);
    }
    
}
