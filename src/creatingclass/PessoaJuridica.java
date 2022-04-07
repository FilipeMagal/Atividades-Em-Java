package creatingclass;

public class PessoaJuridica {
    private String nome;
    private int idade;
    private String email;

    public PessoaJuridica(String name, int idade, String email){
        this.nome = name;
        this.idade = idade;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getEmail(){
        return email;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return  "O seu nome é: "+ nome +" o seu e-mail é: " + email + " e a sua idade é: " + idade;
    }
}
