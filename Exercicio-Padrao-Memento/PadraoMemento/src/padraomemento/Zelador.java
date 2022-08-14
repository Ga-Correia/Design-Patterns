package padraomemento;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Zelador {
    private Ponto ponto;
    private List<Ponto.Memento> salvaPontos = new ArrayList<Ponto.Memento>();
    
    public void Undo(int x, int y, int i){
        if(ponto!= null){
            ponto.setX(x);
            ponto.setY(y);
            ponto.mostraPonto();
            salvaPontos.add(ponto.createMemento());
            ponto.setMemento(salvaPontos.get(i-1));
        }else{
            ponto=new Ponto();
            ponto.setX(x);
            ponto.setY(y);
            ponto.mostraPonto();
            salvaPontos.add(ponto.createMemento());
              
        }
    }
    public static void main(String[] args){
        Random gerador = new Random();
        Zelador zelador = new Zelador();
        
        for (int i = 0; i < 5; i++) {
            zelador.Undo(gerador.nextInt(10), gerador.nextInt(10), i);
        }
    }
    
}
