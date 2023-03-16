
                                    // MANEJO DE ARRAY BIDIMENSIONAL


public class arrayBidimensional {

    public static void main(String[] args) {

        // Vamos a crear un array bidimensional con 2 filas y 4 columnas
        int arrayBidi[][] = new int[2][4];
        arrayBidi[0][0] = 1; // Fila 0 columna 0 contiene el valor 1
        arrayBidi[0][1] = 2; // Fila 0 columna 1 contiene el valor 1
        arrayBidi[0][2] = 3; // Fila 0 columna 2 contiene el valor 1
        arrayBidi[0][3] = 4; // Fila 0 columna 3 contiene el valor 1

        arrayBidi[1][0] = 10; // Fila 1 columna 0 contiene el valor 10
        arrayBidi[1][1] = 20; // Fila 1 columna 1 contiene el valor 20
        arrayBidi[1][2] = 30; // Fila 1 columna 2 contiene el valor 30
        arrayBidi[1][3] = 40; // Fila 1 columna 3 contiene el valor 40

        // Ahora recorremos el array bidimensional. Utilizando un for dentro de otro for
        for (int i = 0; i < arrayBidi.length; i++) {
            System.out.println("Valor de i: " + i);
            // Con este segundo for recorremos las columnas de la fila i
            for (int j = 0; j < arrayBidi[1].length; j++) {
                System.out.print("Estoy en Fila: " + i + ", Columna: " + j);
                System.out.println(" - Valor: " + arrayBidi[i][j]);
            }
        }

    }
}
