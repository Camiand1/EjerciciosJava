import java.util.Scanner;

public class EjercicioCatorce {

    public void ejercicioCatorce(){
        int numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        numero = teclado.nextInt();
        for (int i = numero; i <= 1000; i += 2) {
            System.out.print(i + ", ");
        }
    }
}
