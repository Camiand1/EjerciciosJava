import java.util.Scanner;

import static java.lang.Math.PI;

public class EjercicioTres {

    public void ejercicioTres(){

        double radio;
        double radioElevado2 = 0.0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Se calculará el area del un circulo, por favor introduce el valor del radio del circulo: ");
        radio = teclado.nextDouble();
        radioElevado2 = Math.pow(radio, 2);
        double Area = (PI * radioElevado2);
        System.out.println("El area del circulo es: " + Area);
    }
}
