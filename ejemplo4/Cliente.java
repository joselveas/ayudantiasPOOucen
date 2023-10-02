package ejemplo4;

public class Cliente{
    private String nombre;
    private int saldoCuenta;
    public Cliente(){}
    public Cliente(String nombre){
        this.nombre = nombre;
        this.saldoCuenta = 0;
    }
    public String getNombre(){return nombre;}
    public int getSaldoCuenta(){return saldoCuenta;}
    public void realizarDeposito(int monto){
        if(monto < 0){
            System.out.println("El valor de la deposito debe ser positivo");
            return;
        }
        this.saldoCuenta += monto;
        System.out.println("Se ha depositado el valor de " + monto);
    }
    public void realizarRetiro(int monto){
        if(monto < 0){
            System.out.println("El valor de la retiro debe ser positivo");
            return;
        }
        if(monto > this.saldoCuenta){
            System.out.println("No hay suficiente saldo en la cuenta");
            return;
        }
        this.saldoCuenta -= monto;
        System.out.println("Se ha retirado el valor de " + monto);
    }
}