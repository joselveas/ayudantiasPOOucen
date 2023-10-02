package ejemplo4;

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
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            int opcion2 = sc.nextInt();
            switch(opcion2){
                case 1:
                    System.out.println("Introduce el monto del deposito");
                    int monto = sc.nextInt();
                    cliente.realizarDeposito(monto);
                    break;
                case 2:
                    System.out.println("Introduce el monto del retiro");
                    int monto2 = sc.nextInt();
                    cliente.realizarRetiro(monto2);
                    break;
                case 3:
                    System.out.println("Tu saldo es de " + cliente.getSaldoCuenta());
                    break;
                case 4:
                    opcion = false;
                    sc.close();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(opcion);
    }
}