package br.com.Exercicio;

import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanear = new Scanner(System.in);

        double potencia, IMC;

        System.out.println("Digite o seu nome: ");
        String nome = scanear.nextLine();

        System.out.println("Digite o seu peso (Lembre-se sempre de usar o \".\" inves de \",\"):");
        double peso = scanear.nextDouble();

        System.out.println("Digite a sua altura em metros: ");
        double altura = scanear.nextDouble();

        potencia = altura*altura;
        IMC = peso/potencia;

        System.out.println("Olá "+nome+", nós calculamos e chegamos ao resultado de que seu br.com.Exercicio.IMC e de: "+IMC);
        if (IMC <= 19){
            System.out.printf("\nVoce esta abaixo do peso");
        }
        if (IMC > 19 && IMC < 25){
            System.out.printf("\nVoce esta no peso ideal.");
        }
        if (IMC >= 25 && IMC <30){
            System.out.printf("\nVoce esta acima do peso");
        }
        if (IMC >= 30 && IMC < 35){
            System.out.printf("\nVoce esta com obesidade");
        }
        if (IMC >= 35 ){
            System.out.printf("\nVoce esta com obesidade morbida");
        }
    }
}
