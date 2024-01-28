package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DistinctString {
    public static void main(String[] args) {
       /* String[] s={"durgesh","dhoni","hjds","durgesh","rjf"};

        Arrays.stream(s).filter(i->i.equals("durgesh")).collect(Collectors.toList()).
                forEach(System.out::println);*/
        String s="fdjjvdddnssdd";

       /* Map<Character, Long> s1 = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(s1);*/

        //Given a string find out duplicate character and its count
        /*Map<String, Long> collect = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting())).entrySet().stream().filter(i -> i.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect);*/

       /* String s="fdjjvdddnsdd";

        Map<Character, Long> s1 = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(s1);

        Map<Character, Long> s2 = s1.entrySet().stream().
                filter(i -> i.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(s2);*/

       /* String a="qa.Hello world qa.Hello world this is a class";

        Map<String,Integer> mp=new HashMap<>();

        Arrays.stream(a.split(" "))
                .forEach(word -> mp.put(word, mp.getOrDefault(word, 0) + 1));

        Map<String, Integer> mp2 = mp.entrySet().stream().filter(i -> i.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(mp2);
*/

       // String s="qa.Hello i am a  book  asem";
       /* long count = Arrays.stream(s.split(" ")).filter(x -> x.isEmpty()).count();
        System.out.println(count);

        long count1 = Arrays.stream(s.split(" ")).filter(i -> i.startsWith("a")).count();
        System.out.println(count1);*/

        /*Arrays.stream(s.split(" ")).filter(x->!x.isEmpty()).collect(Collectors.toList())
                .forEach(System.out::println);*/

       /* String collect = Arrays.stream(s.split(" ")).map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(collect);*/

        /*Arrays.stream(s.split(" ")).map(String::toLowerCase).collect(Collectors.toList())
                .forEach(System.out::println);

        Arrays.stream(s.split(" ")).map(i->i.toUpperCase()).collect(Collectors.toList())
                .forEach(System.out::println);*/

        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));
    }
}