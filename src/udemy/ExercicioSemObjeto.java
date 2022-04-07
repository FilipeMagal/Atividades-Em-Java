package udemy;

import creatingclass.Triangle;
import java.util.Scanner;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class ExercicioSemObjeto {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
         x.a = sc.nextDouble();
         x.b = sc.nextDouble();
         x.c = sc.nextDouble();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Enter the measures of triangle Y: ");
         y.a = sc.nextDouble();
         y.b = sc.nextDouble();
         y.c = sc.nextDouble();

        double pX = (x.a+x.b+x.c)/2;
        double pY = (y.a+y.b+y.c)/2;

        double area_TriX = x.area();
        double area_TriY = y.area();

        System.out.printf("Triangle X área: %.4f\n", area_TriX);
        TimeUnit.SECONDS.sleep(2);
        System.out.printf("Triangle Y área: %.4f\n", area_TriY);
        TimeUnit.SECONDS.sleep(2);

        if (area_TriX>area_TriY)
            System.out.println("Larger área: X\n");

        else
            System.out.println("Larger área: Y");

    }

}

