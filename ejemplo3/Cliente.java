package ejemplo3;

public class Cliente {
    private String nombre;
    private int puntosAcumulados;
    public Cliente(){}
    public Cliente(String nombre){
        this.nombre = nombre;
        this.puntosAcumulados = 0;
    }
    public String getNombre(){return nombre;}
    public int getPuntosAcumulados(){return puntosAcumulados;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void realizarCompra(int montoCompra){
        if(montoCompra < 0){
            System.out.println("El valor de la compra debe ser positivo");
            return;
        }
        int puntosExtra = montoCompra / 100;
        this.puntosAcumulados += puntosExtra;
        System.out.println("Se ha comprado el objeto con valor de " + montoCompra);
        System.out.println("Se han obtenido " + puntosExtra + " puntos");
    }
    public void canjearPuntos(int puntos, int montoCompra){
        if(montoCompra < 0){
            System.out.println("El valor de la compra debe ser positivo");
            return;
        }
        if(puntos > this.puntosAcumulados){
            System.out.println("Puntos insuficientes");
            return;
        }
        System.out.println("Se canjearon " + puntos + " puntos");
        this.puntosAcumulados -= puntos;
        montoCompra = montoCompra - puntos;
        if(montoCompra<=0){
            int puntosRestantes = 0 - montoCompra;
            System.out.println("El valor de la compra ha llegado a 0, se devuelven " + puntosRestantes + " puntos");
            realizarCompra(montoCompra);
            this.puntosAcumulados += puntosRestantes;
            return;
        }
        System.out.println("El valor de la compra ha sido ajustado a " + montoCompra);
        realizarCompra(montoCompra);
    }
}
