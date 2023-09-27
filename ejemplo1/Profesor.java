package ejemplo1;

public class Profesor extends Persona {
    private double sueldo;
    public Profesor(){
        
    }
    public Profesor(String nombre, int edad, String rut, double sueldo){
        super(nombre, edad, rut);
        this.sueldo = sueldo;
    }
    public double getSueldo(){
        return sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
}
