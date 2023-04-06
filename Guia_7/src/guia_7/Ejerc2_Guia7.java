/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;
import Entidades.Circunferencia;
import java.util.Scanner;
/**
 *
 * @author Boddy-g
 */
public class Ejerc2_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Circunferencia c1 =new Circunferencia();
        System.out.println("Ingrese Circunferencia");
        c1.crearCircunferencia(read.nextDouble());
        c1.area();
        c1.perimetro();
    }
    
}
