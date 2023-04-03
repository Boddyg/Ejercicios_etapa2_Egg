/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2;
import java.util.Scanner;
/**
 *
 * @author Boddy-g
 */
public class ejer4_encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double grados;
        Scanner read= new Scanner(System.in);
        
        System.out.println("Ingrese los grados centigrados");
        grados=read.nextDouble();
        grados= 32 + (9* (grados/5));
        System.out.println("Los grados transformados a Fahrenheit son: " + grados);
        
    }
    
}

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5). */