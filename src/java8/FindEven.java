package java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindEven {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(32);
        list.add(43);
        list.add(22);
        list.add(10);
        list.add(22);
        list.add(10);
        list.add(3);

       // list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
       // list.stream().findFirst().ifPresent(System.out::println);
       /* long c = list.stream().count();
        System.out.println(c);
        Integer i = list.stream().max(Integer::compare).get();
        System.out.println(i);*/

        // print first element of list
        list.stream().findFirst().ifPresent(System.out::println);

        System.out.println();

        //last element of list
        Integer last = list.stream().reduce((a,b)->b).get();
        System.out.println(last);

        System.out.println();

        //duplicate elements in list
        list.stream().filter(i-> Collections.frequency(list,i)>1).collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println();

        //

        Map<Integer, String> map = new HashMap<>();

        // Add entries to the Map
        map.put(1, "Geeks");
        map.put(2, "forGeeks");
        map.put(3, "A computer Portal");

        map.entrySet().stream().forEach(System.out::println);

        System.out.println();
        List<Integer> li=Arrays.asList(1,2,3,4,5);
        List<Integer> li1=Arrays.asList(9,83,32,22);
        List<List<Integer>> lis=new ArrayList<>();
        lis.add(li);
        lis.add(li1);

        lis.stream().flatMap(i->i.stream()).collect(Collectors.toList()).forEach(System.out::println);

    }
}
