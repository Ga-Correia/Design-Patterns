package padraoflyweight;
import java.util.Random;
public class PrincipalCliente {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int numeros = 10;
        int algarismos =10;
        int i;
        
        FlyweightFactory factory = new FlyweightFactory();
        
        for(i=0; i<numeros; i++){
            for(int j=0; j<algarismos; j++){
                Flyweight fly = factory.getFlyweight(aleatorio.nextInt(10));
                System.out.print(fly.getNumero());
            }
            System.out.println("");
        }
        System.out.println(i+" numeros de 10 algarismos.");
    }
    
}
