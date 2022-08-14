package padraodecorator;
public class Texto implements Componente{
    private String txt;
    
    public Texto(String palavra){
        this.txt = palavra;
    }
    public String getTexto(){
        return txt;
    }
}
