package java8;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(11, 2, 3, 3, 5, 2, 7, 11, 6);
        /*
        Random random=new Random(100);
        random.ints().limit(8).forEach(System.out::println);*/

        //print list
        // li.stream().forEach(System.out::println);

        //print list without duplictaes
        //li.stream().collect(Collectors.toSet()).forEach(System.out::println);

        //print list in sorted order
        //li.stream().sorted().forEach(System.out::println);

        //print each occurenace of list
        /*Map<Integer, Long> collect = li.stream().collect(Collectors.groupingBy(Integer::intValue,
               Collectors.counting()));
        System.out.println(collect);*/

        //print list in desc order
        //li.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        //print each occurenace of list when it is > 1
      /*  Map<Integer, Long> mp = li.stream().collect(Collectors.groupingBy(Integer::intValue,
                Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(mp);*/

        //find the element 7
        //li.stream().filter(i->i.equals(7)).collect(Collectors.toList()).forEach(System.out::println);

        //multiply th list elements
      /*  Optional<Integer> mul=li.stream().reduce((a, b)->a*b);
        if(mul.isPresent())
        {
            System.out.println("multply of list : " +mul.get());
        }
        else {
            System.out.println("0");
        }*/

        //find second-highest element
        /*int sh = li.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
        System.out.println(sh);*/

        //all elements start with 1
        /*li.stream().map(s->s.toString()).filter(a->a.startsWith("1")).collect(Collectors.toList())
                .forEach(System.out::println);*/

        //multiply of all elements in list
       /* int mul = li.stream().reduce((a, b) -> a * b).get();
        System.out.println(mul);*/


        /*//Each element should be preceded by the letter 'e' if the number is even, and preceded
        // by the letter 'o' if the number is odd. For example, if the input list is (3,44),
        // the output should be 'o3,e44'.*/
     /*   String s = li.stream().map(i -> (i % 2 == 0) ? "e" + i : "o" + i).collect(Collectors.joining(","));
        System.out.println(s);*/

        // Stream of integers from 1 to 100 (inclusive) using Java 8 Streams. Then, write a lambda
        // expression to calculate the sum of the squares of all the numbers divisible by 3 in the stream.
        /*IntStream intStream = IntStream.rangeClosed(1, 101);

        int sum = intStream.filter(i -> i % 3 == 0).map(i -> i * i).sum();
        System.out.println(sum);*/

        //find the product of all the numbers in the list. Handle the case when the list is
        // empty by returning 1.
      /*  ArrayList<Integer> lis=new ArrayList<>();
        int mul = lis.stream().reduce(1,(a, b) -> a * b);
        System.out.println(mul);*/

        //find the average of all the numbers in the list. Handle the case when the list is empty by returning 0.
        /*ArrayList<Integer> lis=new ArrayList<>();
        double avg = li.stream().mapToDouble(i -> i).average().orElse(0.0);
        System.out.println(avg);*/

        //list of integers, use Java 8 streams to find the maximum and minimum values in the list.
        /*int max = li.stream().mapToInt(i -> i).summaryStatistics().getMax();
        System.out.println(max);
        int min = li.stream().mapToInt(i -> i).summaryStatistics().getMin();
        System.out.println(min);*/

        //check if all elements in a list of integers are greater than 10.
       /* boolean b = li.stream().allMatch(i -> i > 10);
        System.out.println(b);*/

        //, write a Java 8 program to find the sum of all even numbers in the list.
        /*int sum = li.stream().filter(i -> i % 2 == 0).mapToInt(i -> i).sum();
        System.out.println(sum);*/

        //find all prime numbers from a given list of integers.
        //li.stream().filter(StreamEx::isPrime).forEach(System.out::println);

        //check if list contains 3
        //li.stream().anyMatch(num -> String.valueOf(num).contains("7")) ;

        //return a list of those numbers squared and the product added to 10, omitting any of the resulting
        // numbers that end in 5 or 6.
       /* li.stream().map(i->(i*i)+10).map(i->i+"").filter(i->!(i.endsWith("5") || i.endsWith("6")))
                .toList().forEach(System.out::println);*/

        //find first element in list
        Integer integer = li.stream().findFirst().get();
        System.out.println(integer);
        System.out.println(integer.floatValue());

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}