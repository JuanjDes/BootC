            // EJEMPLO DE CÓDIGO PARA TRABAJAR CON LISTAS Y ARRAYLIST() UTILIZANDO toString()


package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lista simple de nombres y mostramos el valor de cada posición de la lista
        List<String> nombres = new ArrayList<>();
        nombres.add("Pedro");
        nombres.add("Juan");
        nombres.add("Paco");

        for (String nombreb : nombres) {
            System.out.println(nombreb);
        }

        // Lista de una clase Coche
        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Seat Ibiza"));
        coches.add(new Coche("Seat Leon;"));
        coches.add(new Coche("Renault Laguna"));

        System.out.println(coches);

        /* para que nos muestre el contenido de cada referencia de memoria,
            creamos el método toString en la clase Coche */

        // Ahora vamos a mostrar cada posición de la lista. Se muestra una debajo de otra
        for (Coche coche : coches) {
            System.out.println(coche);
        }

        /* Aquí avanzamos hasta la posición 3 de la lista y mostramos el contenido
            de esa posición */
        for (int i = 0; i < coches.size(); i++) {
            if (i == 2) {       // En Arrays y Listas siempre se empieza a contar en la posición 0
                System.out.println(coches.get(i));
            }
        }

    }
}
