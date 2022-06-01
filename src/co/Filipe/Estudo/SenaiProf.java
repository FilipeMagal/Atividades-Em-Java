package co.Filipe.Estudo;

import java.util.Scanner;

public class SenaiProf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char yesOrNo;
        do {
            System.out.print("Digite quanto capital irá investir: ");
            double cap = sc.nextDouble();
            System.out.print("Qual a taxa de juros mensal? ");
            byte juros = sc.nextByte();



            System.out.println("Deseja fazer ");
            yesOrNo = sc.next().charAt(0);
        }while (yesOrNo == 'S' || yesOrNo == 's');

    }
}
