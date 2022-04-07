package creatingclass;

public class BankAccount {
    private int cod;
    private String name;
    private double deposit;

    public int getCod(){

        return cod;
    }
    public String getName(){

        return name;
    }
    public double getDepositInitial(){

        return deposit;
    }
    public void setName(String name){

        this.name = name;
    }

    public BankAccount(String name, int cod,double depositInitial) {
    this.deposit = depositInitial;
    this.name = name;
    this.cod = cod;
    }

    public BankAccount(String name, int cod){
        this.name = name;
        this.cod = cod;
    }

    public double addDeposit(double addValue2){

        return deposit += addValue2;
    }
    public double removedDeposit(double addValue2){

        return deposit -= addValue2+5;
    }
    public String toString (){

        return "Account " +cod+ ", Holder: " +name+", Balance: $ "+deposit;
    }

}
