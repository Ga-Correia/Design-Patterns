package padraoabstractfactory;
public class Triangulo implements AbstractTriangulo{
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

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

    public Ponto getP3() {
        return p3;
    }

    public void setP3(Ponto p3) {
        this.p3 = p3;
    }
    
    public Triangulo(Ponto p1, Ponto p2, Ponto p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public void MostraTriangulo() {
        System.out.println("Triangulo: pontos: ("+p1.getX()+" "+p1.getY()+"), ("+p2.getX()+" "+p2.getY()+"), ("+p3.getX()+" "+p3.getY()+")");
    }
}
