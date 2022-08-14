package padraodecorator;
public abstract class Decorador implements Componente{
    private Componente componente;
    public Decorador(Componente comp){
        this.componente = comp;
    }
    public String getTexto(){
        return componente.getTexto();
    }
    public abstract String operacao(String str);
}
