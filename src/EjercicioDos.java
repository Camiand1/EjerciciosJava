import java.util.Scanner;

public class EjercicioDos {

    private int primerNumero;
    private int segundoNumero;

    public void numerosAComparar(){

        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir el primer número: ");
        validadorNumero.validacionNumero(teclado);
        primerNumero = teclado.nextInt();

        System.out.println("Introducir el segundo número: ");
        validadorNumero.validacionNumero(teclado);
        segundoNumero = teclado.nextInt();

    }

    public void comparacionNumeros(){
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