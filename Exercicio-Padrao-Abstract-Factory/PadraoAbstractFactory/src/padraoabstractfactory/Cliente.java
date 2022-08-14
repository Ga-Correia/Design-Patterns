package padraoabstractfactory;
public class Cliente {
    public static void main(String[] args) {
         FabricaConcreta fabrica = new FabricaConcreta();
         fabrica.criaPonto().MostraPonto();
         fabrica.criaCirculo().MostraCirculo();
         fabrica.criaRetangulo().MostraRetangulo();
         fabrica.criaTriangulo().MostraTriangulo();
    }
    
}
