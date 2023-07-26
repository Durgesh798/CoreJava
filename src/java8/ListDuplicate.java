package java8;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ListDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,10,15,8,49,25,32,33,8,48,10);
       // list.stream().collect(Collectors.toSet()).forEach(System.out::println);
        //int min=list.stream().min(Integer::compare).get();
        //System.out.println(min);
        //list.stream().map(i->i*3).collect(Collectors.toList()).forEach(System.out::println);

        //list.stream().sorted().forEach(System.out::println);

        //int sum = list.stream().mapToInt(Integer::intValue).sum();
        //System.out.println(sum);

       // list.stream().map(i->i*i*i).filter(i->i>50).forEach(System.out::println);

       // list.stream().map(i->i*i).distinct().collect(Collectors.toList()).forEach(System.out::println);

        /*IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(intSummaryStatistics);

        list.stream().map(i->i).collect(Collectors.toList()).forEach(System.out::println);*/

        /*OptionalDouble avg=list.stream().mapToDouble(i->i).average();
        System.out.println(avg);*/

        Integer integer = list.stream().sorted().collect(Collectors.toList()).get(1);
        System.out.println(integer);


    }
}
