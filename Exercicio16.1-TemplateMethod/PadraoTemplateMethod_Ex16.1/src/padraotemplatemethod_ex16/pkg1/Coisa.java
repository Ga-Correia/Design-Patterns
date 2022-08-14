package padraotemplatemethod_ex16.pkg1;
public class Coisa {
    private String palavra;
    
    public Coisa(String PALAVRA){
        this.palavra = PALAVRA;
    }
    public String getPalavra(){
        return palavra;
    }
    public int getUltimaLetra(){
        return palavra.charAt(palavra.length()-1);
    }
}
