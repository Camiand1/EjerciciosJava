public class Lavadora extends Electrodomestico{

    private int precioCarga = 0;
    private static Object Electrodomestico;
    private int carga = 5;

    public Lavadora(){
    }

    public Lavadora(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal(int precioCarga) {
        if (carga>30){
            this.precioCarga =50;
        }
        return super.precioFinal(precioCarga);
    }
}
