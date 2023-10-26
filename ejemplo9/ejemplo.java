package ejemplo9;

public class ejemplo {
    public static void main(String[] args) {
        SopaLetras sopa = new SopaLetras(5, 6);
        sopa.setSopa(new char[][]{
                        {'E', 'H', 'G', 'Y', 'A', 'R'}, 
                        {'L', 'O', 'I', 'W', 'B', 'P'}, 
                        {'T', 'M', 'X', 'K', 'J', 'C'}, 
                        {'U', 'N', 'Q', 'Z', 'D', 'F'},
                        {'V', 'S', 'H', 'O', 'L', 'A'}
                    });
        sopa.imprimirSopa();
        String palabra = "HOLA";
        sopa.encontrarPalabra(palabra);

    }
}
