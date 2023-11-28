package ejemplo11.Model;

public class Usuario {
    //id,nombre,correo,contraseña,edad
    private int id;
    private String nombre;
    private String correo;
    private String contrasenia;
    private int edad;
    public Usuario(){}
    public Usuario(int id, String nombre, String correo, String contrasenia, int edad){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.edad = edad;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    @Override
    public String toString(){
        return id + "," + nombre + "," + correo + "," + contrasenia + "," + edad;
    }
}
