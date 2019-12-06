public class EjercicioCinco {

    public void ejercicioCinco() {
        int primerNumero = 1;
        int ultimoNumero = 100;
        String numeroPares = "";
        String numerosImpares = "";
        while (primerNumero <= ultimoNumero) {
            if (primerNumero % 2 == 0) {
                numeroPares = numeroPares + ", " + primerNumero;
                primerNumero = primerNumero + 1;
            } else {
                numerosImpares = numerosImpares + ", " + primerNumero;
                primerNumero = primerNumero + 1;
            }
        }
        System.out.println("Numeros pares: " + numeroPares);
        System.out.println("Numeros numerosImpares: " + numerosImpares);
    }
}


