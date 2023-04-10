/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;
import Entidades.Rectangulo;
/**
 *
 * @author Boddy-g
 */
public class Ejerc4_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1= new Rectangulo();
        System.out.println("Ingrese la BASE y la ALTURA del rectangulo");
        r1.pedirDatos();
        System.out.println("La superficie es: "+ r1.superficie());
        System.out.println("La Perímetro es: "+ r1.perimetro());
        System.out.println("--------------------");
        r1.crearRectangulo();
        System.out.println("--------------------");
    }
    
}
