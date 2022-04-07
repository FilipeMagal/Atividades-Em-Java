package creatingclass;

public class Salary {
    public String name_Employee;
    public double grossSalary;
    public double tax;

    public double liquidSalary(){

        return grossSalary-tax;
    }
    public double addSalary(double addPercentage){

        return grossSalary = liquidSalary() + (grossSalary * (addPercentage/100));
    }
    public String toString(){

        return "Employee: " + name_Employee + ", $ "+String.format("%.2f",liquidSalary());
    }
}
