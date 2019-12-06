import java.util.Scanner;

public class EjercicioQuince {
    public void ejercicioQuince(){
        int numero;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("*****GESTIÓN CINEMATROGRÁFICA*****");
            System.out.println("1-NUEVO ACTOR");
            System.out.println("2-BUSCAR ACTOR");
            System.out.println("3-ELIMINAR ACTOR");
            System.out.println("4-MODIFICAR ACTOR");
            System.out.println("5-VER TODOS LOS ACTORES");
            System.out.println("6-VER PELICULAS DE LOS ACTORES");
            System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            System.out.println("8-SALIR");

            System.out.println("Digite un número");
            numero = teclado.nextInt();
            if (numero > 8) {
                System.out.println("OPCION INCORRECTA");
            }
            switch (numero) {
                case 8: {
                    break;
                }
            }
        }while(numero<8);
    }
}
