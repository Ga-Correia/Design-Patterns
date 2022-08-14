package padraodecorator;
public class Cliente {
    public static void INDIVIDUAL(){
        Componente texto = new Texto("palavra");
        System.out.println(texto.getTexto());
        
        Decorador textoAlta = new CaixaAlta(texto);
        System.out.println(textoAlta.getTexto());
        
        Decorador textoInvertido = new Invertido(texto);
        System.out.println(textoInvertido.getTexto());
        
        Decorador textoChaveado = new Tags(texto);
        System.out.println(textoChaveado.getTexto());
    }
    public static void CASCATA(){
        Componente texto = new Texto("palavra");
        
        Decorador textoAlta = new CaixaAlta(texto);
        Decorador textoInvertido = new Invertido(textoAlta);
        Decorador textoChaveado = new Tags(textoInvertido);
        System.out.println(textoChaveado.getTexto()); 
    }
    public static void main(String[] args) {
        INDIVIDUAL();
        CASCATA();
    }
    
}
