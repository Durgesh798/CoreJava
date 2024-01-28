package java8;

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

        //list of list of strings, then flatten the resultingstr eam of words into a single stream of strings.
       /* List<List<String>> fruits = new ArrayList<>();
        fruits.add(Arrays.asList("apple", "banana", "apple", "orange"));
        fruits.add(Arrays.asList("grape", "apple", "kiwi"));
        fruits.add(Arrays.asList("apple", "orange", "pear", "apple"));

        List<String> fruitsList = fruits.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(fruitsList);*/

        //list of list of strings containing words, find the total number of characters in all the words.
       /* List<List<String>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList("apple", "banana", "apple", "orange"));
        nestedList.add(Arrays.asList("grape", "apple", "kiwi"));
        nestedList.add(Arrays.asList("apple", "orange", "pear", "apples"));
        int sum = nestedList.stream().flatMap(Collection::stream).mapToInt(String::length).sum();
        System.out.println(sum);*/

        //list of lists of integers, write a program to find the maximum value in the entire nested list.
       /* List<List<Integer>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList(1, 2, 3));
        nestedList.add(Arrays.asList(4, 5));
        nestedList.add(Arrays.asList(6, 7, 8, 9));
        nestedList.add(Arrays.asList(10));

        int maxNum = nestedList.stream().flatMap(Collection::stream)
                .max(Comparator.comparingInt(a -> a)).orElse(0);
        System.out.println(maxNum);*/

        //list of strings, write a program to find all unique characters from all the strings combined
       /* List<List<String>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList("apple", "banana", "apple", "orange"));
        nestedList.add(Arrays.asList("grape", "apple", "kiwi"));
        nestedList.add(Arrays.asList("apple", "orange", "pear", "apple"));

        List<String> unique = nestedList.stream().flatMap(Collection::stream).distinct().collect(Collectors.toList());
        System.out.println(unique);*/

        // list of lists of strings, write a program to find the number of occurrences of
        // specific word in the entire nested list and sort in asc
        /*List<List<String>> nestedList = new ArrayList<>();
        nestedList.add(Arrays.asList("apple", "banana", "apple", "orange"));
        nestedList.add(Arrays.asList("grape", "apple", "kiwi"));
        nestedList.add(Arrays.asList("apple", "orange", "pear", "apple"));

        nestedList.stream().flatMap(Collection::stream).collect(Collectors.groupingBy
                        (String::toString, Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).forEach(System.out::println);*/


    }
}
