package ejemplo11.Model;

import java.io.*;
import java.util.ArrayList;

public class Data {
    private ArrayList <Pelicula> peliculas;
    private ArrayList <Usuario> usuarios;
    private String directorioPeliculas;
    private String directorioUsuarios;
    public Data(){
        this.peliculas = new ArrayList<Pelicula>();
        this.usuarios = new ArrayList<Usuario>();
    }
    public ArrayList<Pelicula> getPeliculas(){
        return this.peliculas;
    }
    public ArrayList<Usuario> getUsuarios(){
        return this.usuarios;
    }
    public void addPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }
    public void addUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
    public void removePelicula(Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }
    public void removeUsuario(Usuario usuario){
        this.usuarios.remove(usuario);
    }
    public void removePelicula(int indice){
        this.peliculas.remove(indice);
    }
    public void removeUsuario(int indice){
        this.usuarios.remove(indice);
    }
    public void setDirectorioPeliculas(String directorioPeliculas){
        this.directorioPeliculas = directorioPeliculas;
    }
    public void setDirectorioUsuarios(String directorioUsuarios){
        this.directorioUsuarios = directorioUsuarios;
    }
    public void poblarPeliculas(){
        //id,nombre,director,actor1,actor2,actor3,año,duracion
        try(BufferedReader lector = new BufferedReader(new FileReader(this.directorioPeliculas))){
            lector.readLine();
            String linea;
            while((linea = lector.readLine())!= null){
                String [] datos = linea.split(",");
                Pelicula pelicula = new Pelicula(Integer.valueOf(datos[0]),datos[1],datos[2],datos[3],datos[4],datos[5],Integer.valueOf(datos[6]),Integer.valueOf(datos[7]));
                peliculas.add(pelicula);
            }
            lector.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void poblarUsuarios(){
        //id,nombre,correo,contraseña,edad
        try(BufferedReader lector = new BufferedReader(new FileReader(this.directorioUsuarios))){
            lector.readLine();
            String linea;
            while((linea = lector.readLine())!= null){
                String [] datos = linea.split(",");
                Usuario usuario = new Usuario(Integer.valueOf(datos[0]),datos[1],datos[2],datos[3],Integer.valueOf(datos[4]));
                usuarios.add(usuario);
            }
            lector.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void guardarPeliculas(){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(this.directorioPeliculas))){
            escritor.write("id,nombre,director,actor1,actor2,actor3,año,duracion\n");
            for(Pelicula pelicula : this.peliculas){
                escritor.write(pelicula.toString() + "\n");
            }
            escritor.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void guardarUsuarios(){
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(this.directorioUsuarios))){
            escritor.write("id,nombre,correo,contraseña,edad\n");
            for(Usuario usuario : this.usuarios){
                escritor.write(usuario.toString() + "\n");
            }
            escritor.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
