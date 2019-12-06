import java.util.Scanner;

public class EjercicioDiez {

    public void ejercicioDiez(){
        String frase="";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        frase = teclado.nextLine();

        System.out.println(frase.replace(" ", ""));
    }
}
