package ejemplo7;

public class Mascota {
    String nombre;
    String raza;
    int edad;
    public Mascota(){
        
    }
    public Mascota(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;   
    }
    public String getRaza(){
        return raza;
    }
    public int getEdad(){
        return edad;
    }
    @Override
    public String toString(){
        return nombre + " " + raza + " " + edad;
    }
}
