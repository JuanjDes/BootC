                                            //   EJEMPLOS SENCILLOS DE USO DE FUNCIONES

package com.company;


public class Funciones {

    public static void main(String[] args) {

        // OPCIÓN 1: funciones sin parámetros y sin tipo de retorno
        showMenu();

        // OPCIÓN 2: funciones sin parámetros y con tipo de retorno
        getMenu();
        System.out.println("================================");
        System.out.println("Muestro directamente getMenu \n" + getMenu());
        // También puedo crear una variable que guarde getMenu() y luego imprimimos la variable
        String menu = getMenu();
        System.out.println("================================");
        System.out.println("Muestro getMenu a través de variable \n" + menu);

        // OPCIÓN 3: funciones con parámetros y sin tipo de retorno
        System.out.println("================================");
        imprimirSaludo("OpenBootcamp");

        // OPCIÓN 4: funciones con parámetros y con tipo de retorno
        System.out.println("================================");
        String nombre = "Juan Jose";
        String apellido = "G.";
        String saludo = obtenerSaludo(nombre, apellido);
        System.out.println(saludo);

    }

// -------------------------------------------------- DECLARACIÓN DE FUNCIONES ----------------------------------


    // FUERA DEL MAIN DECLARAMOS LAS FUNCIONES QUE NECESITEMOS

    static void showMenu() {                                         // Sin parámetro y sin retorno
        System.out.println("Bienvenidos al e-Commerce de zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
    }

    static String getMenu() {                                        // Sin parámetro y con retorno
        // \n dentro del texto, hace un salto de línea
        return "Bienvenidos al e-Commerce de zapatatillas: \n 1 - Ver zapatillas \n 2 - Comprar zapatillas" +
                " \n 3 - Salir";
    }

    static void imprimirSaludo(String name) {                       // Con parámetro y sin retorno
        System.out.println("Buenas tardes " + name);
    }

    static String obtenerSaludo(String nombre, String apellido) {   // Con parámetro y con retorno
        return "Buenas tardes " + nombre + " " + apellido;
    }
    
}
