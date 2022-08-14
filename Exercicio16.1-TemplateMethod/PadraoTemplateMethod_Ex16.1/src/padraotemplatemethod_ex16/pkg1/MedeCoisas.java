package padraotemplatemethod_ex16.pkg1;
import java.util.*;
public class MedeCoisas implements Comparator{
    
    public int compare(Object o1, Object o2) {
        Coisa c1 = (Coisa) o1;
        Coisa c2 = (Coisa) o2;
        if (c1.getUltimaLetra() > c2.getUltimaLetra()){
            return 1;
        }
        else if (c1.getUltimaLetra() < c2.getUltimaLetra()){ 
            return -1;
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Coisa coisas[] = new Coisa[4];
        coisas[0] = new Coisa("pneu");
        coisas[1] = new Coisa("gaveta");
        coisas[2] = new Coisa("chafariz");
        coisas[3] = new Coisa("cachorro");
        Comparator comp = new MedeCoisas();
        Arrays.sort(coisas, new MedeCoisas());
        for(int i =0; i<4; i++){
            System.out.println(coisas[i].getPalavra());
        }
    }
    
}
