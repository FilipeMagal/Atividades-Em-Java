package co.Filipe.Estudo;

import java.util.concurrent.TimeUnit;
public class DelaySemOlhar {
    public static void main(String[] args) throws InterruptedException {

        System.out.printf("Olá");
        TimeUnit.SECONDS.sleep(2);
        System.out.println(" Filipe");
    }
}
