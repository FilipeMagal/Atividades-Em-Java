package udemy;

import creatingclass.Salary;

import java.util.Locale;
import java.util.Scanner;

public class SalaryEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salary salary_Exercise = new Salary();

        System.out.print("Name: ");
        salary_Exercise.name_Employee = sc.nextLine();
        System.out.print("Gross salary: ");
        salary_Exercise.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        salary_Exercise.tax = sc.nextDouble();

        System.out.println("\n"+salary_Exercise);
        System.out.print("\nWitch percentage to increase salary? ");
        double addPercentage = sc.nextDouble();
        salary_Exercise.addSalary(addPercentage);

        System.out.printf("\nUpdate data: %s, $ %.2f ",salary_Exercise.name_Employee, salary_Exercise.grossSalary);


    }

}
