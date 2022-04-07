package udemy;

import creatingclass.ClassList2;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

public class ListAtivicty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List <ClassList2> CL = new ArrayList<>();

        System.out.print("Quantos cadastros deseja realizar? ");
        int cad = sc.nextInt();

        for (int i = 0; i < cad; i++) {
            sc.nextLine();
            System.out.print("\nDigite o " + (i + 1) + " nome: ");
            String name = sc.nextLine();

            System.out.print("Digite o " + (i + 1) + " numero de telefone: ");
            String tell = sc.nextLine();

            System.out.print("Digite o " + (i + 1) + " cpf (Sem pontos e virgulas): ");
            long cpf = sc.nextLong();

            ClassList2 XD = new ClassList2(name, tell, cpf);
            CL.add(XD);
        }
        System.out.print("Digite o cpf que deseja buscar: ");
        long cpfSearch = sc.nextLong();
        int pos = searchCpf(CL, cpfSearch);
        if (pos == 1){
            System.out.print("\nCPF ENCONTRADO NO SISTEMA!!\n");
        }
        else{
            System.out.print("CPF NÃO ENCONTRADO NO SISTEMA, TENTE NOVAMENTE\n");
        }

        for (ClassList2 x: CL ){
            System.out.println(x);
        }

    }


    public static int searchCpf(List<ClassList2> CL, long cpf) {
        for (int i = 0; i < CL.size(); i++) {
            if (CL.get(i).getCpf() == cpf) {
                return 1;
            }
        }
        return 0;
    }
}