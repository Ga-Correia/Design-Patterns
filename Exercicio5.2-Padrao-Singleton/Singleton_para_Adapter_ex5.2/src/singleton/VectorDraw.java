package singleton;
public class VectorDraw {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        // Obtém instancia de Shape
        int x = s1.getX();
        System.out.println("getX(): "+x);
        int height = s1.getHeight();
        System.out.println("getHeight(): "+height);
        
        
        
        System.out.println("\nRealizando primeiramente o Singleton e depois utilizando a classe Adapter"
                + "\ncomo adaptador para as classes RasterBox e Coords, temos:");
        
        
        System.out.println("\nSingleton:");
        
        Shape s2, s3, s4;
        s2 = Adapter.obterInstancia();
        s3 = Adapter.obterInstancia();
        s4 = Adapter.obterInstancia();
        
        if(s2==s3){
            System.out.println("s2 e s3 são o mesmo objeto.");
        }
        if(s2==s4){
            System.out.println("s2 e s4 são o mesmo objeto.\n");
        }
        
        
        System.out.println("Adapter:");
        x = s2.getX();
        System.out.println("getX(): "+x);
        height = s2.getHeight();
        System.out.println("getHeight(): "+height);
 
    }
    
}
