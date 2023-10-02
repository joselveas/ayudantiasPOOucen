package ejemplo2;

public class Adulto extends Persona {
    public Adulto(){
        super();
    }
    public Adulto(String nombre, int edad){
        super(nombre, edad);
    }
    public void hablar(){
        System.out.println("El Adulto "+getNombre()+" esta hablando");
    }
    public void gritar(){
        System.out.println("El Adulto "+getNombre()+" esta gritando");
    }
}
