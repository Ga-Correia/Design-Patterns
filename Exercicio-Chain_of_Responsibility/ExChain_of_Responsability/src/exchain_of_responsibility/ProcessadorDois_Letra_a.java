package exchain_of_responsibility;
public class ProcessadorDois_Letra_a implements Processador{
    private Processador Sucessor;
    public ProcessadorDois_Letra_a(){
        Sucessor = new ProcessadorTres_Ponto();
    }
    public void contarChar(String text){
        int contar_a = 0;
        text.toLowerCase();
        int i;
        for (i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == 'a'){
                contar_a++;
            }
        }
        System.out.println("Letra a: "+contar_a);
        Sucessor.contarChar(text);
    }
}

