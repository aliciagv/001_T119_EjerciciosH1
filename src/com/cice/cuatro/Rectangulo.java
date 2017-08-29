/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.cuatro;

/**
 *
 * @author Alicia
 */
public class Rectangulo {
    
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    /**
     * El perímetro corresponde a la suma de las longitudes de todos los lados de la figura 
     * P = 2a + 2b
     */
    public void calcularPerímetro(){
        System.out.println("El perímetro es: "+ ((2*ancho)+(2*alto)));
    }
    
    /**
     * A = b · a 
     */
    public void calcularArea(){
         System.out.println("El área es: "+ ancho*alto);
    }
    
}
