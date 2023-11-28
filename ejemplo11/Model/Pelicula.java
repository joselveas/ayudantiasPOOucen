package ejemplo11.Model;

public class Pelicula {
    //id,nombre,director,actor1,actor2,actor3,año,duracion
    private int id;
    private String nombre;
    private String director;
    private String actor1;
    private String actor2;
    private String actor3;
    private int year;
    private int duracion;
    public Pelicula(){}
    public Pelicula(int id, String nombre, String director, String actor1, String actor2, String actor3, int year, int duracion){
        this.id = id;
        this.nombre = nombre;
        this.director = director;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
        this.year = year;
        this.duracion = duracion;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActor1() {
        return actor1;
    }
    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }
    public String getActor2() {
        return actor2;
    }
    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }
    public String getActor3() {
        return actor3;
    }
    public void setActor3(String actor3) {
        this.actor3 = actor3;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    @Override
    public String toString() {
        return id +","+ nombre +","+ director +","+ actor1 +","+ actor2 +","+ actor3 +","+ year +","+ duracion;
    }
}
