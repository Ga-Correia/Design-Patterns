package compositeexemplo;
public class Principal{
    public static void main(String[] args){
        MachineComponent comp = new MachineComposite();
        MachineComponent comp2 = new MachineComposite();
        MachineComponent comp3 = new MachineComposite();
        
        MachineComposite mc = new MachineComposite();
        mc.setName("Robo");
        System.out.println("Nome da MachineComposite: "+mc.getName());
        mc.add(comp);
        mc.add(comp2);
        mc.add(comp3);
        System.out.println("Quantidade de Componentes da MachineComposite: "+mc.getMachineCount());
        Machine m = new Machine() {};
        m.setName("Braco Robotico");
        System.out.println("Nome da Machine: "+m.getName());
        System.out.println("Quantidade de Componentes da Machine: "+m.getMachineCount());
    }  
}
