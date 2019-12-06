import java.util.Scanner;

import static java.lang.Math.PI;

public class EjercicioTres {

    private double radio;

    public void areaCirculo(){

        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se calculará el area del un circulo, por favor introduce el valor del radio del circulo: ");
        validadorNumero.validacionNumero(teclado);
        radio = teclado.nextDouble();

    }
    public void calculoAreaCirculo(){
        radio = Math.pow(radio, 2);
        double area = (PI * radio);
        System.out.println("El area del circulo es: " + area);
    }
}
