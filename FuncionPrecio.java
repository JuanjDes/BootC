                    /** FUNCIÓN PARA CALCULAR EL IVA DADO A UN PRECIO DADO
                     *  Tiene pendiente el control de excepciones al introducir los números
                     **/


package com.company;

import java.util.Scanner;

public class FuncionPrecio {

    private static double precio2;
    private static int tipo2;
    static double precioFinal;

    public static void main(String[] args) {

        // Creo objeto scanner que solicitará una entrada por teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un precio para calcular el IVA (para decimales utiliza ,): ");
        // Solicito entrada por teclado, tipo double, y la guardo en precio2
        precio2 = scanner.nextDouble();

        System.out.print("Introduce tipo de IVA para añadir al precio (sin decimales): ");
        // Solicito entrada por teclado, tipo int, y la guardo en tipo2
        tipo2 = scanner.nextInt();

        // Le paso a la función calculaIva() los parámetros precio y tipo
        calculaIva(precio2, tipo2);

        // Reduce precioFinal hasta 2 decimales
        precioFinal = Math.round(precioFinal*100.0)/100.0;

        System.out.println("El precio Iva incluido es: " + precioFinal);

    }

    public static double calculaIva(double precio, int tipo) {
        return precioFinal = (precio + ((precio * tipo) / 100));
    }
}
