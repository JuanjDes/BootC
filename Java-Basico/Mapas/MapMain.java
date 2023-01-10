                                            //  M A P A S


package mapas;

import java.util.Map;
import java.util.HashMap;

public class MapMain {

    public static void main(String[] args) {

        // Vamos a crear un mapa de pares de clave - valor en el que almacenaremos personas
        Map<String, String> personas = new HashMap<>();

        // También podemos crear un mapa de un objeto. En este caso el objeto MapCoche de la clase MapCoche
        Map<String, MapCoche> coche = new HashMap<>();

        // Asignamos datos a los mapas
        coche.put("12345H", new MapCoche());
        personas.put("12345H", "Nombre Apellidos 1");
        personas.put("13567F", "Nombre Apellidos 2");
        personas.put("23456G", "Nombre Apellidos 3");

        System.out.println(coche);
        System.out.println(personas);
        System.out.println("------------------------------------------------");

                    // FORMAS MÁS COMUNES DE ITERAR SOBRE LOS MAPAS

        // 1. Con el bucle for recorremos las claves (key) del mapa personas y las mostramos en pantalla
        for(String key : personas.keySet()) {
            System.out.println(key);
        }

        // 2. Con este otro for recorremos los valores del mapa personas y las mostramos en pantalla
        for(String datos : personas.values()) {
            System.out.println(datos);
        }

        // 3. Con este otro for recorremos las claves y valores del mapa personas y las mostramos en pantalla
        for(Map.Entry<String, String> pares : personas.entrySet()) {
            System.out.println(pares.getKey() + " " + pares.getValue());
        }

    }
}
