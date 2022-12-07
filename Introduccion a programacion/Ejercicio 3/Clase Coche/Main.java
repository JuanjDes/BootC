public class Main
{
    public static void main(String[] args)
    {
        // Se crea el objeto miCoche de la clase Coche
        Coche miCoche = new Coche();

        // Sacamos en pantalla el valor de la función sumapuertas, dentro del objeto miCoche, incrementado en 1
        System.out.println("Número de puertas: " + miCoche.sumapuertas(1));

    }
}
