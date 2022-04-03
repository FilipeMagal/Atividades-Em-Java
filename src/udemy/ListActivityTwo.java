package udemy;

import creatingclass.ClassList;

import java.util.List;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;

public class ListActivityTwo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List <ClassList> N = new ArrayList<>();

        System.out.print("Quantas pessoas para serem cadastradas? ");
        int employee = sc.nextInt();

        for (int i = 0; i<employee; i++){
            System.out.print("\nDigite o"+(i+1)+"ID: ");
            Integer idEmployee = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o"+(i+1)+"nome: ");
            String name = sc.nextLine();
            System.out.print("Digite o salario do "+(i+1)+"funcionário: ");
            Double salaryEmployee = sc.nextDouble();

            ClassList Cl = new ClassList(idEmployee, name, salaryEmployee);
            N.add(Cl);
        }
        System.out.print("Enter the employee id that will have salary increase :");
        int idEmployee2 = sc.nextInt();
        Integer pos = encontrandoId(N, idEmployee2);
        if (pos == null){
            System.out.println("Perdón, no encrontriemos tu ID");
        }
        else {
            System.out.print("Entre com a porcentagem: ");
            double porcentage = sc.nextDouble();
            N.get(pos).increaseSalary(porcentage);
            System.out.println(N);
        }

    }

public static Integer encontrandoId (List <ClassList> CL, int id) {
    for (int i = 0; i < CL.size(); i++) {
        if (CL.get(i).getId() == id) {
            return i;
        }
    }
    return null;
}
}
