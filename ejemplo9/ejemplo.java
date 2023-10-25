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
        
        /*Generar metodos en la clase SopaLetras para imprimir la sopa de letras, otra función para 
        encontrar la palabra "HOLA" en la sopa de letras e indicar la coordenada del primer caracter y del ultimo caracter de la palabra*/
    }
}
