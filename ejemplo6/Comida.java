public class Comida{
    String nombre;
    int precio;
    public Comida(){
        
    }
    public Comida(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    @Override
    public String toString(){
        return nombre;
    }
}