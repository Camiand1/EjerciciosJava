import java.util.Scanner;

public class EjercicioOcho {

    public void ejercicioOcho() {
        String dia = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un dia de la semana: ");
        dia = teclado.nextLine();
        switch (dia.toLowerCase()) {
            case ("lunes"): {
                System.out.println("Dia laboral");
                break;
            }
            case ("martes"): {
                System.out.println("Dia laboral");
                break;
            }
            case ("miercoles"): {
                System.out.println("Dia laboral");
                break;
            }
            case ("jueves"): {
                System.out.println("Dia laboral");
                break;
            }
            case ("viernes"): {
                System.out.println("Dia laboral");
                break;
            }
            case ("sabado"): {
                System.out.println("No se labora");
                break;
            }
            case ("domingo"): {
                System.out.println("No se labora");
                break;
            }
        }
    }
}
