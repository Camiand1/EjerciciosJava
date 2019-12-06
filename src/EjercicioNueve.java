import java.util.Scanner;

public class EjercicioNueve {

    private String frase = "La sonrisa será la mejor arma contra la tristeza - ";
    private String fraseIntroducida;
    private String frasesConcatenadas;

    public void cambiarVocal() {

        frase = frase.replace('a', 'e');
    }
    public void introducirFrase(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        fraseIntroducida = teclado.nextLine();
    }
    public void concatenarFrase(){

        frasesConcatenadas = frase.concat(fraseIntroducida);
        System.out.println(frasesConcatenadas);
    }
}
