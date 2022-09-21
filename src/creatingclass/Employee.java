package creatingclass;

public class Employee {

    private String nome;
    private Integer hours;
    private Double valuePerHour;


    public Employee(String nome, Integer hours, Double valuePerHour) {
        this.nome = nome;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public Double payment (Integer hours, Double valuePerHour){
         double amount = hours * valuePerHour;
         return amount;
    }
}
