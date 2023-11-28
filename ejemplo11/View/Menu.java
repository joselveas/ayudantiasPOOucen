package ejemplo11.View;

import java.util.ArrayList;

public class Menu {
    public Menu(){}
    public void mostarPeliculas(ArrayList<String> peliculas){
        for(String pelicula : peliculas){
            System.out.println(pelicula);
        }
    }
    public void mostarUsuarios(ArrayList<String> usuarios){
        for(String usuario : usuarios){
            System.out.println(usuario);
        }
    }
    public void mostrar(){
        
    }
}
