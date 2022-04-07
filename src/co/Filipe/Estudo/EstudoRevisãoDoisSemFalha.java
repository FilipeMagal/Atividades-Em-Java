package co.Filipe.Estudo;

import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
public class EstudoRevisãoDoisSemFalha {
    public static void main(String[] args) throws InterruptedException {
        Random randon = new Random();
        System.out.printf("Dessa vez eu não falhei!!\n\n\nSINTA A PRESSÃO DO IMPORT RANDOM: ");
        int numero_Rnd =  randon.nextInt(800);
        System.out.println(numero_Rnd);
    }
}
