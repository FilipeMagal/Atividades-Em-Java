package creatingclass;

public class BancoConta {

    private int codigo;
    private String nome;
    private double deposito;

    public BancoConta (int cod, String nom, double dep){
        codigo = cod;
        nome = nom;
        deposito = dep;
    }
    public BancoConta (int cod, String nom){
        codigo = cod;
        nome = nom;
    }
    public String getName(){
        return nome;
    }
    public double adicionarValor(double value){
        return deposito += value;
    }
    public double sacarDinheiro(double value){
        return deposito -= value+5;
    }
    public String toString (){
        return "Account " +codigo+ ", Holder: " +nome+", Balance: $ "+deposito;
    }

    public Object getName(String nomeCliente) {
        return nome;
    }
}
