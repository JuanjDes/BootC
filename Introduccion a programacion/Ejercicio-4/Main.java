public class Main {
    public static void main(String[] args)
    {
        int numeroIf = -125;
        int numeroWhile = 0;
        int numeroDoWhile = 3;
        String estacion = "ni idea";

        // Ejemplo con bucle IF
        System.out.println("----------IF------------------");
        if (numeroIf == 0) { System.out.println("numeroIf es 0"); }
        else if (numeroIf < 0) { System.out.println("numeroIf es negativo"); }
        else System.out.println("numeroIf es positivo");

        // Ejemplo con bucle WHILE
        System.out.println("----------WHILE------------------");
        while (numeroWhile < 3)
        { System.out.println(numeroWhile);
          numeroWhile ++; } numeroWhile = 0;

        // Ejemplo con bucle DoWhile
        System.out.println("----------DoWhile------------------");
        do
        { System.out.println(numeroDoWhile);
          numeroDoWhile ++; } while (numeroDoWhile < 3);

        // Ejemplo con bucle FOR
        System.out.println("----------FOR------------------");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++)  // Al ser condición <=3 mostrará también el 3 en pantalla
        { System.out.println(numeroFor); }

        // Ejemplo con bucle SWITCH
        System.out.println("----------SWITCH------------------");
        switch (estacion) {
            case "verano":
                System.out.println("Es Verano");
                break;
            case "otoño":
                System.out.println("Es Otoño");
                break;
            case "invierno":
                System.out.println("Es Invierno");
                break;
            case "primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("La estación es incorrecta o no esta en minúsculas");
        }

    }
}
