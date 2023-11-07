package prueba2;

class BuscadorPatrones{
    private String texto;
    public BuscadorPatrones(String texto){
        this.texto = texto;
    }
    public void buscarPatron(String patron){
        String patronMayusculas = patron.toUpperCase();
        System.out.println("Patron normal: "+patron);
        System.out.println("Patron mayusculas: "+patronMayusculas);
        int repeticionesPatron = 0;
        int charMayuscula = 0;
        int repeticionesNecesitadas = patron.length();
        int repeticionesPatronConMayusculas = 0;
        int inicioPatron = 0;
        boolean esParteDePalabra = false;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) != patron.charAt(inicioPatron) && texto.charAt(i) != patronMayusculas.charAt(inicioPatron)){
                inicioPatron = 0;
                charMayuscula = 0;
            }else{
                if(texto.charAt(i) == patronMayusculas.charAt(inicioPatron)){
                    charMayuscula++;
                }
                inicioPatron++;
                if(inicioPatron == repeticionesNecesitadas){
                    repeticionesPatron++;
                    inicioPatron = 0;
                    if(charMayuscula != 0){
                        repeticionesPatronConMayusculas++;
                    }
                    if(i - patron.length() >=0){
                        if(texto.charAt(i - patron.length()) != 32){
                            esParteDePalabra = true;
                        }
                    }
                    if(i+1 < texto.length()){
                        if(texto.charAt(i+1) != 32){
                            esParteDePalabra = true;
                        }
                    }
                }
            }
        }
        if(repeticionesPatron > 0){
            System.out.println("El patrón existe en el texto.");
            System.out.println("El patrón se repite " + repeticionesPatron + " veces.");
            if(repeticionesPatronConMayusculas != 0){
                System.out.println("De las "+ repeticionesPatron+" repeticiones, "+repeticionesPatronConMayusculas+" contienen mayúsculas.");
            }
            if(esParteDePalabra == true){
                System.out.println("El patrón es parte de otra palabra.");
            }else{
                System.out.println("El patrón no es parte de otra palabra.");
            }
        }
    }
}