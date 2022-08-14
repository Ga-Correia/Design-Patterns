package padraoflyweight;
public class Algarismo implements Flyweight{
    private int  numero;
    public Algarismo(int n){
        this.numero = n;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int n){
        this.numero = n;
    }
}
