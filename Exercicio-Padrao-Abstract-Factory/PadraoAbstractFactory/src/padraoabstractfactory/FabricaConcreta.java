package padraoabstractfactory;
public class FabricaConcreta implements AbstractFactory{
    public AbstractPonto criaPonto(){
        Ponto ponto = new Ponto(3, 4);
        return ponto;
    }
    public AbstractCirculo criaCirculo(){
        Ponto ponto = new Ponto(0, 1);
        Circulo circulo = new Circulo(ponto, 4);
        return circulo;
    }
    public AbstractRetangulo criaRetangulo(){
        Ponto ponto = new Ponto(3, 4);
        Ponto ponto2 = new Ponto(4, 5);
        Retangulo retangulo = new Retangulo(ponto, ponto2);
        return retangulo;
    }
    public AbstractTriangulo criaTriangulo(){
        Ponto ponto = new Ponto(1, 1);
        Ponto ponto2 = new Ponto(1, 4);
        Ponto ponto3 = new Ponto(4, 1);
        Triangulo triangulo = new Triangulo(ponto, ponto2, ponto3);
        return triangulo;
    }
    
}
