package mediatorex;
import java.util.ArrayList;
public class MediatorConcreto implements Mediator{
    ArrayList <Colaborador> colaboradores;
    
    public MediatorConcreto(){
        this.colaboradores = new ArrayList<Colaborador>();
    }
    
    public void adiciona(Colaborador colab){
        colab.setMediator(this);
        this.colaboradores.add(colab);
    }
    public void enviaCor(Colaborador c) {
        for(Colaborador i : colaboradores){
            if(i!=c){
                if(i instanceof Pessoa1){
                    ((Pessoa1)i).recebeCor("recebendo texto em vermelho");
                }else if(i instanceof Pessoa2){
                    ((Pessoa2)i).recebeCor("recebendo texto em azul");
                }else if(i instanceof Pessoa3){
                    ((Pessoa3)i).recebeCor("recebendo texto em verde");
                }
            }
        }
    }
    
}
