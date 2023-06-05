                // NOS PIDE UN SALDO INICIAL UTILIZANDO JOptionPane. EN CADA COLUMNA SE VA AUMENTANDO EL SALARIO EN UN % DADO

package com.company;

import javax.swing.JOptionPane;

public class UsoArrayV {

    public static void main(String[] args) {

        int saldoInicial = Integer.parseInt(JOptionPane.showInputDialog("Saldo inicial")); // Pide introducir un saldo inicial
        double interes;
        double acumulado = saldoInicial;
        double[][] array = new double[5][6]; // Crea Array bidimensional de 5 filas * 6 columnas. Es double para que acepte decimales
        String[] encabezados = {"10%", "11%", "12%", "13%", "14%", "15%"}; // Este Array es simplemente informativo. Para cada columna

        for (String fila0:encabezados) {
            System.out.print("  " + fila0 + "     ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");
      
        // Este for es para que la 1ª fila de array nos muestre el saldo de partida (el que hemos introducido anteiormente)
        for (int i = 0; i < 6; i++) {
            array[0][i] = acumulado;
            System.out.printf("%1.2f", array[0][i]);  // Print con formato de 2 decimales
            System.out.print("  ");
        }

        // A partir de la 2ª fila de array se empiezan a calcular los porcentajes del saldo inicial
        for (int i = 1; i < 5; i++) {
            System.out.println();
            interes = 0.10;
            for (int j = 0; j < 6; j++) {
                acumulado = array[i-1][j];
                array[i][j] = acumulado+(acumulado*interes);
                System.out.printf("%1.2f", array[i][j]);
                System.out.print("  ");
                interes += 0.01;
            }
        }
    }
}
