/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;
import Entidades.Operaciones;
/**
 *
 * @author Boddy-g
 */
public class Ejerc3_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operaciones m1 = new Operaciones();
        System.out.println("Ingrese 2 números");
        m1.crearOperacion();
        m1.sumar();
        m1.restar();
        m1.multi();
        m1.dividir();
        
        
    }
    
}
 