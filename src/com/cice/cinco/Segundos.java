/*
 * Escribir un programa que calcule el número de segundos que existen en un día. 
 */
package com.cice.cinco;

/**
 *
 * @author Alicia
 */
public class Segundos {

    /**
     * @param args the command line arguments
     */
    static int horas=24;
    static int minutos=60;
    static int segundos=60;
    public static void main(String[] args) {
        System.out.println("El número de segundos de 1 día son: "+ horas*minutos*segundos);
    }
    
}
