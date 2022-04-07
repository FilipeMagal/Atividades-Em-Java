package br.com.Exercicio;

import java.util.Scanner;
public class TrocaNumero {
    public static void main(String[] args) {
        Scanner scanear = new Scanner (System.in);

        System.out.println("---------------------------------");
        System.out.println("Sistema de troca de números!!");
        System.out.println("---------------------------------\n\n");

        System.out.println("Digite o Number A e o Number B inteiro: ");
        int n1 = scanear.nextInt();
        int n2 = scanear.nextInt();

        System.out.println("Number A: "+n2);
        System.out.println("Number B:"+n1);

        }
    }

