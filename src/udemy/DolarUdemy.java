package udemy;

import creatingclass.DolarExercise;

import java.util.Scanner;
import java.util.Locale;

public class DolarUdemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();
        double resultado = DolarExercise.dollar_Converter(amount, dollarPrice);

        System.out.printf("Amount to be paid in reais = %.2f",resultado);
    }
}
