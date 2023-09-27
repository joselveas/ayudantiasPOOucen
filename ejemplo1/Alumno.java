package ejemplo1;

public class Alumno extends Persona {
    double notaFinal;
    public Alumno() {

    }
    public Alumno(String nombre, int edad, String rut, double notaFinal) {
        super(nombre, edad, rut);
        this.notaFinal = 1.0;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
