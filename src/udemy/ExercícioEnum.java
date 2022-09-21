package udemy;

import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;

public class ExercícioResolvidoEnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter name departament: ");
        String departmant = sc.nextLine();

        System.out.println("Enter date worker: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        System.out.print("How many contracts to this worker? ");
        byte contracts = sc.nextByte();

        for (int i = 0; i < contracts; i++) {
            System.out.println("Enter contract #" +i+ " data:");
            System.out.println("Date (DD/MM/YYYY): ");
            String data = sc.nextLine();
            System.out.println("Value per hour: ");
            double valuerPerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hoursDuration = sc.nextInt();
        }
        System.out.println("Enter mounth and year to calculate income (MM/YYYY): ");
        String mountAndYears = sc.nextLine();
        System.out.println("to.string");
    }

}
