package udemy;

public class TiposPrimitivos {
    public static void main(String[] args) throws InterruptedException {


        // TIPOS PRIMITIVOS

        short int_Menor = -129;                                     //Numero inteiro com menos espaço para alocar
        int numeros_Inteiros = 54354354;                            //Numero inteiros maiores que o short
        long int_Maior = 543543544L;                                //Numero inteiros maiores que o int
        boolean is_Logged = true;                                   //Verdadeiro ou falso
        byte ate_127 = 127;                                         //Numero com baixa economia de memória (-128 — 127 )
        char unica_Letra = 'c';                                     //Uso de uma única letra, bom para o "S/N"
        float ponto_Flutuante = 35.3f;                              //Menor que o double
        double ponto_Flutuante2 = 3534554.3;                        //Maior que o Float

        // NÃO PRIMITIVO

        String conjunto_De_Letras = "Filipe é lindo pra caralho";   //Uso de uma cadeia de caracteres, podendo formar frases

    }
}
