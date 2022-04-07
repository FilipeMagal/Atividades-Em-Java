package udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListUdemy {
    public static void main(String[] args) {

        List <String> list = new ArrayList<>();


        list.add("10");
        list.add("5");
        list.add("91");
        list.add("50");
        list.add("180");
        list.add(3, "14");
        list.remove(3);
        System.out.println(list.size());

        for (String i : list){
            System.out.println(i);
        }
        System.out.println("---------------------------------------------");

        list.removeIf(i -> i.charAt(0) == '9');
        System.out.println(list);

        System.out.println("---------------------------------------------");

        System.out.println("Index of 180 - "+list.indexOf("180"));

        System.out.println("---------------------------------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == '1').collect(Collectors.toList());

        for (String x: result) {
            System.out.println(x);
        }
        System.out.println("---------------------------------------------");
        String numberFirst = list.stream().filter(x -> x.charAt(0) == '0').findFirst().orElse(null);
        System.out.println(numberFirst);
    }
}

