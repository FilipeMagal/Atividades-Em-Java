package creatingclass;

public class ClassList {
    private Integer id;
    private String name;
    private Double salary;

    public ClassList (Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(Double porcentage){

        this.salary += salary*(porcentage/100);
    }

    public String getName(){

        return name;
    }
    public Integer getId(){

        return id;
    }
    public Double getSalary() {
        return salary;
    }

    public void setName(String name){

        this.name = name;
    }
    public void setId(Integer id){

        this.id = id;
    }
    public void setSalary(Double salary){

        this.salary = salary;
    }

    public String toString() {

        return "O seu ID: '"+id + "', nome: '" + name + "', salário: '" + String.format("%.2f", salary) + "'\n";
    }

}
