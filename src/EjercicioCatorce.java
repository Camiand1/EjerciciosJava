import java.util.Scanner;

public class EjercicioCatorce {

    private int numero;

    public void introducirNumero() {

        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        validadorNumero.validacionNumero(teclado);
        numero = teclado.nextInt();

    }

    public void imprimiNumeros() {
        int numeroLimite = 1000;
        for (int i = numero; i <= numeroLimite; i += 2) {
            System.out.print(i + ", ");
        }
    }
}
