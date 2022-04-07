package udemy;

import creatingclass.StudyingVectorInUdemy;

import java.util.Scanner;
import java.util.Locale;

public class VectorStudying {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        System.out.println("Quantas notas você quer ultilizar para fazer a média?");
        n = sc.nextInt();

        StudyingVectorInUdemy[] vect = new StudyingVectorInUdemy[n];

        for (int i=0; i<n;i++){
            sc.nextLine();
            System.out.println("Digite o " + (i+1) + " nome: ");
            String name = sc.nextLine();
            System.out.println("Digite o " + (i+1) + " preço: ");
            double preco = sc.nextDouble();
            vect [i] = new StudyingVectorInUdemy(name, preco);
        }

        double som = 0.0;
        for (int i=0;i<n;i++){
            som += vect [i].getPrice();
        }
        double media = som/n;
        System.out.println("Média = " +media);

        System.out.println(vect.toString());
    }
}
