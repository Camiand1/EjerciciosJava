public class Electrodomestico {

    int PESO_BASE = 5;
    int PRECIO_BASE = 100;

    public int precioBase = PRECIO_BASE;
    private String color = "blanco";
    private char consumoEnergetico = 'F';
    private int peso = PESO_BASE;
    int precioFinal = precioFinal(precioBase);

    public Electrodomestico(){

    }


    public Electrodomestico(int precioBase, int peso) {
        this.precioFinal = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioFinal = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
        comprobarColor(color);
        precioFinal(precioBase);
    }

    public int getPrecioBase() {
        return precioFinal;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra){

        if(letra=='A' || letra=='B'|| letra=='C'|| letra=='D'|| letra=='E'|| letra=='F'){
            consumoEnergetico=letra;
        }else{
            consumoEnergetico='F';
        }
    }

    private void comprobarColor(String color){
        switch (color) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                break;
            default:
                color = "blanco";
                break;
        }
    }

    public int precioFinal(int precioBase){
        switch(consumoEnergetico){
            case 'A':{
                this.precioFinal = precioBase + 100;
            } case 'B':{
                this.precioFinal =precioBase + 80;
            } case 'C':{
                this.precioFinal =precioBase + 60;
            } case 'D':{
                this.precioFinal =precioBase + 50;
            } case'E':{
                this.precioFinal =precioBase + 60;
            } case 'F':{
                this.precioFinal =precioBase + 10;
            }
        }if (peso>=0 && peso<=19){
            this.precioFinal =precioFinal + 10;
        }if (peso>=20 && peso<=49){
            this.precioFinal =precioFinal + 50;
        }if (peso>=50 && peso<=79){
            this.precioFinal =precioFinal + 80;
        }if (peso>80){
            this.precioFinal =precioFinal + 100;
        }return this.precioFinal;
    }



    public void ejercicioDieciSiete(){
        Electrodomestico[] Electrodomesticos = new Electrodomestico[10];
        Electrodomesticos[0] = new Electrodomestico(80,40);
        Electrodomesticos[1] = new Television(90, 55);
        Electrodomesticos[2] = new Lavadora(70,50);
        Electrodomesticos[3] = new Lavadora(45,40);
        Electrodomesticos[4] = new Television(55,"rojo",'D',48,55,false);
        Electrodomesticos[5] = new Television(99,"gris",'C',75,30,true);
        Electrodomesticos[6] = new Television(60,"morado",'B',29,30,false);
        Electrodomesticos[7] = new Television(80,"blanco",'E',40,55,true);
        Electrodomesticos[8] = new Lavadora(80,50);
        Electrodomesticos[9] = new Lavadora(99,"gris", 'D',65,60);

        String precioFinalElectrodomestico = "";
        String precioFinalLavadora = "";
        String precioFinalTelevision = "";
        //int precioFinal = 0;
        int sumaTotalElectrodomesticos = 0;


        for(int i = 0; i < Electrodomesticos.length; i++){

            if(Electrodomesticos[i] instanceof Lavadora){
                precioFinalLavadora = precioFinalLavadora + Electrodomesticos[i].precioFinal(i)+ ", ";


            }else if(Electrodomesticos[i] instanceof Television) {
            precioFinalTelevision = precioFinalTelevision + Electrodomesticos[i].precioFinal(i)+ ", ";

            }else if(Electrodomesticos[i] != null){
            precioFinalElectrodomestico = precioFinalElectrodomestico + Electrodomesticos[i].precioFinal(i)+ ", ";

            for (int j=0; j<Electrodomesticos.length; j++){
                sumaTotalElectrodomesticos+=Electrodomesticos[j].precioFinal;
            }
        }
    }

        System.out.println("El precio de la lavadora es: "+precioFinalLavadora);
        System.out.println("El precio del televisor es: "+precioFinalTelevision);
        System.out.println("El precio del electrodomestico es: "+precioFinalElectrodomestico);
        System.out.println("El precio total de los Electrdomésticos es: "+sumaTotalElectrodomesticos);
    }
}


