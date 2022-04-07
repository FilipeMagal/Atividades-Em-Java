package co.Filipe.Estudo;

import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
public class DelaySegundos {

    public static void main(String[] args) throws InterruptedException {
    Scanner scanear = new Scanner(System.in);
    Random aleatorio_Numero = new Random();
        System.out.println("————————————————————————————————");
        System.out.println("           MEGA SENA            ");
        System.out.println("————————————————————————————————");

        System.out.printf("Escolha o limite de numeros para serem sorteados da mega-sena: ");
        int limite_Numero = scanear.nextInt();

        System.out.printf("Agora escolha o até quantos numeros podem ser sorteados: ");
        int limite_Numero_Total = scanear.nextInt();

        for (int i = 0;i<limite_Numero;i++) {
            int numero_Aleatorio = aleatorio_Numero.nextInt(limite_Numero_Total);

            System.out.printf("O " + (i + 1) + " numero sorteado é... ");
            TimeUnit.SECONDS.sleep(2);
            System.out.println(numero_Aleatorio);
        }
    }
}
