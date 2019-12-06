import java.util.Scanner;

public class EjercicioCuatro {

    private double precioProducto;

    public void ejercicioCuatro() {

        ValidacionEntradaScanner validadorNumero = new ValidacionEntradaScanner();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        validadorNumero.validacionNumero(teclado);
        precioProducto = teclado.nextDouble();
    }
    public void precioProductoMasIVA(){
        int IVA = 21;
        double precioIva = ((precioProducto * IVA) / 100);
        double precioProductoIva = (precioIva + precioProducto);
        System.out.println("El precio del producto mas el iva del 21% es: " + precioProductoIva);
    }
}
