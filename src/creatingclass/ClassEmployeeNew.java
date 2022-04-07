package creatingclass;

public class ClassEmployeeNew {
    private String nome;
    private final Long tell;
    private final String endereco;
    private final Byte idade;

    public ClassEmployeeNew(String nome, Long tell, String endereco, Byte idade){
        this.nome = nome;
        this.tell = tell;
        this.endereco = endereco;
        this.idade = idade;
    }

    public String toString2() {
        return
                "nome='" + nome + '\'' +
                        ", tell=" + tell +
                        ", endereco='" + endereco + '\'' +
                        ", idade=" + idade;
    }

    public String getNome() {
        return nome;
    }
}
