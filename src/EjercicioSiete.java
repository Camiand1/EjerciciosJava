import java.util.Scanner;

public class EjercicioSiete {

    public void ejercicioSiete(){
        int numero;

        do {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Escriba un numero: ");
            numero = teclado.nextInt();
        } while (numero < 0);

        System.out.println("El numero es: " + numero);
    }
}
