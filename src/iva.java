import java.util.Scanner;

public class iva {
    public static void main(String[] args) {



        /*4 IVA
        double precio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        precio = teclado.nextDouble();

        double pIva = ((precio*21)/100);
        double pIva2 = (pIva + precio);
        System.out.println("El precio del producto mas el iva del 21% es: "+pIva2); */


        //NUMEROS PARES E IMPARES

        //5 CICLO WHILE

        /*
        int x=1;
        String par="";
        String impares="";
        while(x<=100){
            if(x%2==0){
                par=par+", "+x;
                x=x+1;

            }else{
                impares=impares+", "+x;
                x=x+1;

            }


        }
        System.out.println("Numeros pares: "+par);
        System.out.println("Numeros impares: "+impares);
        */

        //6 CICLO FOR

        String par = "";
        String impares = "";
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                par = par + ", " + i;
            } else {
                impares = impares + ", " + i;
            }
        }
        System.out.println("Numeros pares: "+par);
        System.out.println("Numeros impares: "+impares);

    }
}
