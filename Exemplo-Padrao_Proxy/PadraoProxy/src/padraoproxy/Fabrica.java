package padraoproxy;
public class Fabrica {
    public static Sujeito instancia;
    public static Sujeito getSujeito(){
        if(instancia==null){
            instancia = (Sujeito) new SujeitoReal();
        }
        return instancia;
    }   
}
