package udemy;

import creatingclass.ProductStock;

import java.util.Scanner;
import java.util.Locale;

public class StockAtt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        ProductStock product = new ProductStock(name, price);
        System.out.println("\nProduct data: "+product);

        product.setPrice(900);
        System.out.println("New price: " +product.getPrice());
        product.setName("Computer");
        System.out.println("New name: " +product.getName());

        char resp;

        do {
            System.out.print("Enter the number of products to be added in stock: ");
            int quantity = sc.nextInt();
             product. addValueInStock(quantity);

            System.out.println("\nUpdate data: "+product);

            System.out.println("Deseja repetir? (S/N)");
            resp = sc.next().charAt(0);
        }while (resp != 'N');

        do {

            System.out.print("Enter the number of products to be removed in stock: ");
            int quantity = sc.nextInt();
            product.removeValueInStock(quantity);

            System.out.println("\nUpdate data: " + product);

            System.out.println("Deseja repetir? (S/N)");
            resp = sc.next().charAt(0);
        }while (resp != 'N');
        System.out.println("Obrigado por usar nossos serviços, volte sempre!");

    }
}
