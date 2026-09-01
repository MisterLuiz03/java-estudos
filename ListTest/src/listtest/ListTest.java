package listtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListTest {

   
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        
        list.add("Maria");
        list.add("Fernando");
        list.add("Carlos");
        list.add("Louis");
        list.add(2, "César");
        
        list.remove("Carlos");
        
        
        System.out.println(list.size());
        
        for (String x : list) {
            System.out.println(x);
        }
        
        System.out.println("---------------");
        
        list.removeIf(x -> x.charAt(0) == 'L');
         for (String x : list) {
            System.out.println(x);
        }
         
        System.out.println("----------------");
        
        System.out.println("Index of Maria: " + list.indexOf("Maria"));
        
        System.out.println("----------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
         for (String x : result) {
            System.out.println(x);
        }
        System.out.println("---------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
    }
    
}
