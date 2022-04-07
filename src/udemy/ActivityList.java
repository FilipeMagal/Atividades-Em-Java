package udemy;

import creatingclass.ClassList;

import java.util.*;

public class ActivityList {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List <ClassList> list = new ArrayList<>();

        System.out.print("How many employee will be registered? ");
        int employee = sc.nextInt();

        for(int i=0; i<employee; i++){
            System.out.println("\nEmployee #"+(i+1));

            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            ClassList Cl = new ClassList(id, name, salary);
            list.add(Cl);
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Integer pos = positionId(list, idSalary);
        if (pos != null){
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            list.get(pos).increaseSalary(percentage);
        }
        else{
            System.out.println("This id does not exist!");
        }
        System.out.println();
        System.out.println("List employee: ");
        for (ClassList i : list){
        System.out.println(i);
        }
    }
    public static Integer positionId(List <ClassList> list, int id){
        for (int i = 0; i<list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
