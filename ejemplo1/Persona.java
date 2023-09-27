package ejemplo1;

public class Persona {
    private String nombre;
    private int edad;
    private String rut;
    public Persona(){

    }
    public Persona(String nombre, int edad, String rut){
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
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
    public String getRut(){
        return rut;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
}
