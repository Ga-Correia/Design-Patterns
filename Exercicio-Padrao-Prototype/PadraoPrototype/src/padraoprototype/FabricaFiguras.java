package padraoprototype;
import java.util.HashMap;
import java.util.Map;
public class FabricaFiguras {
    private static Map<String, Prototipo> figurasMap = new HashMap<String, Prototipo>();
    
    static
    {
        figurasMap.put("Circulo", new Circulo());
        figurasMap.put("Retangulo", new Retangulo());
        figurasMap.put("Triangulo", new Triangulo());
    }
      
    public static Prototipo getFigura(String figura)
    {
        return (Prototipo) figurasMap.get(figura).clone();
    }
}

