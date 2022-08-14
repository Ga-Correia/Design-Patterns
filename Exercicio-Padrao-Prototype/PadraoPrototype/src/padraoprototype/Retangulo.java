package padraoprototype;
public class Retangulo extends Prototipo{
    private String nome;
    public Retangulo(){
        nome = "Retangulo";
        this.area = 20;
    }
    int getArea(){
        return area;
    }
    void createFigura() {
        System.out.println("Retangulo: area: "+getArea()+", criado.");
    }
}
