package udemy;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees: ");
        int numberOfEmployees = sc.nextInt();

        for (int i=0; i<numberOfEmployees; i++){
            System.out.println("Employee #" +(i+1) + " data\n");
            System.out.print("Outsourced (Y/N)?");
            char yOrN = sc.next().charAt(0);
            char yOrN1 = Character.toUpperCase(yOrN);

            if (yOrN1 == 'N'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hours: ");
                Double valuePerHours = sc.nextDouble();

            }
            if (yOrN1 == 'Y'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hours: ");
                Double valuePerHours = sc.nextDouble();
                System.out.println("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
            }
        }
    }
}
