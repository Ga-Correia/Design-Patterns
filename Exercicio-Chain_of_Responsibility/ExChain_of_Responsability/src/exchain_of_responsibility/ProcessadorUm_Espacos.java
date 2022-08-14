package exchain_of_responsibility;
public class ProcessadorUm_Espacos implements Processador{
    private Processador Sucessor;
    public ProcessadorUm_Espacos(){
        Sucessor = new ProcessadorDois_Letra_a();
    }
    public void contarChar(String text){
        int contarEspaco = 0;
        text.toLowerCase();
        int i;
        for (i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == ' '){
                contarEspaco++;
            }
        }
        System.out.println("Espaços: "+contarEspaco);
        Sucessor.contarChar(text);
    }
}
