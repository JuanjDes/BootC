package com.company;

public class Main {

    public static void main(String[] args) {

        // Tipo de datos primitivos -> no admiten valor null
        // byte edad = null;  Daría error porque estos datos primitivos no admiten valor null
        byte edad = -125;          //  8 Bits. Admite valores entre -128 a 127
        short numero1 = 32767;     // 16 Bits. Admite valores entre -32.768 a 32.767 Tiene que ser inicializado
        int numero2 = 1000000;     // 32 Bits. Admite valores entre -2³¹ a 2³¹-1
        long numero3 = 1000000000; // 64 Bits. Admite valores entre -2⁶³ a 2⁶³-1
        float decimal1 = 1.5f;     // Para utilizar 1 decimal. Utilizamos f para identificarlo (float)
        double decimal2 = 2.56d;   // Para utilizar 2 decimales. Utilizamos d para identificarlo (double)
        char caracter1 = 'a';      // Admite 1 sólo caracter entre comillas simples
        String caracter2 = "Varios caracteres"; // Admite cadena de caracteres entre comillas dobles
        boolean verdadero = true; // Admite true o false.

        System.out.println("DATOS PRIMITIVOS");
        System.out.println("----------------");
        System.out.println("byte = " + edad);
        System.out.println("short = " + numero1);
        System.out.println("int = " + numero2);
        System.out.println("long = " + numero3);
        System.out.println("float = " + decimal1);
        System.out.println("double = " + decimal2);
        System.out.println("char = " + caracter1);
        System.out.println("String = " + caracter2);
        System.out.println("Boolean = " + verdadero);

        // Tipo de datos envoltorio -> Ponemos la inicial en mayúscula para que admitan valor null
        Byte edad2 = null;
        Short numero4 = null;
        Integer numero5 = null;     // Hay que poner Integer y no Int
        Long numero6 = null;
        Float decimal3 = null;
        Double decimal4 = null;
        Character caracter3 = null;
        String caracter4 = null;
        Boolean pregunta = null;

        System.out.println();
        System.out.println("DATOS ENVOLTORIO");
        System.out.println("----------------");
        System.out.println("Byte = " + edad2 + "/ Short = " + numero4 + "/ Integer = " + numero5
                + "/ Long = " + numero6 + "/ Float = " + decimal3 + "/ Double = " + decimal4
                + "/ Character = " + caracter3 + "/ String = " + caracter4 + "/ Boolean = " + pregunta);
    }
}