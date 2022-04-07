package udemy;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MatrizActivity {
    public static void main(String[] args)throws InterruptedException {
        Scanner sc = new Scanner (System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Digite o numero de linhas da matriz: ");
        int n = sc.nextInt();
        System.out.print("Agora digite quantas colunas deseja na matriz: ");
        int m = sc.nextInt();
        TimeUnit.SECONDS.sleep(1);

        int[][] mat = new int[n][m];

        for (int i =0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite um numero para buscar na matriz: ");
        int search = sc.nextInt();

        for (int i =0; i<mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == search) {
                    System.out.println("Position: " + i + ", " + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    } else {
                        System.out.println("Dados incorretos, tente novamente");
                    }
                }
            }
        }

    }
}

