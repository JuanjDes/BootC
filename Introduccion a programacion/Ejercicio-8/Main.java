public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad((byte) 47); // Si alguien superara los 127 años, la variable tendría que ser int
        persona.setNombre("Juan José");
        persona.setTelefono(661662663);

        System.out.println("Edad: " + persona.getEdad() + " Años");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Teléfono: " + persona.getTelefono());
    }
}

class Persona {

    private byte edad;
    private String nombre;
    private int telefono;

    public void setEdad (byte edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono () {
        return this.telefono;
    }
}