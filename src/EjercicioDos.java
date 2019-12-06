import java.util.Scanner;

public class EjercicioDos {

    public void ejercicioDos(){

        int primerNumero;
        int segundoNumero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el primer número: ");
        primerNumero = teclado.nextInt();
        System.out.println("Introducir el segundo número: ");
        segundoNumero = teclado.nextInt();
        if (primerNumero == segundoNumero) {
            System.out.println("Los números son iguales");
        }
        else if (primerNumero > segundoNumero) {
            System.out.println("El número mayor es: " + primerNumero);
        }else {
            System.out.println("El número mayor es: " + segundoNumero);
        }

    }
}