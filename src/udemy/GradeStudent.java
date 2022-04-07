package udemy;

import java.util.Locale;
import java.util.Scanner;
import creatingclass.StudentsGrades;

public class GradeStudent {
    public static void main(String[] args) {
        StudentsGrades sumGrades = new StudentsGrades();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("NAME: ");
        sumGrades.name = sc.nextLine();
        System.out.println("Grades from the three units ");
        sumGrades.nota1 = sc.nextDouble();
        sumGrades.nota2 = sc.nextDouble();
        sumGrades.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE = %.2f", sumGrades.sumOfGrades());

        double percentage = (60.0/100)*100;
        if (sumGrades.sumOfGrades() < percentage) {
            System.out.println("\nFAILED");
            System.out.printf("MISSING %.2f POINTS \n", sumGrades.passOrFailed());
        } else
            System.out.println("\nPASS");
    }
}
