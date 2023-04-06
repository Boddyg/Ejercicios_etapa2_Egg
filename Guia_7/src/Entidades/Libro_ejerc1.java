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
public class Libro_ejerc1 {
    Scanner read=new Scanner(System.in);
    public int isbm;
    public String titulo;
    public String autor;
    public int num_pag;
    
    public Libro_ejerc1() {
    
    }
    public Libro_ejerc1(int isbm, String titulo, String autor, int num_pag) {
        this.isbm=isbm;
        this.titulo=titulo;
        this.autor=autor;
        this.num_pag=num_pag;  
    }

    public void setPedirDatos() {
        System.out.println("Ingrese el id o isbm del libro");
        this.isbm=read.nextInt();
        System.out.println("Ingrese el titulo del libro");
        this.titulo=read.next();
        System.out.println("Ingrese el autor del libro");
        this.autor=read.next();
        System.out.println("Ingrese la cantidad de paginas del libro");
        this.num_pag=read.nextInt();
    }

    public int getIsbm() {
        return isbm;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNum_pag() {
        return num_pag;
    }
    
    
}
