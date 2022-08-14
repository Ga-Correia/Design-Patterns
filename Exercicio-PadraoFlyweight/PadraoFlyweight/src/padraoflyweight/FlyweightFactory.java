package padraoflyweight;
import java.util.HashMap;
import java.util.Map;
public class FlyweightFactory {
    Map<Integer, Flyweight> flyweightpool = new HashMap<Integer, Flyweight>();
    
    public Flyweight getFlyweight(int id){
        Flyweight fly;
        if(flyweightpool.containsKey(id)){
            fly = flyweightpool.get(id);
        }else{
            fly = new Algarismo(id);
            flyweightpool.put(id, fly);
        }
        return fly;
    }
}
