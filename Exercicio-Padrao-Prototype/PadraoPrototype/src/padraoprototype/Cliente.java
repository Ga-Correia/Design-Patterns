package padraoprototype;
public class Cliente {
    public static void main(String[] args) {
        FabricaFiguras.getFigura("Circulo").createFigura();
        FabricaFiguras.getFigura("Retangulo").createFigura();
        FabricaFiguras.getFigura("Triangulo").createFigura();
        FabricaFiguras.getFigura("Circulo").createFigura();
        FabricaFiguras.getFigura("Retangulo").createFigura();
        FabricaFiguras.getFigura("Triangulo").createFigura();
    }
    
}
