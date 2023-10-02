package ejemplo3;

import java.util.Scanner;

public class ejemplo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = sc.nextLine();
        Cliente cliente = new Cliente(nombre);
        boolean opcion = true;
        do{
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1. Comprar producto");
            System.out.println("2. Canjear puntos");
            System.out.println("3. Ver puntos");
            System.out.println("4. Salir");
            int opcion2 = sc.nextInt();
            switch(opcion2){
                case 1:
                    System.out.println("Introduce el monto de la compra");
                    int montoCompra = sc.nextInt();
                    cliente.realizarCompra(montoCompra);
                    break;
                case 2:
                    System.out.println("Introduce los puntos que quieres canjear");
                    int puntos = sc.nextInt();
                    System.out.println("Introduce el monto de la compra");
                    int montoCompra2 = sc.nextInt();
                    cliente.canjearPuntos(puntos,montoCompra2);
                    break;
                case 3:
                    int puntos2 = cliente.getPuntosAcumulados();
                    System.out.println("Tienes " + puntos2 + " puntos");
                    break;
                case 4:
                    opcion = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(opcion);
    }
}
