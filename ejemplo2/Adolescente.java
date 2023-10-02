package ejemplo2;

public class Adolescente extends Persona{
    public Adolescente(){
        super();
    }
    public Adolescente(String nombre, int edad) {
        super(nombre, edad);
    }
    public void hablar(){
        System.out.println("El Adolescente "+getNombre()+" esta hablando");
    }
    public void gritar(){
        System.out.println("El Adolescente "+getNombre()+" esta gritando");
    }
}
