public class Electrodomestico {

    public int precio = 100;
    public String color = "blanco";
    public  char consumoE = 'F';
    public int peso = 5;

    public Electrodomestico(){
        comprobarConsumo(consumoE);
        comprobarColor(color);
        precioFinal(precio);
    }
    public Electrodomestico(int precio, int peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomestico(int precio, String color, char consumoE, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoE = consumoE;
        this.peso = peso;
        comprobarConsumo(consumoE);
        comprobarColor(color);
        precioFinal(precio);
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoE() {
        return consumoE;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarConsumo(char letra){

        if(letra=='A' || letra=='B'|| letra=='C'|| letra=='D'|| letra=='E'|| letra=='F'){
            consumoE=letra;
        }else{
            consumoE='F';
        }
    }

    private void comprobarColor(String color){
        if(color=="blanco" || color=="negro" || color=="rojo" || color=="azul" || color=="gris"){
        }else{
            color="blanco";
        }
    }

    public int precioFinal(double precio){
        switch(consumoE){
            case 'A':{
                this.precio =100;
            } case 'B':{
                this.precio =80;
            } case 'C':{
                this.precio =60;
            } case 'D':{
                this.precio =50;
            } case'E':{
                this.precio =60;
            } case 'F':{
                this.precio =10;
            }
        }if (peso>=0 && peso<=19){
            this.precio =10;
        }if (peso>=20 && peso<=49){
            this.precio =50;
        }if (peso>=50 && peso<=79){
            this.precio =80;
        }if (peso>80){
            this.precio =100;
        }return this.precio;
    }
}

public class Lavadora extends Electrodomestico{

    private static Object Electrodomestico;
    private int carga=5;

    public Lavadora(){
    }

    public Lavadora(int precio, int peso) {
        super(precio, peso);
    }

    public Lavadora(String base) {
        super();
    }

    public Lavadora(int precio, String color, char consumoE, int peso) {
        super(precio, color, consumoE, peso);
    }

    public Lavadora(int precio, String color, char consumoE, int peso, int carga) {
        super(precio, color, consumoE, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public int precioFinal(double precio) {
        if (carga>30){
            this.precio =50;
        }
        return super.precioFinal(precio);
    }
}

public class Television extends Electrodomestico{

    private static Object Electrodomestico;
    public int resolucion = 20;
    public boolean sincronizadorTDT = false;

    public Television(){
    }

    public Television(int precio, int peso) {
        super(precio, peso);
    }

    public Television(int precio, String color, char consumoE, int peso, int resolucion, boolean sincronizadorTDT) {
        super(precio, color, consumoE, peso);
        this.resolucion = resolucion;
        this.sincronizadorTDT = sincronizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean SincronizadorTDT() {
        return sincronizadorTDT;
    }

    @Override
    public int precioFinal(int precio) {
        int price;
        int priceNew = 0;
        if(resolucion>40){
            price= (int) (precio*(0.3));
            priceNew= (int) (price+precio);
            precio=priceNew;
        }if(sincronizadorTDT=true){
            precio=priceNew +50;
        }
        return super.precioFinal(precio);
    }

    public static void main(String[] args){
        Electrodomestico[] Electrodomesticos = new Electrodomestico[10];
        Electrodomesticos[0] = new Lavadora(80,40);
        Electrodomesticos[1] = new Television(90, 55);
        Electrodomesticos[1] = new Lavadora(100,380);
        Electrodomesticos[2] = new Lavadora(70,50);
        Electrodomesticos[3] = new Lavadora(100,"negro", 'E',50);
        Electrodomesticos[4] = new Television(55,"rojo",'D',48,55,false);
        Electrodomesticos[5] = new Television(99,"gris",'C',75,30,true);
        Electrodomesticos[6] = new Television(60,"morado",'B',29,30,false);
        Electrodomesticos[7] = new Television(80,"blanco",'E',40,55,true);
        Electrodomesticos[8] = new Lavadora(80,50);
        Electrodomesticos[9] = new Lavadora(99,"gris", 'D',65,60);

        boolean precioFElectrodomestico;
        boolean precioFLavadora;
        boolean precioFTelevision;
        boolean precioFi;

        for(int i=0; i<Electrodomesticos.length; i++){
            if(Electrodomesticos[i] instanceof Electrodomestico){
                precioFElectrodomestico = Electrodomesticos[i].precioFinal(git);

            }else if(Electrodomesticos[i] instanceof Lavadora){
                precioFLavadora = Electrodomesticos[i].precioFinal();

            } else if(Electrodomesticos[i] instanceof Television){
                precioFTelevision = Electrodomesticos[i].precioFinal();

            }

        }
        precioFi = precioFElectrodomestico + precioFLavadora + precioFTelevision;
        System.out.println("El precio del Electrodoméstico es "+precioFElectrodomestico);
        System.out.println("El precio de la Lavadora es "+precioFLavadora);
        System.out.println("El precio del Televisor es "+precioFTelevision);
        System.out.println("El resultado final es: "+ precioFi);

    }

}