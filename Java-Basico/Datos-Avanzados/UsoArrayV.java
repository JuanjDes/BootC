                        /* NOS PIDE UN SALDO INICIAL UTILIZANDO JOptionPane.
                           EN CADA COLUMNA SE VA AUMENTANDO EL SALARIO EN UN % DADO */

package com.company;

import javax.swing.JOptionPane;

public class UsoArrayV {

    public static void main(String[] args) {

        int saldoInicial = Integer.parseInt(JOptionPane.showInputDialog("Saldo inicial"));
        double interes;
        double acumulado = saldoInicial;
        double[][] array = new double[5][6];
        String[] encabezados = {"10%", "11%", "12%", "13%", "14%", "15%"};

        for (String fila0:encabezados) {
            System.out.print("  " + fila0 + "     ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------------");
        for (int i = 0; i < 6; i++) {
            array[0][i] = acumulado;
            System.out.printf("%1.2f", array[0][i]);
            System.out.print("  ");
        }

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
