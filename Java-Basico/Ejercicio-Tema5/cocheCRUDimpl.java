package poo.javabasico.tema5;

public class cocheCRUDimpl implements cocheCRUD {

    // Estos son los 3 métodos que obligatoriamente tengo que implementar.
    @Override
    public void save() {
        System.out.println("Método save()");
    }

    @Override
    public void findAll() {
        System.out.println("Método findAll()");
    }

    @Override
    public void delete() {
        System.out.println("Método delete()");
    }

}
