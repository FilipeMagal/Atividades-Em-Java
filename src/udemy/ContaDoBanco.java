package udemy;

import creatingclass.BancoConta;
import creatingclass.ContaDoBanco1;

import java.util.Scanner;
public class ContaDoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoConta cb;

        System.out.print("Entre com o código da conta: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        System.out.print("Entre com o nome da conta: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Começar com um deposito inicial (S/N)?");
        char simOuNao = sc.next().charAt(0);

        if (simOuNao == 'S'){
            System.out.print("Entre com um valor inicial para o depósito: ");
            double depositoInicial = sc.nextDouble();
            cb = new BancoConta (codigo, nomeCliente,depositoInicial);
        }
        else {
            cb = new BancoConta(codigo, nomeCliente);
        }
        System.out.print("Dados da conta:");
        System.out.print(cb);
        System.out.println(cb.getName());

        System.out.print("\nEntre com um valor para depósito ");
        double adicionarValor1 = sc.nextDouble();

        System.out.print("Atualização dos dados: ");
        cb.adicionarValor(adicionarValor1);

        System.out.println(cb);

        System.out.print("Entre com um valor para sacar o depósito: ");
        double sacarDinheiro = sc.nextDouble();
        cb.sacarDinheiro(sacarDinheiro);

        System.out.print("Atualização dos dados: ");
        System.out.println(cb);



    }
}

