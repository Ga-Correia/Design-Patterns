package padraodecorator;
public class Invertido extends Decorador{
    public Invertido(Componente comp) {
        super(comp);
    }
    public String operacao(String str){
        return new StringBuilder(str).reverse().toString();
    }
    public String getTexto(){
        return operacao(super.getTexto());
    }
    
}
