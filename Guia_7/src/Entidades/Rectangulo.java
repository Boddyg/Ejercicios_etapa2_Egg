/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También 
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que 
dibujará el rectángulo mediante asteriscos usando la base y la altura. Se 
deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Rectangulo {
    Scanner read=new Scanner(System.in);
    private double base, altura;
    
    public Rectangulo() {
    
    }
    public Rectangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public void pedirDatos() {
        this.base=read.nextDouble();
        this.altura=read.nextDouble();
    }
    
    public double superficie() {
        double sup;
        sup=base*altura;
        return sup;
    }
    public double perimetro() {
        double per;
        per=(base+altura)*2;
        return per;
    }
    public void crearRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
