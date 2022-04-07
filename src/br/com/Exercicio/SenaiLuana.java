package br.com.Exercicio;

import creatingclass.SenaiLuana2;

public class SenaiLuana {
    public static void main(String[] args) {
        SenaiLuana2 SL = new SenaiLuana2(1, "Filipe");

        System.out.println(SL.getName());
        SL.setName("Thauan");
        System.out.println(SL.getName());


        System.out.println(SL.getCod());
        SL.setCod(5);

        System.out.println(SL.getCod());
    }
}
