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
public class Circunferencia {
    Scanner read=new Scanner(System.in);
    private double radio;
    public Circunferencia() {
    }
    public Circunferencia(double radio){
        this.radio=radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double  getRadio() {
        return radio;
    }
    public void crearCircunferencia(double radio) {
        this.radio=radio;
    }
    public void area() {
        double area;
        area=Math.pow(Math.PI*radio, 2);
        System.out.println("El area es: "+ area);
    }
    public void perimetro(){
        double perimetro;
        perimetro=(2*Math.PI*radio);
        System.out.println("El perimetro es: "+ perimetro);
    }
    
}

