package padraoproxy;
public class Intermediario implements Sujeito{
    private SujeitoReal real;
    public Object operacao() {
        return real.operacao();
    }
}
