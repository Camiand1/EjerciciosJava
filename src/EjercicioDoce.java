import java.util.Scanner;

public class EjercicioDoce {
    public  void ejercicioDoce() {
        String palabra1 = "";
        String palabra2 = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la primer palabra: ");
        palabra1 = teclado.nextLine();
        System.out.println("Introduzca la segunda palabra: ");
        palabra2 = teclado.nextLine();

        int contadorP1a = 0;
        int contadorP1e = 0;
        int contadorP1i = 0;
        int contadorP1o = 0;
        int contadorP1u = 0;
        int contadorP2a = 0;
        int contadorP2e = 0;
        int contadorP2i = 0;
        int contadorP2o = 0;
        int contadorP2u = 0;

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales");
        }
        if (palabra1 != palabra2) {
            //System.out.println("Una palabra es mas larga");
            if (palabra1.length() > palabra2.length()) {
                System.out.println("La palabra " + palabra1 + " es mas larga");
            } else {
                System.out.println("La palabra " + palabra2 + " es mas larga");
            }
            for (int i = 0; i < palabra1.length(); i++) {
                if (palabra1.charAt(i) == 'a') {
                    contadorP1a++;
                }
                if (palabra1.charAt(i) == 'e') {
                    contadorP1e++;
                }
                if (palabra1.charAt(i) == 'i') {
                    contadorP1i++;
                }
                if (palabra1.charAt(i) == 'o') {
                    contadorP1o++;
                }
                if (palabra1.charAt(i) == 'u') {
                    contadorP1u++;
                }
            }
            System.out.println("La palabra " + palabra1 + " contiene " + contadorP1a + " vocales a, " + contadorP1e + " vocales e, " + contadorP1i + " vocales i, " + contadorP1o + " vocales o y " + contadorP1u + " vocales u");
            for (int i = 0; i < palabra2.length(); i++) {
                if (palabra2.charAt(i) == 'a') {
                    contadorP2a++;
                }
                if (palabra2.charAt(i) == 'e') {
                    contadorP2e++;
                }
                if (palabra2.charAt(i) == 'i') {
                    contadorP2i++;
                }
                if (palabra2.charAt(i) == 'o') {
                    contadorP2o++;
                }
                if (palabra2.charAt(i) == 'u') {
                    contadorP2u++;
                }
            }
            System.out.println("La palabra " + palabra2 + " contiene " + contadorP2a + " vocales a, " + contadorP2e + " vocales e, " + contadorP2i + " vocales i, " + contadorP2o + " vocales o y " + contadorP2u + " vocales u");

        }
    }
}

