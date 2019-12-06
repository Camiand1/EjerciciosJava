import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionEntradaScanner {

    public void validacionNumero(Scanner teclado){
        while(!teclado.hasNextInt()){
            System.out.println("Valor ingresado incorrecto, no es un numero, vuelva a intentarlo");
            teclado.next();
        }
    }

    public void validacionPalabra(Scanner teclado){
        CharSequence tecladoChar = teclado.nextLine();
        if (!Pattern.matches("[a-zA-Z]+", tecladoChar)) {
            System.out.println("Valor ingresado incorrecto, no es una palabra, vuelva a intentarlo");

        }
    }
}