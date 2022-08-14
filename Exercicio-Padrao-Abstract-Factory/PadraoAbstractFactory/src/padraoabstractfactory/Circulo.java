package padraoabstractfactory;
public class Circulo implements AbstractCirculo{
    private Ponto p1;
    private int raio;

    public Ponto getP1() {
        return p1;
    }

    public void setP1(Ponto p1) {
        this.p1 = p1;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
    
    public Circulo(Ponto p1, int r){
        this.p1 = p1;
        this.raio = r;
    }

    @Override
    public void MostraCirculo() {
        System.out.println("Circulo: ponto: ("+p1.getX()+" "+p1.getY()+"), raio: "+getRaio());
    }
    
    
}
