package co.Filipe.Estudo;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
public class EstudoConstante {
    public static void main(String[] args) throws InterruptedException {
        final double PI = 3.14;
        Scanner scanear = new Scanner(System.in);
        Random randonear = new Random();
        System.out.println("Digite um numero para testar se o PI troca");
        double pi_Trocado = scanear.nextDouble();
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Agora veja o valor do PI e analise se mudou a constante:" +PI+"\n\nOH NÃO!! NÃO TROCOU. FIQUE COM O VALOR QUE VOCÊ PEDIU: "+pi_Trocado);
    }
}
