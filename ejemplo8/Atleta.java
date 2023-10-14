package ejemplo8;

public class Atleta extends Persona{
    public Atleta(){
        super();
    }
    public Atleta(String nombre){
        super(nombre);
    }
    @Override
    public void correr(double velocidadEnMetros){
        if(velocidadEnMetros>11.6){
            System.out.println("Un atleta normal no puede correr a esa velocidad");
            return;
        }
        System.out.println("El atleta "+nombre+" esta corriendo a una velocidad de "+velocidadEnMetros+" m/s");
    }
    @Override
    public void bicicleta(double velocidadEnMetros){
        if(velocidadEnMetros>12.5){
            System.out.println("Un atleta normal no puede andar en bicileta a esa velocidad");
            return;
        }
        System.out.println("El atleta "+nombre+" esta andando en la bicicleta a una velocidad de "+velocidadEnMetros+" m/s");
    }
    @Override
    public void nadar(double velocidadEnMetros){
        if(velocidadEnMetros>2.7){
            System.out.println("Un atleta normal no puede nadar a esa velocidad");
            return;
        }
        System.out.println("El atleta "+nombre+" esta nadando a una velocidad de "+velocidadEnMetros+" m/s");
    }
    @Override
    public void correr(int velocidadEnKm){
        if(velocidadEnKm>42){
            System.out.println("Un atleta no puede correr a esa velocidad");
            return;
        }
        System.out.println("El atleta "+nombre+" esta corriendo a una velocidad de "+velocidadEnKm+" km/h");
    }
    @Override
    public void bicicleta(int velocidadEnKm){
        if(velocidadEnKm>45){
            System.out.println("Un atleta no puede andar en bicileta a esa velocidad");
            return;
        }
        System.out.println("El atleta "+nombre+" esta andando en la bicicleta a una velocidad de "+velocidadEnKm+" km/h");
    }
    @Override
    public void nadar(int velocidadEnKm){
        if(velocidadEnKm>10){
            System.out.println("Un atleta no puede nadar a esa velocidad");
            return;
        }
        System.out.println("El atleta "+nombre+" esta nadando a una velocidad de "+velocidadEnKm+" km/h");
    }
}
