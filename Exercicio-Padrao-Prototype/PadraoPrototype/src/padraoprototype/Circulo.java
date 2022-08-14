package padraoprototype;
public class Circulo extends Prototipo{
    private String nome;
    public Circulo (){
        nome = "Circulo";
        this.area = 10;
    }
    int getArea(){
        return area;
    }
    void createFigura() {
        System.out.println("Circulo: area: "+getArea()+", criado.");
    }
}
