package ejemplo11.Controller;

import java.util.ArrayList;

import ejemplo11.Model.*;
import ejemplo11.View.*;

public class Controlador {
    private Menu menu;
    private Data data;
    private String directorioPeliculas;
    private String directorioUsuarios;
    public Controlador(){
        menu = new Menu();
        data = new Data();
    }
    public void iniciar(){
        data.setDirectorioPeliculas(directorioPeliculas);
        data.setDirectorioUsuarios(directorioUsuarios);
        int opcion = menu.menu();
        boolean continuar = true;
        while(continuar){
            switch(opcion){
                case 1:
                    data.poblarPeliculas();
                    menu.mostrarPeliculas(transformarPeliculas(data.getPeliculas()));
                    break;
                case 2:
                    data.poblarUsuarios();
                    menu.mostrarUsuarios(transformarUsuarios(data.getUsuarios()));
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            opcion = menu.menu();
        }
    }
    public ArrayList<String> transformarPeliculas(ArrayList<Pelicula> peliculas){
        ArrayList <String> listaPeliculas = new ArrayList<>();
        for(Pelicula p : peliculas){
            listaPeliculas.add(p.toString());
        }
        return listaPeliculas;
    }
    public ArrayList<String> transformarUsuarios(ArrayList<Usuario> usuarios){
        ArrayList <String> listaUsuarios = new ArrayList<>();
        for(Usuario u : usuarios){
            listaUsuarios.add(u.toString());
        }
        return listaUsuarios;
    }
    public void setDirectorioPeliculas(String directorioPeliculas){
        this.directorioPeliculas = directorioPeliculas;
    }
    public void setDirectorioUsuarios(String directorioUsuarios){
        this.directorioUsuarios = directorioUsuarios;
    }
}
