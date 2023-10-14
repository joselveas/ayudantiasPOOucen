package ejemplo7;

import java.util.ArrayList;

public class Cliente {
    String nombre;
    ArrayList<Mascota> mascotas;

    public Cliente(){
        this.mascotas = new ArrayList<Mascota>();
    };
    public Cliente(String nombre){
        this.nombre = nombre;
        this.mascotas = new ArrayList<Mascota>();
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void addMascota(Mascota mascota){
        this.mascotas.add(mascota);
    }
    public void removeMascota(Mascota mascota){
        this.mascotas.remove(mascota);
    }
    public String listarMascotas(){
        String salida = "";
        for(int i = 0; i < mascotas.size(); i++){
            if(mascotas.get(i) != null){
                salida += mascotas.get(i).toString() + "\n";
            }
        }
        return salida;
    }
}
