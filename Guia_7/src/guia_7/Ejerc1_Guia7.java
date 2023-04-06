/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7;
import Entidades.Libro_ejerc1;
import java.util.Scanner;
/**
 *
 * @author Boddy-g
 */
public class Ejerc1_Guia7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Libro_ejerc1 libro= new Libro_ejerc1();
        libro.setPedirDatos();
        System.out.println(libro.getIsbm());
        System.out.println(libro.getTitulo());
        System.out.println(libro.getAutor());
        System.out.println(libro.getNum_pag());
        
    }
    
}
