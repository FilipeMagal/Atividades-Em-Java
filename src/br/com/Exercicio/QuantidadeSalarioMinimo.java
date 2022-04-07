package br.com.Exercicio;

import java.util.Scanner;
public class QuantidadeSalarioMinimo {
    public static void main(String[] args) {
     Scanner scanear = new Scanner (System.in);

        System.out.printf("Digite o seu salário: ");
        double salario_Total = scanear.nextDouble();

        double salario_Quantidade = (salario_Total/788.00);
        System.out.println("Você tem salário mínimo "+salario_Quantidade);
    }
}
