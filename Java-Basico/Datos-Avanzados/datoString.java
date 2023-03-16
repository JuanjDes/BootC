                            
                                //  MANEJO DE DATOS TIPO STRING

public class datoString {

    public static void main(String[] args) {
        // Declaración de variables
        String cadena = "MenSAJE de Txto";
        boolean inicio = cadena.startsWith("Men");
        boolean fin = cadena.endsWith("Texto");
        int cadenaLen = cadena.length();

        System.out.println("La longitud de la cadena de texto es " + cadenaLen + " caracteres");

        // Método toLowerCase() para convertir cadena a minúsculas
        String cadenaMinus = cadena.toLowerCase();
        System.out.println("Convertimos a minúsculas: " + cadenaMinus);

        // Método toUpperCase() para convertir cadena a mayúsculas
        String cadenaMayus = cadena.toUpperCase();
        System.out.println("Convertimos a mayúsculas: " + cadenaMayus);

        System.out.print("¿ La cadena empieza por Men ? ");
        if (inicio) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        System.out.print("¿ La cadena acaba por Texto ? ");
        if (fin) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }

        // Guardamos en letra con el método charAt(), el valor de la posición 3 de cadena
        char letra = cadena.charAt(3);
        System.out.println("La posición 3 de cadena contiene: " + letra);

        // Recorremos el String cadena y vamos mostrando el valor de cada posición
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println("Caracter actual: " + cadena.charAt(i));
        }

        /* Mostramos el String cadena al revés. Para ello i se posiciona en la última posición
            del String, mostramos el valor de la posición y restamos 1 a i. Y volvemos a mostrar
            la posición. Haste que i llegue a la posición 0 */
        for (int i = cadenaLen - 1; i >=0; i--) {
            char letrab = cadena.charAt(i);
            System.out.print(letrab);
        }

    }
}
