package padraobuilder;
public class ConstrutorPessoa implements Construtor{
    private String NomePessoa;
    private int Identificacao;

    public void setNomePessoa(String nome) {
      this.NomePessoa = nome;  
    }

    public void setIDPessoa(int id) {
        this.Identificacao = id;
    }
    
    public Pessoa getPessoa(){
        return new Pessoa(NomePessoa, Identificacao);
    }
}
