package prueba2;

class prueba {
    public static void main(String[] args) {
        EncriptacionCesar encriptacion = new EncriptacionCesar(2);
        int a = ',';
        System.out.println(a);
        String encriptado = encriptacion.encriptar("Hola, Mundo");
        System.out.println(encriptado);
        System.out.println(encriptacion.desencriptar(encriptado));

        AnalisisTexto analisis = new AnalisisTexto("Hola, como estas? espero que bien."+'\t');
        analisis.caracteres();
        analisis.palabras();
        analisis.oraciones();
        analisis.parrafos();
        analisis.palabraMasLArga();

        AutenticacionContrasena autenticacion = new AutenticacionContrasena("UCEN@joseveas1234");
        boolean autenticado = autenticacion.verificarFortaleza();
        System.out.println(autenticado);

        BuscadorPatrones buscador = new BuscadorPatrones("El ferrocarril se puede mover por dos carriles en la lines 2, el carril 1 y el carril 3");
        buscador.buscarPatron("carril");
    }
}
