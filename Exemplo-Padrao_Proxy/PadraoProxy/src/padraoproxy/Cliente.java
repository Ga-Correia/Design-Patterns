package padraoproxy;
public class Cliente {
    public static void main(String[] args) {
        Sujeito sujeito = Fabrica.getSujeito();
        sujeito.operacao();
    } 
}
