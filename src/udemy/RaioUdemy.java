package udemy;

import creatingclass.RaioExercise;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Locale;

public class RaioUdemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter radius: ");
        RaioExercise.numero_Qualquer = sc.nextDouble();

        System.out.printf("\nCircumference: %.2f", RaioExercise.circumference_Of_A_Number_Random());
        System.out.printf("\nVolume: %.2f", RaioExercise.volume_Of_A_Number_Random());
        System.out.println("\nPI value: " + RaioExercise.PI);
    }
}
