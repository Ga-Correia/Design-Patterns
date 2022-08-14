package padraoadapter;
public class VectorDraw {
    public static void main(String[] args) {
        Shape s = new Shape();
        // Obtém instancia de Shape
        int x = s.getX();
        System.out.println("getX(): "+x);
        int height = s.getHeight();
        System.out.println("getHeight(): "+height);
        
        System.out.println("\nUtilizando a classe Adapter como adaptador para as"
        + " classes RasterBox e Coords, temos:");
        
        Shape C = new Adapter();
        x = C.getX();
        System.out.println("getX(): "+x);
        height = C.getHeight();
        System.out.println("getHeight(): "+height);
 
    }
    
}
