import java.util.Scanner;

public class EjercicioOcho {

    private String dia;

    public void diaSemana() {

        ValidacionEntradaScanner validadorPalabra = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba un dia de la semana: ");
        validadorPalabra.validacionPalabra(teclado);
        dia = teclado.nextLine();

    }
    public void tipoDiaSemana(){
        switch (dia.toLowerCase()) {
            case ("lunes"):
            case ("martes"):
            case ("miercoles"):
            case ("jueves"):
            case ("viernes"): {
                System.out.println("Dia laboral");
                break;
            }
            case ("sabado"):
            case ("domingo"): {
                System.out.println("No se labora");
                break;
            }
        }
    }

}
