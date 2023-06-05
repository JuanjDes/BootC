// UNA DE LAS FORMAS DE INICIALIZAR UNA MATRIZ BIDIMENSIONAL DE 5*5. SE RECORRE CON BUCLE FOR-EACH

package com.company;

public class UsoArrayIV {

    public static void main(String[] args) {

        int[][] array = {
                {10,15,16,17,21},
                {2,24,25,27,43},
                {67,54,23,45,56},
                {34,35,36,37,38},
                {78,65,54,23,56}
        };

        //Este primer bucle for-each mete la primera fila completa de array en el array declarado fila[]
        //                SE VAN METIENDO FILAS COMPLETAS. POR ESO SE DECLARA fila COMO ARRAY
        for (int[] fila:array) {
            System.out.println("");
            // Este segundo for-each (normal) recorre cada columna de fila y la muestra en pantalla
            for (int z:fila) {
                System.out.print(z + " ");
            }
        }
    }
}
