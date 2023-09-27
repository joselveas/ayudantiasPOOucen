package ejemplo1;

public class ejemplo
{
    public static void main(String[] args)
    {
        Persona persona1 = new Alumno();
        Persona persona2 = new Profesor();

        persona1.setNombre("Juan");
        persona1.setEdad(20);
        persona1.setRut("123456");
        persona2.setNombre("Pedro");
        persona2.setEdad(30);
        persona2.setRut("987654");

        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Rut: "+persona1.getRut());
        System.out.println("Nombre: "+persona2.getNombre());
        System.out.println("Edad: "+persona2.getEdad());
        System.out.println("Rut: "+persona2.getRut());

        Alumno alumno1 = (Alumno) persona1;
        Profesor profesor1 = (Profesor) persona2;

        alumno1.setNotaFinal(5.1);
        profesor1.setSueldo(100000);

        System.out.println("Nota final: "+alumno1.getNotaFinal());
        System.out.println("Sueldo: "+profesor1.getSueldo());

    }
}