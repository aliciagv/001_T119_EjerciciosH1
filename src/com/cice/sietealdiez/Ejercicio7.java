/*
EJERCICIO 7
¿Qué obtendremos en pantalla al ejecutar el siguiente programa (se ha obviado el main())?
long a = 500; int b = 3;
 b = a * b;
 System.out.println(b);


===========================================================================================
EJERCICIO8
¿Qué obtendremos en pantalla al ejecutar el siguiente programa (se ha obviado el main())?
 long a = 500; int b = 3;
 b *= a;
 System.out.println(b);
===========================================================================================
EJERCICIO9
¿Qué obtendremos en pantalla al ejecutar el siguiente programa (se ha obviado el main())?
 short a = 5, b =10;
 short c = a + b;
 System.out.println(c);

===========================================================================================
EJERCICIO10
¿Qué obtendremos en pantalla al ejecutar el siguiente programa (se ha obviado el main())?
 byte a = 64, b = 2;
 byte c = (byte) (a * b);
 System.out.println(c);
 */
package com.cice.sietealdiez;

/**
 *
 * @author Alicia
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // long a = 500; int b = 3;
        // b = a * b; //EJERCICIO 7 no puede asignarse a b que es un entero por incompatibilidad de a que es  un long, error de compilación
        // si se hace un casting a int funcionaría  b = (int) (a * b). Sabemos que por los valores no se pasa a long  
        // b *= a; //EJERCICIO 8: resultado 1500
        //  System.out.println(b);
        
        
        /*short a = 5, b = 10;
        short c =  a + b; //EJERCICIO 9 no compila, funcionaria haciendo casting  short c = (short) (a + b)
        System.out.println(c); */
        
        byte a = 65, b = 2;
        byte c = (byte) (a * b); //byte va del -128 al 127 al ser 128 el resultado se muestra -128, va hacia atrás
        System.out.println(c);
    } // si fuera 65 * 2 =130 -128,-127, -126: el resultado es -126

}
