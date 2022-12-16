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

        cliente.nombre = "Juan J.";
        cliente.edad = 47;
        cliente.telefono = 661662663;
        cliente.setCredito(15000);

        trabajador.nombre = "Pedro";
        trabajador.edad = 40;
        trabajador.telefono = 667668669;
        trabajador.setSalario(1500);

        System.out.println ("CLIENTE");
        System.out.println ("-------");
        System.out.println (cliente.nombre);
        System.out.println ("Edad " + cliente.edad + " años");
        System.out.println ("Teléfono: " + cliente.telefono);
        System.out.println("Crédito disponible: " + cliente.getCredito() + "€");
        System.out.println (" ");

        System.out.println ("TRABAJADOR");
        System.out.println ("----------");
        System.out.println (trabajador.nombre);
        System.out.println ("Edad " + trabajador.edad + " años");
        System.out.println ("Teléfono: " + trabajador.telefono);
        System.out.println ("Salario: " + trabajador.getSalario() + "€");
    }
}

class Persona {
    byte edad;
    String nombre;
    int telefono;

}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return this.credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}