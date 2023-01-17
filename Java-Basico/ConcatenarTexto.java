                // CREAR ARRAY DE TEXTO Y MOSTRAR EN PANTALLA EL TEXTO DEL ARRAY CONCATENADO

package com.company.estructurascontrol.repeticion;

public class ConcatenarTexto {

    public static void main(String[] args) {

        String[] texto = {"Hola", "Como estas", "?"};

        for (String varTexto : texto) {
            System.out.print(varTexto + " ");
        }
    }
}
