package compositeexemplo;
import java.util.*;
public class MachineComposite extends MachineComponent {
    protected List<MachineComponent>components = new ArrayList <MachineComponent>();
    public void add(MachineComponent component) {
        components.add(component);
    }
    public int getMachineCount(){
        int j = 0;
        int count=0;
        for(MachineComponent i : components){
            j += i.getMachineCount();
            count++;
        }
        return count;
    }
}

