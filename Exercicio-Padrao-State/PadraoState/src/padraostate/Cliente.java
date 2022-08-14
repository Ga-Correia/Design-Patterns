package padraostate;
public class Cliente {
    public static void main(String[] args) {
        GatoQuantico gato1 = new GatoQuantico();
        
        gato1.setEstado(gato1.VIVO);
        gato1.miar();
        
        gato1.setEstado(gato1.MORTO);
        gato1.miar();
        
        gato1.setEstado(gato1.QUANTICO);
        gato1.miar();
    }
    
}
