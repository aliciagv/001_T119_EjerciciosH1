/*
 * El IVA para ciertos artículos es del 21%. Realiza un programa que pida un precio y calcule
 *  a) El IVA a pagar
 *  b) Suponiendo que sea un precio sin IVA, calcular la suma total (precio + IVA)
 *  c) Suponiendo que sea un precio con IVA, calcular el precio sin IVA

 */
package com.cice.tres;

import java.util.Scanner;

/**
 *
 * @author Alicia
 */
public class MainIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = null;
        double precio = 0;
        boolean esDouble = false;
        System.out.println("EJERCICIO IVA");
        System.out.println("================");
        do {
            
            sc = new Scanner(System.in);
            System.out.println("Introduzca el precio del producto");
            if (sc.hasNextDouble()) {
                precio = sc.nextDouble();
               esDouble=true;
            }
        } while (!esDouble);
        IVA iva= new IVA(precio);
        System.out.println("Eliga una opción");
        System.out.println("a) El IVA a pagar");
        System.out.println("b)Suponiendo que sea un precio sin IVA, calcular la suma total (precio + IVA)");
        System.out.println("c) Suponiendo que sea un precio con IVA, calcular el precio sin IVA");
        sc=new Scanner(System.in);
        String opcion = sc.next();
        switch (opcion) {
            case "a":
                System.out.println("El iva a pagar es: " +iva.iva());
                break;
            case "b":
                System.out.println("El precio total + iva: " +iva.precioMasIva());
                break;
            case "c":
                System.out.println("El precio sin iva: " +iva.precioSinIva());
                break;
            default:
                System.out.println("La opción elegida es incorrecta");
        }
    }

}
