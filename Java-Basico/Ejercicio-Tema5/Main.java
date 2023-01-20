                /* EJERCICIO DE INTERFACE. CREO LA INTERFACE cocheCRUD -> ES IMPLEMENTADA EN cocheCRUDimpl.
                    cocheCRUDimpl tiene que crear obligatoriamente todos los métodos y con el mismo nombre
                    que tiene la interface. */

package poo.javabasico.tema5;

public class Main {

    public static void main(String[] args) {

        // El objeto coche de la interface cocheCRUD utiliza los métodos de la clase cocheCRUDimpl
        cocheCRUD coche = new cocheCRUDimpl();

        coche.save();
        coche.delete();
        coche.findAll();

    }
}
