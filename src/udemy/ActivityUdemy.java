package udemy;

import creatingclass.ActivityClass;

import java.util.Scanner;


public class ActivityUdemy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ActivityClass[] vect1 = new ActivityClass[10];

        System.out.print("How many rooms will be rented? ");
        int room = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i<room; i++){
            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room1 = sc.nextInt();
            sc.nextLine();
            vect1 [room1] = new ActivityClass(name, email);
        }

        System.out.println("\n\nBusy rooms: ");
        for (int i=0; i<10;i++){
            if(vect1[i] != null){
                System.out.println((i) + ": " + vect1[i]);
            }
        }
    }
}
