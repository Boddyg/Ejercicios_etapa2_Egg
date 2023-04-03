/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia_5;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejec4_Guia5_extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        double nota, acum_nota=0;
        double[] vector= new double[10];
        for (int i = 0; i < vector.length; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.println("Ingrese la nota "+ j);
                nota=read.nextDouble();
                switch (j){
                    case 1:
                        acum_nota=acum_nota+(nota*0.1);
                        break;
                    case 2:
                        acum_nota=acum_nota+(nota*0.15);
                        break;
                    case 3:
                        acum_nota=acum_nota+(nota*0.25);
                        break;
                    case 4:
                        acum_nota=acum_nota+(nota*0.5);
                        break;
                }
            }
            vector[i]=acum_nota;
            acum_nota=0;
        }
        aprobados(vector);
    }
    public static void aprobados(double vector[]) {
        int cont_A=0, cont_D=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>=7) {
                cont_A++;
            } else {
                cont_D++;
            }
        }
        System.out.println("La cantidad de aprobados son: "+ cont_A);
        System.out.println("La cantidad de desaprobados son: "+ cont_D);
    }
}
