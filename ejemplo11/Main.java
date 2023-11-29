package ejemplo11;

import ejemplo11.Controller.Controlador;

public class Main {

    public static void main(String[] args) {
        String directorioPeliculas = "./ejemplo11/Data/peliculas.csv";
        String directorioUsuarios = "./ejemplo11/Data/usuarios.csv";
        Controlador controlador = new Controlador();
        controlador.setDirectorioPeliculas(directorioPeliculas);
        controlador.setDirectorioUsuarios(directorioUsuarios);
        controlador.iniciar();
    }

}