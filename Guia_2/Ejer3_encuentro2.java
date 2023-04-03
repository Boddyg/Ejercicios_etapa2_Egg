/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_2;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
/**
 *
 * @author Boddy-g
 */
public class Ejer3_encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frasae");
        frase= read.nextLine();
        System.out.println("-----------------------");
        System.out.println(toUpperCase(frase));
        
        System.out.println(toLowerCase(frase));
        System.out.println("-----------------------");
    }
    
}
