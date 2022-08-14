package padraodecorator;
public class Tags extends Decorador{
    public Tags(Componente comp) {
        super(comp);
    }
    public String operacao(String str){
        return "<b>" +str+ "</b>";
    }
    public String getTexto(){
        return operacao(super.getTexto());
    }
}
