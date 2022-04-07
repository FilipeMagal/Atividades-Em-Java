package udemy;

import java.util.Scanner;
import java.util.Locale;

public class UdemyEstudo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanear = new Scanner (System.in);
        int x = 4;
        double y = -2.5;
        int A = (int) Math.sqrt(x); //RAIZ QUADRADA DE 4
        float B = (float) Math.pow(x, y); //4 ELEVADO A 2
        float C = (float) Math.abs(y); //VALOR ABSOLUTO DE 2.5

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println(5<10);

    int N = 10;
        while (x != 10){
            x = scanear.nextInt();
        }
        for(int i=0; i<50;) {
            i = i + 2;
            System.out.println(i);
        }
    }
}
