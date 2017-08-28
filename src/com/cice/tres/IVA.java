/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.tres;

/**
 *
 * @author Alicia
 */
public class IVA {
    
    double precio;

    public IVA(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**
     *  El IVA a pagar
     * @return iva a pagar de un precio 
     */
    public double iva(){
        //21%
        double iva=(precio*21)/100;
        return iva;
    }
    /**
     * Suponiendo que sea un precio sin IVA, calcular la suma total (precio + IVA
     */
    public double precioMasIva(){
        return precio+iva();
    }
    /**
     * c) Suponiendo que sea un precio con IVA, calcular el precio sin IVA
     */
    public double precioSinIva(){
        return precio - iva();
    }
    
    
}
