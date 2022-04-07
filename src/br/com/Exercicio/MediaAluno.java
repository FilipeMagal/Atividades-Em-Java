package br.com.Exercicio;

import java.util.Scanner;
public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanear = new Scanner(System.in);

        todas_As_Contas(10,20,30);


    }
    static void todas_As_Contas(int x,int y,int z){
        System.out.println(x+y+z);
        System.out.println(x-y-z);
        System.out.println(x*y*z);
        System.out.println(x/y/z);
    }
}
