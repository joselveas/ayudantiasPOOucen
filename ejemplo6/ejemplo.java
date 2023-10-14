public class ejemplo {
    public static void main(String[] args){
        Comida comida1 = new Comida("pizza", 100);
        Comida comida2 = new Comida("hamburguesa", 200);
        Comida comida3 = new Comida("ensalada", 50);
        Comida comida4 = new Comida("sandwich", 150);
        Comida comida5 = new Comida("sushi", 300);

        Persona persona1 = new Persona("Juan", 20, 3);
        Persona persona2 = new Persona("Pedro", 30, 4);

        persona1.addComida(comida1);
        persona1.addComida(comida2);
        persona1.addComida(comida3);
        persona2.addComida(comida2);
        persona2.addComida(comida4);
        persona2.addComida(comida4);
        persona2.addComida(comida5);


        System.out.println(persona1.listarCarrito());
        System.out.println(persona2.listarCarrito());

        System.out.println(persona1.precioCarrito());
        System.out.println(persona2.precioCarrito());
    }
}
