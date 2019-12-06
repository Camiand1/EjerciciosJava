import java.util.Scanner;

public class EjercicioSiete {

    public void comprobacionNumero(){

        int numero;
        do {
            ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escriba un numero: ");
            validadorNumero.validacionNumero(teclado);
            numero = teclado.nextInt();
        } while (numero < 0);

        System.out.println("El numero es: " + numero);
    }
}
