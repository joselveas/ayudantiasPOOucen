package ejemplo10;

public class Basura implements Cloneable{
    public Basura(){}
    public Object clone(){
        return new Basura();
    }
}
