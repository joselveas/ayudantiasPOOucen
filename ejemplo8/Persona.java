package ejemplo8;

public class Persona {
    String nombre;
    public Persona(){}
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void correr(double velocidadEnMetros){
        if(velocidadEnMetros>2.8){
            System.out.println("Una persona normal no puede correr a esa velocidad");
            return;
        }
        System.out.println("La persona "+nombre+" esta corriendo a una velocidad de "+velocidadEnMetros+" m/s");
    }
    public void bicicleta(double velocidadEnMetros){
        if(velocidadEnMetros>6.9){
            System.out.println("Una persona normal no puede andar en bicileta a esa velocidad");
            return;
        }
        System.out.println("La persona "+nombre+" esta andando en la bicicleta a una velocidad de "+velocidadEnMetros+" m/s");
    }
    public void nadar(double velocidadEnMetros){
        if(velocidadEnMetros>1.2){
            System.out.println("Una persona normal no puede nadar a esa velocidad");
            return;
        }
        System.out.println("La persona "+nombre+" esta nadando a una velocidad de "+velocidadEnMetros+" m/s");
    }
    public void correr(int velocidadEnKm){
        if(velocidadEnKm>10){
            System.out.println("Una persona normal no puede correr a esa velocidad");
            return;
        }
        System.out.println("La persona "+nombre+" esta corriendo a una velocidad de "+velocidadEnKm+" km/h");
    }
    public void bicicleta(int velocidadEnKm){
        if(velocidadEnKm>25){
            System.out.println("Una persona normal no puede andar en bicileta a esa velocidad");
            return;
        }
        System.out.println("La persona "+nombre+" esta andando en la bicicleta a una velocidad de "+velocidadEnKm+" km/h");
    }
    public void nadar(int velocidadEnKm){
        if(velocidadEnKm>4){
            System.out.println("Una persona normal no puede nadar a esa velocidad");
            return;
        }
        System.out.println("La persona "+nombre+" esta nadando a una velocidad de "+velocidadEnKm+" km/h");
    }
}
