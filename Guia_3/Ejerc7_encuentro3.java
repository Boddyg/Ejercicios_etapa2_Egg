/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de 
largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y 
toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package Guia_3;

import java.util.Scanner;

/**
 *
 * @author Boddy-g
 */
public class Ejerc7_encuentro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        String codigo;
        int cont=0, cont2=0;
        System.out.println("Ingrese el codigo");
        codigo=read.nextLine();
        while (!codigo.equals("&&&&&")) {
            if (codigo.length() == 5) {
                if (codigo.substring(0,1).equals("X") && codigo.substring(4, 5).equals("O")) {
                    cont=cont + 1;
                }
            } else {
                cont2=cont2+1;
            }
            System.out.println("Ingrese el codigo");
            codigo=read.nextLine();
        }
        System.out.println("Cantidad de Lecturas corretas: " + cont);
        System.out.println("Cantidad de Lecturas incorretas: " + cont2);
    }
    }
    

