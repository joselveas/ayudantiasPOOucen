package prueba2;

class AutenticacionContrasena{
    private String password;
    public AutenticacionContrasena(String password){
        this.password = password;
    }

    public boolean verificarFortaleza(){
        int cantCaracteres = password.length();
        int condiciones = 5;
        if(cantCaracteres < 12){
            condiciones--;
        }
        int cantNumeros = 0;
        int cantMayusculas = 0;
        int cantEspecial = 0;
        for(int i = 0; i < cantCaracteres; i++){
            if(password.charAt(i) == 32){
                condiciones--;
            }
            else if(password.charAt(i) >= 48 && password.charAt(i) <= 57){
                cantNumeros++;
            }
            else if(password.charAt(i) >= 65 && password.charAt(i) <= 90){
                cantMayusculas++;
            }
            else if(password.charAt(i) < 97 || password.charAt(i) > 122){
                cantEspecial++;
            }
        }
        if(cantNumeros < 3 || cantMayusculas < 2 || cantEspecial == 0){
            condiciones--;
        }
        if(condiciones == 5){
            return true;
        }
        return false;
    }
}