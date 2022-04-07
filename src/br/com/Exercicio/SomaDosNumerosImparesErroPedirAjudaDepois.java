package br.com.Exercicio;

public class SomaDosNumerosImparesErroPedirAjudaDepois {
    public static void main(String[] args) {
        int i;

        int somaImp = 0, multPar = 1;

        for (i=0;i<=30;i++){
            if(i%2 == 0){
                multPar = multPar*i;
                System.out.println(multPar);
            }
            if (i%2 == 1) {
                somaImp = i+somaImp;
                System.out.println(somaImp);
            }
        }
    }
}
