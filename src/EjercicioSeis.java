public class EjercicioSeis {

    public void ejercicioSeis(){
        String numerosPares = "";
        String numerosImpares = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numerosPares = numerosPares + i + ", ";
            } else {
                numerosImpares = numerosImpares + i + ", ";
            }
        }
        System.out.println("Numeros pares: "+numerosPares);
        System.out.println("Numeros numerosImpares: "+numerosImpares);
    }
}

