package padraoabstractfactory;
public class Retangulo implements AbstractRetangulo{
    private Ponto p1;
    private Ponto p2;

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public void setP2(Ponto p2) {
        this.p2 = p2;
    }
    
    public Retangulo(Ponto p1, Ponto p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public void MostraRetangulo() {
        System.out.println("Retangulo: pontos: ("+p1.getX()+" "+p1.getY()+"), ("+p2.getX()+" "+p2.getY()+")");
    }
    
}
