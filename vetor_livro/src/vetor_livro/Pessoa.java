package vetor_livro;


public class Pessoa {
    String nome;
    int idade;
    
    public Pessoa(String nome){
        this(nome, 0);
    }
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
