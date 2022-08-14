package exchain_of_responsibility;
public class ProcessadorTres_Ponto implements Processador{
    public ProcessadorTres_Ponto(){
        
    }
    public void contarChar(String text){
        int contarPonto = 0;
        text.toLowerCase();
        int i;
        for (i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(c == '.' || c == '?' || c == '!'){
                contarPonto++;
            }
        }
        System.out.println("Ponto: "+contarPonto);
    }
}
