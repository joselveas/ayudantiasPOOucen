package ejemplo2;

public class ejemplo {
    public static void main(String[] args) {
        Persona persona1 = new Adulto();
        Persona persona2 = new Adolescente();

        persona1.setNombre("Juan");
        persona1.setEdad(20);
        persona2.setNombre("Pedro");
        persona2.setEdad(30);

        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Nombre: "+persona2.getNombre());
        System.out.println("Edad: "+persona2.getEdad());

        persona1.hablar();
        persona2.hablar();

        persona1.gritar();
        persona2.gritar();
    }
}
