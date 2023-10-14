package ejemplo7;

public class ejemplo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Juan");
        Mascota mascota1 = new Mascota("Gaspar", "Perro Labrador", 2);
        Mascota mascota2 = new Mascota("Pedro", "Perro Pastor Aleman", 5);
        Mascota mascota3 = new Mascota("Luna", "Gato American Bobtail", 10);
        Mascota mascota4 = new Mascota("Taylor", "Tortuga orejas rojas", 25);

        cliente1.addMascota(mascota1);
        cliente1.addMascota(mascota2);
        cliente1.addMascota(mascota3);
        cliente1.addMascota(mascota4);

        System.out.println(cliente1.listarMascotas());
    }
}
