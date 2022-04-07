package udemy;

import javax.sound.midi.Soundbank;
import java.util.Locale;

public class ManipulaçãoDeStrings {
    public static void main(String[] args) {
        String s1 =  "abc DGSKJ sdkagjhsad sFDffhSDJ          ";
        String s01 = s1.toLowerCase(Locale.ROOT);                         //TUDO EM LETRA MINUSCULA
        String s02 = s1.toUpperCase(Locale.ROOT);                        //TUDO EM LETRA MAIUSCULA
        String s03 = s1.trim();                                         //TIRA OS ESPAÇOS DESNECESSARIOS
        String s04 = s1.substring(9);                                  //DELIMITA AS LETRAS (NO INICIO)
        String s05 = s1.substring(9, 20);                             //DELIMITA AS LETRAS DA FRASE INTEIRA
        String s06 = s1.replace("s", "80");          //TROCA AS LETRAS DA STRING POR OUTRA ESCOLHIDA
        String s07 = s1.replace("abc", "5124");     //TROCA UMA FRASE OU PALAVRA DE UMA STRING POR OUTRA
        int s08 = s1.indexOf("KJ");                                //CONTA ATÉ ONDE ESTÁ LOCALIZADA TAL LETRA OU PALAVRA MAIS PERTO
        int s09 = s1.lastIndexOf("s");                        //CONTA ATÉ ONDE ESTÁ LOCALIZADA TAL LETRA OU PALAVRA LOCALIZADA MAIS LONGE

        String[] vect = s1.split(" ");
        System.out.println(vect [0]);
        System.out.println(vect [1]);
        System.out.println(vect [2]);
        System.out.println(vect [3]);

        System.out.println("O original: -"+s1+"-");
        System.out.println("toLoweCase:  "+s01+"-");
        System.out.println("toUpperCase: "+s02+"-");
        System.out.println("Trim:               "+s03+"-");
        System.out.println("substring(9):       "+s04+"-");
        System.out.println("substring(9, 20):   "+s05+"-");
        System.out.println("replace (\"s\")(\"80\"):"+s06+"-");
        System.out.println("replace (\"abc\")(\"5124\"):"+s07);
        System.out.println("indexOf:            "+s08);
        System.out.println("lastIndexOf:        "+s09);



    }
}
