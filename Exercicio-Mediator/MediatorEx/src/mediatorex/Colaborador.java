package mediatorex;
public class Colaborador {
    protected Mediator mediator;
    public void setMediator(Mediator m){
        mediator = m;
    }
    public void enviarMsg(String msg){
        mediator.enviaCor(this);
    }
    public void recebeCor(String s){
        System.out.println(s);
    }
}
