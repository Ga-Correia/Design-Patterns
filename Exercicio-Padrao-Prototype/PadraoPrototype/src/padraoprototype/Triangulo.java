package padraoprototype;
public class Triangulo extends Prototipo{
    private String nome;
    public Triangulo(){
        nome = "Trinagulo";
        this.area = 30;
    }
    int getArea(){
        return area;
    }
    void createFigura() {
        System.out.println("Triangulo: area: "+getArea()+", criado.");
    }
}
