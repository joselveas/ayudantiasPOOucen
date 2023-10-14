public class Persona {
    String nombre;
    int edad;
    Comida [] listaComidas;
    public Persona(){};
    public Persona(String nombre, int edad, int cantComidas){
        this.nombre  = nombre;
        this.edad = edad;
        this.listaComidas = new Comida[cantComidas];
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void vaciarCarrito(){
        for(int i = 0; i < listaComidas.length; i++){
            listaComidas[i] = null;
        }
    }
    public void addComida(Comida comida){
        for(int i = 0; i < listaComidas.length; i++){
            if(listaComidas[i] == null){
                listaComidas[i] = comida;
                return;
            }
        }
    }
    public void removeComida(Comida comida){
        for(int i = 0; i < listaComidas.length; i++){
            if(listaComidas[i] == comida){
                listaComidas[i] = null;
                return;
            }
        }
    }
    public String listarCarrito(){ 
        String salida = "";
        for(int i = 0; i < listaComidas.length; i++){
            if(listaComidas[i] != null){
                salida += listaComidas[i].toString() + "\n";
            }
        }
        return salida;
    }
    public int precioCarrito(){
        int total = 0;
        for(int i = 0; i < listaComidas.length; i++){
            if(listaComidas[i] != null){
                total += listaComidas[i].getPrecio();
            }
        }
        return total;
    }
}

