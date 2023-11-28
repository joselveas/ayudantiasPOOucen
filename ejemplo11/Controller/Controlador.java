package ejemplo11.Controller;

import ejemplo11.Model.*;
import ejemplo11.View.*;

public class Controlador {
    private Menu menu;
    private Data data;
    public Controlador(){
        menu = new Menu();
        data = new Data();
    }
    public void iniciar(){
        menu.mostrar();
    }
}
