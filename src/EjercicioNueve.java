import java.util.Scanner;

public class EjercicioNueve {

    public void ejercicioNueve(){

        String frase = "La sonrisa será la mejor arma contra la tristeza - ";
        String fraseIntroducida;
        String frasesConcatenadas;
        frase = frase.replace('a', 'e');

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        fraseIntroducida = teclado.nextLine();

        frasesConcatenadas = frase.concat(fraseIntroducida);
        System.out.println(frasesConcatenadas);
    }
}
