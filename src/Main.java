import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroEjercicio = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número del ejercicio: ");
        numeroEjercicio = teclado.nextInt();
        do {
            switch (numeroEjercicio) {
                case 1:
                    System.out.println("\uD83D\uDE0D Ejercicio número 1:");
                    EjercicioUno ejercicioUno = new EjercicioUno();
                    ejercicioUno.ejercicioUno();
                    break;
                case 2:
                    System.out.println("\uD83D\uDE04  Ejercicio número 2:" );
                    EjercicioDos ejercicioDos = new EjercicioDos();
                    ejercicioDos.ejercicioDos();
                    break;
                case 3:
                    System.out.println("\uD83D\uDE0A Ejercicio número 3:");
                    EjercicioTres ejercicioTres = new EjercicioTres();
                    ejercicioTres.ejercicioTres();
                    break;
                case 4:
                    System.out.println("\uD83D\uDE1D Ejercicio número 4:");
                    EjercicioCuatro ejercicioCuatro = new EjercicioCuatro();
                    ejercicioCuatro.ejercicioCuatro();
                    break;
                case 5:
                    System.out.println("\uD83D\uDE07 Ejercicio número 5:");
                    EjercicioCinco ejercicioCinco = new EjercicioCinco();
                    ejercicioCinco.ejercicioCinco();
                    break;
                case 6:
                    System.out.println("\uD83D\uDE0E Ejercicio número 6:");
                    EjercicioSeis ejercicioSeis = new EjercicioSeis();
                    ejercicioSeis.ejercicioSeis();
                    break;
                case 7:
                    System.out.println("\uD83D\uDE3B Ejercicio número 7:");
                    EjercicioSiete ejercicioSiete = new EjercicioSiete();
                    ejercicioSiete.ejercicioSiete();
                    break;
                case 8:
                    System.out.println("Ejercicio número 8:");
                    EjercicioOcho ejercicioOcho = new EjercicioOcho();
                    ejercicioOcho.ejercicioOcho();
                    break;
                case 9:
                    System.out.println("Ejercicio número 9:");
                    EjercicioNueve ejercicioNueve = new EjercicioNueve();
                    ejercicioNueve.ejercicioNueve();
                    break;
                case 10:
                    System.out.println("Ejercicio número 10:");
                    EjercicioDiez ejercicioDiez = new EjercicioDiez();
                    ejercicioDiez.ejercicioDiez();
                    break;
                case 11:
                    System.out.println("Ejercicio número 11:");
                    EjercicioOnce ejercicioOnce = new EjercicioOnce();
                    ejercicioOnce.ejercicioOnce();
                    break;
                case 12:
                    System.out.println("Ejercicio número 12:");
                    EjercicioDoce ejercicioDoce = new EjercicioDoce();
                    ejercicioDoce.ejercicioDoce();
                    break;
                case 13:
                    System.out.println("Ejercicio número 13:");
                    EjercicioTrece ejercicioTrece = new EjercicioTrece();
                    ejercicioTrece.ejercicioTrece();
                    break;
                case 14:
                    System.out.println("Ejercicio número 14:");
                    EjercicioCatorce ejercicioCatorce = new EjercicioCatorce();
                    ejercicioCatorce.ejercicioCatorce();
                    break;
                case 15:
                    System.out.println("Ejercicio número 15:");
                    EjercicioQuince ejercicioQuince = new EjercicioQuince();
                    ejercicioQuince.ejercicioQuince();
                    break;
                case 16:
                    System.out.println("Ejercicio número 16:");
                    Persona ejercicioDieciSeis = new Persona();
                    ejercicioDieciSeis.ejercicioDieciSeis();
                    break;
                case 17:
                    System.out.println("Ejercicio número 17:");
                    Electrodomestico ejercicioDieciSiete = new Electrodomestico();
                    ejercicioDieciSiete.ejercicioDieciSiete();
                    break;
                case 18:
                    System.out.println("Ejercicio número 18:");
                    EjercicioDieciOcho ejercicioDieciOcho = new EjercicioDieciOcho();
                    ejercicioDieciOcho.ejercicioDieciOcho();
                    break;

            }
            break;

        }

        while (numeroEjercicio < 19);
        //System.out.println("No existe este número de ejercicio");

    }
}


