import java.util.Scanner;

public class EjercicioCuatro {

    public void ejercicioCuatro() {

        int IVA = 21;
        double precioProducto;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        precioProducto = teclado.nextDouble();

        double precioIva = ((precioProducto * IVA) / 100);
        double precioIvaFinal = (precioIva + precioProducto);
        System.out.println("El precio del producto mas el iva del 21% es: " + precioIvaFinal);

    }
}
