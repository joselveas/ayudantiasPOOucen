package ejemplo10;

public class Piedra implements Cloneable{
    public Piedra(){}
    public Object clone(){
        return new Piedra();
    }
}
