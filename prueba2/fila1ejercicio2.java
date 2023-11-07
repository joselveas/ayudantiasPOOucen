package prueba2;

class AnalisisTexto {
    private String texto;
    public AnalisisTexto(String texto){
        this.texto = texto;
    }
    public void caracteres(){
        System.out.println("Cantidad de caracteres: "+texto.length());
    }
    public void palabras(){
        int cantPalabras = 0;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == 46 || texto.charAt(i) == 32){
                cantPalabras++;
            }
        }
        System.out.println("Cantidad de palabras: "+cantPalabras);
    }
    public void oraciones(){
        int cantOraciones = 0;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == '.'){
                cantOraciones++;
            }
        }
        System.out.println("Cantidad de oraciones: "+cantOraciones);
    }
    public void parrafos(){
        int cantParrafos = 0;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == '\n' || texto.charAt(i) == '\t'){
                cantParrafos++;
            }
        }
        System.out.println("Cantidad de parrafos: "+cantParrafos);
    }
    public void palabraMasLArga(){
        String palabraActual = "";
        int cantCaracteresEnPalabraActual = 0;
        String palabraMasLarga = palabraActual;
        int cantCaracteresEnPalabraMasLarga = cantCaracteresEnPalabraActual;
        for(int i = 0; i < texto.length(); i++){
            cantCaracteresEnPalabraActual++;
            palabraActual = palabraActual + texto.charAt(i);
            if(texto.charAt(i) == ' ' || texto.charAt(i) == '\n' || texto.charAt(i) == '\t' || texto.charAt(i) == '.' || texto.charAt(i) == '?' || texto.charAt(i) == '!'){
                if(cantCaracteresEnPalabraActual > cantCaracteresEnPalabraMasLarga){
                    cantCaracteresEnPalabraMasLarga = cantCaracteresEnPalabraActual;
                    palabraMasLarga = palabraActual;
                }
                cantCaracteresEnPalabraActual = 0;
                palabraActual = "";
            }           
        }
        System.out.println("Palabra mas larga: "+palabraMasLarga);
    }
}