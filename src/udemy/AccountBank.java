package udemy;

import creatingclass.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class AccountBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        BankAccount product;

        System.out.print("Enter account number: ");
        int cod = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)?");
        char yesOrNo = sc.next().charAt(0);

        if(yesOrNo == 'y') {
            System.out.print("Enter initial value deposit: ");
            double depositInitial = sc.nextDouble();
            product = new BankAccount(name, cod, depositInitial);
        }
        else {
            product = new BankAccount(name, cod);
        }
        System.out.println("Account data:");
        System.out.println(product);

        System.out.print("\nEnter a deposit value: ");
        double addValue = sc.nextDouble();

        product.addDeposit(addValue);

        System.out.println("Update account data: ");
        System.out.println(product);

        System.out.print("Enter a withdraw value: ");
        double removedValue = sc.nextDouble();
        product.removedDeposit(removedValue);

        System.out.println("Update account data:");
        System.out.println(product);


        System.out.println();


    }
}
