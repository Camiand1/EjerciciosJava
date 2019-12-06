import java.util.Scanner;

public class EjercicioOnce {

    public void ejercicioOnce(){
        String frase = "";
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir una frase: ");
        frase = teclado.nextLine();
        int a;
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;
        a = frase.length();
        for (int i = 0; i < a; i++) {
            if (frase.charAt(i) == 'a') {
                contadora++;
            }
            if (frase.charAt(i) == 'e') {
                contadore++;
            }
            if (frase.charAt(i) == 'i') {
                contadori++;
            }
            if (frase.charAt(i) == 'o') {
                contadoro++;
            }
            if (frase.charAt(i) == 'u') {
                contadoru++;
            }
        }
        System.out.println("La palabra " + frase + " contiene " + contadora + " vocales a, " + contadore + " vocales e, " + contadori + " vocales i, " + contadoro + " vocales o y " + contadoru + " vocales u");
    }
}

