/*
 * 
 */
package com.cice.cuatro;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class MainRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        System.out.println("CALCULO PERIMETRO Y ÁREA DE UN RECTÁNGULO");
        System.out.println("==========================================");
        System.out.print("Introduce el ancho");
        double ancho=sc.nextDouble();
        System.out.println("Introduce al alto");
        double alto= sc.nextDouble();
        Rectangulo rectangulo=new Rectangulo(ancho,alto);
        rectangulo.calcularPerímetro();
        rectangulo.calcularArea();
    }
    
}
