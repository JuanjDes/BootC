                            // CONTROL DE EXCEPCIONES (ERRORES)

package gestionexcepciones;

public class TryCatchMain {

    public static void main(String[] args){

        // No se puede dividir entre 0. Siempre va a dar error.
        try {
            int result = 5/0;                 // Dentro de try ponemos el código que puede dar error
        } catch (ArithmeticException e) {     // Si hay error lo capturamos en el objeto e
            e.printStackTrace();              // Mostramos en pantalla el error
        } finally {                           // Finally se ejecuta siempre. Haya error o no
            System.out.println("Cerrando ficheros abiertos");
        }

        // Después de mostrar el error sigue ejecutándose el código
        System.out.println("Fin de programa");
    }
}
