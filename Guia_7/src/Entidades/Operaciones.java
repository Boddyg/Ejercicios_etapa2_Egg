/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Operaciones {
    Scanner read=new Scanner(System.in);
    private double num1, num2;
    //Constructor vacio
    public Operaciones() {
    
    }
    //contructor con parametros
    public Operaciones(double num1, double num2) {
        this.num1=num1;
        this.num2=num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
    
    
    
    
    public void crearOperacion(){
        this.num1=read.nextDouble();
        this.num2=read.nextDouble();
    }
    
    public void sumar() {
        double result;
        result=num1+num2;
        System.out.println("La suma de "+ num1+" y "+num2+" es: "+ result);
    }
    public void restar() {
        double result;
        result=num1-num2;
        System.out.println("La resta de "+ num1+" y "+num2+" es: "+ result);
    }
    
    public void multi() {
        double result;
        if (num1 != 0 && num2 != 0) {
            result=num1*num2;
            System.out.println("La multiplicación de "+ num1+" y "+num2+" es: "+ result);
        } else {
            System.out.println("Error uno de los números ingresados es 0");
        }
    }
    public void dividir() {
        double result;
        if (num1 != 0 && num2 != 0) {
            result=num1/num2;
            System.out.println("La división de "+ num1+" y "+num2+" es: "+ result);
        } else {
            System.out.println("Error uno de los números ingresados es 0");
        }
    }
    
}
