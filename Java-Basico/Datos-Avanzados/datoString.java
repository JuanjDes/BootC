
public class datoString {

    public static void main(String[] args) {

                                    // Dos formas de añadir valores a un array
        int arrayUno[] = {1,2,3,4,5};
        String arrayDos[] = {
                "Juan",
                "Pedro",
                "Pepito"
        };

                                    // Formas de recorrer un array:

        // Forma corta, con un for each
        System.out.print ("Valores del arrayUno: ");
        for (int i : arrayUno) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Este println muestra la longitud del arrayDos
        System.out.println("La longitud del arrayDos es: " + arrayDos.length);

        // La forma corta nos muestra el valor de cada posición.
        System.out.print("Nombres actuales del arrayDos: ");
        for (String i : arrayDos) {
            System.out.print(i + ",");
        }
        System.out.println();

        // Forma larga con for típico.
        System.out.print("Posiciones y valores del arrayDos: ");
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.print(i + " ");        // Asi solo muestra la posicion del array y no el valor.
            System.out.print(arrayDos[i] + ","); // Asi nos muestra el valor del array.
        }
        System.out.println();

        /* Podemos sacar un valor del array a una variable externa
            Tenemos que declarar la variable fuera del for */
        String ultimoNombre = "";
        for (int i = 0; i < arrayDos.length; i++) {
            ultimoNombre = arrayDos[i];
        }
        System.out.println("Último valor del arrayDos: " + ultimoNombre);
    }
}