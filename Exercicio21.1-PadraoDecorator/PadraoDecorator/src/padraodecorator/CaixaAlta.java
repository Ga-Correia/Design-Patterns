package padraodecorator;
public class CaixaAlta extends Decorador{
    public CaixaAlta(Componente comp) {
        super(comp);
    }
    public String operacao(String str){
        return str.toUpperCase();
    }
    public String getTexto(){
        return operacao(super.getTexto());
    }
}
