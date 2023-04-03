/*
Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
la moneda a convertir que será una cadena, este no devolverá ningún valor 
y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package Guia_4;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc3_encuentro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        double euro;
        String opcion;
        System.out.println("Ingrese la cantidad de Euros");
        euro=read.nextDouble();
        System.out.println("Elija el tipo de cambio: ");
        System.out.println("dolar // yenes // libras");
        opcion=read.next();
        
        System.out.println(convertidor(euro, opcion));
    }
    public static String convertidor(double euro, String opcion) {
        double salida, libras=0.86, yenes=129.852, dolar=1.28611;
        switch (opcion) {
            case "dolar":
                System.out.println("Euro a Dolar: " + euro*dolar);
                break;
            case "yenes":
                System.out.println("Euro a Yenes: " + euro*yenes);
                break;
            case "libras":
                System.out.println("Euro a Libras: " + euro*libras);
                break;
        }
        return "";
    }
}
