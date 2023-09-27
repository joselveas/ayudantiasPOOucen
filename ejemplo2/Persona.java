package ejemplo2;

interface SeComunica{
    public void hablar();
    public void gritar();
}

public class Persona implements SeComunica{
    private String nombre;
    private int edad;
    public Persona(){

    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void hablar(){
        System.out.println("La persona "+nombre+" esta hablando");   
    }

    public void gritar(){
        System.out.println("La persona "+nombre+" esta gritando");
    }
}
