package mediatorex;
public class Principal {
    public static void main(String[] args) {
        Colaborador vermelho = new Pessoa1();
        Colaborador azul = new Pessoa2();
        Colaborador verde = new Pessoa3();
        
        MediatorConcreto m = new MediatorConcreto();
         
        
        m.adiciona(vermelho);
        m.adiciona(azul);
        m.adiciona(verde);
        
        vermelho.enviarMsg("vermelho");
        azul.enviarMsg("azul");
        verde.enviarMsg("verde");
    }
    
}
