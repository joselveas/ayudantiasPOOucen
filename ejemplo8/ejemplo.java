package ejemplo8;

public class ejemplo {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Pedro");
        Persona atleta1 = new Atleta("Juan");

        persona1.correr(10.1);
        atleta1.correr(10.1);

        persona1.correr(10);
        atleta1.correr(20);


        //ingresar otros metodos con override y overload de las clases persona y atleta
    }
}
