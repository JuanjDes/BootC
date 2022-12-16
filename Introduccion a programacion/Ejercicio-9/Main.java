/*
Crea una clase Persona con las siguientes variables:

La edad
El nombre
El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable
credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el teléfono, el nombre y el
credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que
solo tenga la clase Trabajador.
 */


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.setNombre("Juan J.");
        cliente.setEdad((byte) 47);
        cliente.setTelefono(661662663);
        cliente.setCredito(15000);

        trabajador.setNombre("Pedro");
        trabajador.setEdad((byte) 40);
        trabajador.setTelefono(667668669);
        trabajador.setSalario(1500);

        System.out.println ("CLIENTE");
        System.out.println ("-------");
        System.out.println (cliente.getNombre());
        System.out.println ("Edad " + cliente.edad + " años");
        System.out.println ("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito disponible: " + cliente.getCredito() + "€");
        System.out.println (" ");

        System.out.println ("TRABAJADOR");
        System.out.println ("----------");
        System.out.println (trabajador.getNombre());
        System.out.println ("Edad " + trabajador.getEdad() + " años");
        System.out.println ("Teléfono: " + trabajador.getTelefono());
        System.out.println ("Salario: " + trabajador.getSalario() + "€");
    }
}

class Persona {
    byte edad;
    String nombre;
    int telefono;

    public byte getEdad() {
        return this.edad;
    }
    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}

class Cliente extends Persona {
    private int credito;

    public int getCredito() {
        return this.credito;
    }
    public void setCredito(int credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return this.salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}