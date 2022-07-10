package br.com.Exercicio;

import creatingclass.PessoaJuridica;

import java.util.Scanner;
import java.util.Locale;
public class PessoaJuridicaLuana {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


            System.out.print("-Diga-me o seu nome: ");
            String nome = sc.nextLine();
            System.out.print("-Informe o seu e-mail: ");
            String email = sc.nextLine();
            System.out.print("-Fale a sua idade: ");
            Integer idade = sc.nextInt();
            System.out.print("-Diga o seu ID: ");
            Integer id = sc.nextInt();
            PessoaJuridica PJ = new PessoaJuridica(nome, idade, email);

        System.out.println("#"+id+" O seu nome é: "+PJ.getNome()+" o seu e-mail é: " + PJ.getEmail() + " e a sua idade é: " + PJ.getIdade());

        PJ.setNome("FREEWEEKINHO");
        PJ.setEmail("freeweek@gmail.com");
        PJ.setIdade(25);

        System.out.println("#"+ id +" "+PJ);
        System.out.println("#"+ id +" "+PJ);
    }
}
