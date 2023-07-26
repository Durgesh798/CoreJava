package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx1 {

    public static void main(String[] args) {

        List<String> fruits= Arrays.asList("apples","orange","apple","Injavase","watermelon","banana","orange","appa","amc");

        //print all strings
        //fruits.stream().collect(Collectors.toList()).forEach(System.out::println);

        //print duplicates only
       /* fruits.stream().collect(Collectors.groupingBy(String::toString,Collectors.counting()))
                .entrySet().stream().filter(s->s.getValue()>1).collect(Collectors.toList())
                .forEach(System.out::println);*/


        String s="helloworld";

        //ocuurence of each char
        /*Map<String, Long> map=Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);*/

        //duplicate char
       /* Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(k->k.getValue()>1)
                .forEach(System.out::println);*/

        //first occurence of unique char
      /*  String key = Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting())).entrySet().stream()
                .filter(k -> k.getValue() == 1).findFirst().get().getKey();
        System.out.println(key);*/

        //largest string in list
        /*String ls=fruits.stream().reduce((w,w1)->w.length()>w1.length()?w:w1).get();
        System.out.println(ls);*/

        //start with a and have 3 elements
    /*    fruits.stream().filter(i->i.startsWith("a")&&i.length()==3).collect(Collectors.toList())
                .forEach(System.out::println);*/

        //find and return the longest string from the list.
       /* String s1 = fruits.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(s1);*/

        //sort the list in ascending order of the length of each string. If two strings have
        // the same length, sort them in lexicographical order.
       /* fruits.stream().sorted(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder())).forEach(System.out::println);*/

        //List of strings and returns a new List containing only the strings that start
        // with a vowel (a, e, i, o, or u), in uppercase.
        //fruits.stream().filter(StreamEx1::startsWithVowel).map(String::toUpperCase).forEach(System.out::println);

        //Then, write a Java 8 lambda expression to filter the strings that contain the substring "Java"
        // and convert the remaining strings to lowercase.
        //fruits.stream().filter(i->i.contains("java")).map(String::toLowerCase).forEach(System.out::println);

        //Create a Stream of strings from a given array of strings. Then, write a Java 8 lambda expression to concatenate
        // all the strings from the stream into a single string, separating them with a comma.
      /*  String[] str= {"arr","sasd","sddf"};
        String[] str1= {"sadsdv","sasd","sddf"};
        Stream.concat(Stream.of(str), Stream.of(str1)).distinct().forEach(System.out::println);*/

        // list of strings, use Java 8 streams to sort the strings in ascending order based on their lengths.
        //fruits.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);

        //use Java 8 streams to find the count of strings that have a length greater than 5
       /* long count = fruits.stream().filter(i -> i.length() > 5).count();
        System.out.println(count);*/

        // find the number of strings that contain the letter "e".
       /* long e = fruits.stream().filter(c -> c.contains("e")).count();
        System.out.println(e);*/

        //check if a list of strings contains any palindrome strings
       // fruits.stream().filter(StreamEx1::palindrome).collect(Collectors.toList()).forEach(System.out::println);

        //find the unique characters present in all the words.
       /* Set<Character> characters = fruits.stream().map(word -> word.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()))
                .reduce((set1, set2) -> {
                    set1.retainAll(set2);
                    return set1;
                })
                .orElseThrow();
        System.out.println(characters);*/

        //give me the total number of letters in all the names with more than 5 letters
        /*int sum = fruits.stream().filter(i -> i.length() > 5).mapToInt(i -> i.length()).sum();
        System.out.println(sum);*/

        //

    }

    public static boolean startsWithVowel(String str) {
        String lowercaseStr = str.toLowerCase();
        return lowercaseStr.startsWith("a") || lowercaseStr.startsWith("e")
                || lowercaseStr.startsWith("i") || lowercaseStr.startsWith("o") || lowercaseStr.startsWith("u");
    }

    public static boolean palindrome(String str){
        String[] ch=str.split("");
        String s="";
        boolean b=false;
        for(int i=ch.length-1;i>=0;i--){
            s=s+ch[i];
        }
        if(str.equals(s)){
            b=true;
        }
        return b;
    }


}
