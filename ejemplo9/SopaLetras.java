package ejemplo9;

public class SopaLetras {
    private char [][] sopa;
    private int filas, columnas;
    public SopaLetras(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
    }
    public char[][] getSopa(){
        return sopa;
    }
    public void setSopa(char[][] sopa){
        this.sopa = sopa;
    }
    public int getFilas(){
        return filas;
    }
    public void setFilas(int filas){
        this.filas = filas;
    }
    public int getColumnas(){
        return columnas;
    }
    public void setColumnas(int columnas){
        this.columnas = columnas;
    }
}
