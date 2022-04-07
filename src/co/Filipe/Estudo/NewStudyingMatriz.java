package co.Filipe.Estudo;

import java.util.Scanner;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class NewStudyingMatriz {
    public static void main(String[] args)throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor n para delimitar o tamanho da matriz: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Aguarde...");
        TimeUnit.SECONDS.sleep(2);

        System.out.println ("Digite os numero da matriz");

        for(int i=0; i< matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++) {
                matriz [i][j] = sc.nextInt();
                }
            }
        System.out.print("Diagonal numbers in matriz: ");
        for (int i=0;i<matriz.length;i++){
            System.out.print(matriz [i][i] + " ");
        }

        int search = 0;
        for (int i=0;i< matriz.length;i++){
            for (int j=0;j<matriz [i].length;j++){
                if (matriz [i][j] < 0) {
                    search++;
                }
            }
        }
        System.out.print("Negative numbers: " +search);
        }
    }

