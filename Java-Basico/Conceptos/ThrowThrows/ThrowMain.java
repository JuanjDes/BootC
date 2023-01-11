                                            // USO DE THROW Y THROWS PARA CONTROLAR EXCEPCIONES

package gestionexcepciones;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {

        // Capturamos la excepción lanzada por el método leerNombres()
        try {
            leerNombres();
        } catch (NameFormatException e) {
            e.printStackTrace();
        }
    }


    /** Método que lee nombres de consola y verifica que tengan longitud igual o mayor a 8 caracteres **/
    private static void leerNombres() throws NameFormatException {   // Con throws le indicamos al método que va a lanzar una excepcion

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        while (teclado.hasNext()) {
            System.out.println("Introduce un nombre");
            String nombre = teclado.nextLine();
            if (nombre.length() < 8) {
                teclado.close();
                throw new NameFormatException ("El nombre debe contener mínimo 8 caracteres");  // Con throw lanzamos la excepción
            }
        }
        teclado.close();
    }
}
