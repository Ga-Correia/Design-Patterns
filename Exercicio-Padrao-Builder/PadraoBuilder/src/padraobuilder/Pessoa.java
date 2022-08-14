package padraobuilder;
public class Pessoa {
    private String NomePessoa;
    private int Identificacao;
    
    public Pessoa(String nome, int id){
        this.NomePessoa=nome;
        this.Identificacao=id;
    }
    public String getNomePessoa() {
      return NomePessoa;  
    }

    public int getIDPessoa() {
        return Identificacao;
    }
}
