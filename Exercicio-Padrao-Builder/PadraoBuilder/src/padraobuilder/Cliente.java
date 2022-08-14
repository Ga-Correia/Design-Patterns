package padraobuilder;
public class Cliente {
    public static void main(String[] args) {
        Diretor diretor = new Diretor();
        
        ConstrutorPessoa builder = new ConstrutorPessoa();
        diretor.construir(builder);
        
        Pessoa pessoa = builder.getPessoa();
        System.out.println(pessoa.getNomePessoa());
        System.out.println(pessoa.getIDPessoa());
    }
    
}
