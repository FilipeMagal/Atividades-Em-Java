package udemy;

import creatingclass.RetangleExercise;

import java.util.Scanner;
import java.util.Locale;

public class RetangleNew {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        RetangleExercise retangle = new RetangleExercise();

        System.out.println("Enter rectangle width and height: ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n",retangle.area());
        System.out.printf("PERIMETER = %.2f\n", retangle.perimeter());
        System.out.printf("DIAGONAL = %.2f", retangle.diagonal());
    }
}
