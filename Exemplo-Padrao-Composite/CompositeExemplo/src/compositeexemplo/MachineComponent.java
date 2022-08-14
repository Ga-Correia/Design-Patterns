package compositeexemplo;
public abstract class MachineComponent{
    String name;
    public abstract int getMachineCount();
    public String getName(){   
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
