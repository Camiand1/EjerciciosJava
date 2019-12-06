import java.util.Scanner;

public class EjercicioDiez {


    private String frase="";

    public void eliminarEspacios(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        frase = teclado.nextLine();
        System.out.println(frase.replace(" ", ""));
    }
}
