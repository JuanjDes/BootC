            /* EJEMPLO DE CÓDIGO PARA TRABAJAR CON LISTAS Y ARRAYLIST() SIN UTILIZAR toString()*/


package prueba1;
import com.company.Coche;

import java.util.ArrayList;
import java.util.List;

            public class Prueba1Main {

                public static void main(String[] args) {

                    // Lista simple de nombres y mostramos el valor de cada posicion de la lista
                    List<String> nombres = new ArrayList<>();
                    nombres.add("Pedro");
                    nombres.add("Juan");
                    nombres.add("Paco");

                    for (String nombreb : nombres) {
                        System.out.println(nombreb);
                    }

                    // Lista de una clase Prueba1Coche sin método toString
                    List<Prueba1Coche> coches = new ArrayList<>();
                    coches.add(new Prueba1Coche("Seat Ibiza"));
                    coches.add(new Prueba1Coche("Seat Leon;"));
                    coches.add(new Prueba1Coche("Renault Laguna"));

                    /* Como no hemos creado el método toString en Prueba1Coche, nos muestra el valor
                        de la referencia de cada posición, no el contenido */
                    System.out.println(coches);

                    // Ahora vamos a mostrar cada posición de la lista. La mostrará una debajo de otra
                    for (Prueba1Coche coche : coches) {
                        System.out.println(coche);
                    }

                    // Aquí avanzamos hasta la posición 3 de la lista y mostramos el contenido
                    //   de esa posición
                    for (int i = 0; i < coches.size(); i++) {
                        if (i == 2) {
                            System.out.println(coches.get(i));
                        }
                    }

                }
            }