package java8;

import java.util.*;
import java.util.stream.Collectors;


public class FindStartWith1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(4);
        list.add(1);

        // List of integers as input and returns the sum of all the even numbers in the list.
        int sum = list.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();
        System.out.println(sum);

        //sum of largest2 nums
        /*int sum = list.stream().sorted(Collections.reverseOrder()).limit(2).mapToInt(i -> i).sum();
        System.out.println(sum);*/

        // list.stream().map(i->i+"").filter(i->i.startsWith("1")).forEach(System.out::println);

       /* Integer i = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).get(1);
        System.out.println(i);*/

       // list.stream().filter(i->i>5).forEach(System.out::println);

      /*  Set<Integer> set=new HashSet<>();
        set.add(3);
        set.add(45);
        set.add(42);

        int sum = set.stream().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sum);
        int sum1 = set.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        set.stream().map(i->i*5).forEach(System.out::println);*/

    }
}
