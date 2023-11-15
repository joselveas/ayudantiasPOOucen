package ejemplo10;

public class Mineral implements Cloneable{
    private String nombre;
    public Mineral(){}
    public Mineral(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Object clone(){
        return new Mineral(nombre);
    }
}
