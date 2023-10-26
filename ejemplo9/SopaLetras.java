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
    public void imprimirSopa(){
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void encontrarPalabra(String palabra){
        char[] caracteres = palabra.toCharArray();
        System.out.println("Buscando la palabra: "+palabra);
        int largo = caracteres.length;
        System.out.println("Largo de la palabra: "+largo);
        boolean arriba = true;
        boolean abajo = true;
        boolean derecha = true;
        boolean izquierda = true;
        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                if(sopa[i][j] == caracteres[0]){
                    arriba = buscarArriba(i, j, largo, caracteres);
                    abajo = buscarAbajo(i, j, largo, caracteres);
                    derecha = buscarDerecha(i, j, largo, caracteres);
                    izquierda = buscarIzquierda(i, j, largo, caracteres);
                }
            }
        }
        if(!arriba && !abajo && !derecha && !izquierda){
            System.out.println("No se encontró la palabra buscada");
        }
    }
    public boolean buscarArriba(int fila, int columna, int largo, char[] caracteres){
        int arriba = fila - largo + 1;
        if(arriba < 0){return false;}
        int j = 0;
        for(int i = fila; i >= arriba; i--){
            if(caracteres[j] != sopa[i][columna]){
                return false;
            }
            j++;
        }
        System.out.println("Se contro la palabra buscada, que incia en "+
                            " fila:"+fila+" y columna:"+columna+
                            " y termina en la fila:"+arriba+" y columna:"+columna);
        return true;
    }
    public boolean buscarAbajo(int fila, int columna, int largo, char[] caracteres){
        int abajo = fila + largo - 1;
        if(abajo >= filas){return false;}
        int j = 0;
        for(int i = fila; i <= abajo; i++){
            if(caracteres[j] != sopa[i][columna]){
                return false;
            }
            j++;
        }
        System.out.println("Se contro la palabra buscada, que incia en "+
                            " fila:"+fila+" y columna:"+columna+
                            " y termina en la fila:"+abajo+" y columna:"+columna);
        return true;
    }
    public boolean buscarIzquierda(int fila, int columna, int largo, char[] caracteres){
        int izquierda = columna - largo + 1;
        if(izquierda < 0){return false;}
        int j = 0;
        for(int i = columna; i >= izquierda; i--){
            if(caracteres[j] != sopa[fila][i]){
                return false;
            }
            j++;
        }
        System.out.println("Se contro la palabra buscada, que incia en "+
                            " fila:"+fila+" y columna:"+columna+
                            " y termina en la fila:"+fila+" y columna:"+izquierda);
        return true;
    }
    public boolean buscarDerecha(int fila, int columna, int largo, char[] caracteres){
        int derecha = columna + largo - 1;
        if(derecha >= columnas){return false;}
        int j = 0;
        for(int i = columna; i <= derecha; i++){
            if(caracteres[j] != sopa[fila][i]){
                return false;
            }
            j++;
        }
        System.out.println("Se contro la palabra buscada, que incia en "+
                            " fila:"+fila+" y columna:"+columna+
                            " y termina en la fila:"+fila+" y columna:"+derecha);
        return true;
    }
}
