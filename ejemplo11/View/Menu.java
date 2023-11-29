package ejemplo11.View;

import java.util.*;

public class Menu {
    public Menu(){}
    public void mostrarPeliculas(ArrayList<String> peliculas){
        for(String pelicula : peliculas){
            System.out.println(pelicula);
        }
    }
    public void mostrarUsuarios(ArrayList<String> usuarios){
        for(String usuario : usuarios){
            System.out.println(usuario);
        }
    }
    public int menu(){
        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que quieres hacer?");
        System.out.println("1. Ver Peliculas");
        System.out.println("2. Ver Usuarios");
        System.out.println("3. Salir");
        opcion = sc.nextInt();
        return opcion;
    }
}
