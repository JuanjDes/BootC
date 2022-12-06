public class Main
{
    public static void main(String[] args)
    {
        Coche miCoche = new Coche();
        miCoche.sumapuertas();

        // Sacamos por pantalla el valor de la función sumapuertas incrementado en 1
        System.out.println(miCoche.sumapuertas(1));

    }
}