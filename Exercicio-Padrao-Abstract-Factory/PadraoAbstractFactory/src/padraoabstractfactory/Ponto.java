package padraoabstractfactory;
public class Ponto implements AbstractPonto{
    private int x;
    private int y;
    
    public Ponto(int a, int b){
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void MostraPonto(){
        System.out.println("Ponto: "+getX()+", "+getY());
    }

}
