package udemy;

import creatingclass.ActivityClass2;

import java.util.Scanner;
import java.util.Locale;
public class ActivityUdemy2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    ActivityClass2[] vect = new ActivityClass2[10];

        System.out.print("Quantos quartos você quer? ");
        int number_Room = sc.nextInt();

        for (int i=0; i<number_Room; i++){
            sc.nextLine();
            System.out.println("Aluguel: " + (i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.println("Qual quarto deseja?");
            int room = sc.nextInt();
            vect[room] = new ActivityClass2(name, email);
        }
        for (int i=0; i<10; i++){
            if (vect[i] != null){
                System.out.println(i + vect[i].toString());
            }
        }
    }
}