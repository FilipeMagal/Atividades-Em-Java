package br.com.Exercicio;

import java.util.Scanner;
public class NumeroDecrescente {
    public static void main(String[] args) {

        Scanner scanear = new Scanner (System.in);
        int i, numero_Inteiro;

        System.out.println("Digite um número inteiro: ");
        numero_Inteiro =  scanear.nextInt();

        System.out.println("Segue numero digitado na forma decrescente: ");
        for (i=0;i<=numero_Inteiro;numero_Inteiro=numero_Inteiro-2){
            System.out.println(numero_Inteiro);
        }
    }
}
