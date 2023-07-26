package java8;

import java.util.*;

public class flatMapEx {
    public static void main(String[] args) {

      /*  List<Integer> PrimeNumbers = Arrays.asList(5, 7, 11,13);
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListofInts =Arrays.asList(PrimeNumbers, OddNumbers, EvenNumbers);

        listOfListofInts.stream().flatMap(Collection::stream).toList().forEach(System.out::println);*/

        //list of lists and you want to flatten it into a single list:
      /*  List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> collect = listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);*/

        //list of strings and split each string into individual words. We then flatten the resulting
        // stream of words into a single stream of strings.
       /* List<String> listOfStrings = Arrays.asList(
                "Hello World",
                "Welcome to Java 8",
                "Stream FlatMap Example"
        );

        listOfStrings.stream().map(str->str.split(" ")).flatMap(li-> Arrays.stream(li))
                .collect(Collectors.toList());
        System.out.println(listOfStrings);*/

        //list of strings containing words, find the total number of characters in all the words.
        /*List<String> listOfStrings = Arrays.asList(
                "Hello World",
                "Welcome to Java 8",
                "Stream FlatMap Example"
        );
        int sum = listOfStrings.stream().flatMap(word -> Arrays.stream(word.split("")))
                .mapToInt(li -> li.length()).sum();
        System.out.println(sum);*/

        //list of lists of integers, write a program to find the maximum value in the entire nested list.
        List<List<Integer>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList(1, 2, 3));
        nestedList.add(Arrays.asList(4, 5));
        nestedList.add(Arrays.asList(6, 7, 8, 9));
        nestedList.add(Arrays.asList(10));

        int maxNum = nestedList.stream().flatMap(Collection::stream)
                .max(Comparator.comparingInt(a -> a)).orElse(0);
        System.out.println(maxNum);



    }
}
