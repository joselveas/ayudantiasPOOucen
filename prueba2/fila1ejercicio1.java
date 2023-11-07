package prueba2;

class EncriptacionCesar {
    private int clave;
    public EncriptacionCesar(int clave){
        this.clave = clave;
    }

    public String encriptar(String texto){
        String textoNoEncriptado = "";
        int inicioMayusculas = 65;
        int finalMayusculas = 90;
        int inicioMinusculas = 97;
        int finalMinusculas = 122;
        for(int i = 0; i < texto.length(); i++){
            int caracter = texto.charAt(i);
            if(texto.charAt(i)<=(finalMinusculas-clave) && texto.charAt(i)>=inicioMinusculas){
                caracter = texto.charAt(i) + clave;
            }else if(texto.charAt(i)<=(finalMayusculas-clave) && texto.charAt(i)>=inicioMayusculas){
                caracter = texto.charAt(i) + clave;
            }else if(texto.charAt(i)<finalMayusculas && texto.charAt(i)>=inicioMayusculas){
                caracter = inicioMayusculas + ((texto.charAt(i) + clave) - finalMayusculas);
            }else if(texto.charAt(i)<finalMinusculas && texto.charAt(i)>=inicioMinusculas){
                caracter = inicioMinusculas + ((texto.charAt(i) + clave) - finalMinusculas);
            }
            textoNoEncriptado = textoNoEncriptado + (char)caracter;
        }
        return textoNoEncriptado;
    }
    public String desencriptar(String texto){
        String textoNoEncriptado = "";
        int inicioMayusculas = 65;
        int finalMayusculas = 90;
        int inicioMinusculas = 97;
        int finalMinusculas = 122;
        for(int i = 0; i < texto.length(); i++){
            int caracter = texto.charAt(i);
            if(texto.charAt(i)>=(inicioMinusculas+clave) && texto.charAt(i)<=finalMinusculas){
                caracter = texto.charAt(i) - clave;
            }else if(texto.charAt(i)>=(inicioMayusculas-clave) && texto.charAt(i)<=finalMayusculas){
                caracter = texto.charAt(i) - clave;
            }else if(texto.charAt(i)>inicioMayusculas && texto.charAt(i)<=finalMinusculas){
                caracter = finalMayusculas - ((texto.charAt(i) - clave) - inicioMayusculas);
            }else if(texto.charAt(i)>inicioMinusculas && texto.charAt(i)<=finalMayusculas){
                caracter = finalMinusculas - ((texto.charAt(i) - clave) - inicioMinusculas);
            }
            textoNoEncriptado = textoNoEncriptado + (char)caracter;
        }
        return textoNoEncriptado;
    }

}