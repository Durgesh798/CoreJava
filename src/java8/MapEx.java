package java8;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Apple");fruits.put(2, "Banana");fruits.put(3, "Orange");fruits.put(4, "Banana");fruits.put(6, "Oranges");
        //fruits.entrySet().stream().forEach(System.out::println);

        //finding the value for the key =2
        /*Optional<String> first = fruits.entrySet().stream().filter(i -> 2==(i.getKey()))
                .map(Map.Entry::getValue).findFirst();
        System.out.println(first.get());*/

        //finding the value for the key >2
      /*  Map<Integer, String> collect = fruits.entrySet().stream().filter(i -> i.getKey() > 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect);*/

        // transform a map of strings to uppercase values
        /*Map<Integer, String> collect = fruits.entrySet().stream()
                .collect(Collectors.toMap(i -> i.getKey(), i -> i.getValue().toUpperCase()));
        System.out.println(collect);*/

        //Longest String in Map Values
      /*  String s = fruits.values().stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(s);*/

        //group by value in map
      /*  Map<String, Long> collect = fruits.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()));
        System.out.println(collect);*/

        //key associated with the maximum value in a map
      /*  Integer key = fruits.entrySet().stream().max((a, b) -> a.getValue().length() >
                b.getValue().length() ? 1 : -1).get().getKey();

        System.out.println(key);*/

        //filter a map to include only the entries with values starting with a specific prefix.
       /* Map<Integer, String> a = fruits.entrySet().stream().filter(i -> i.getValue().startsWith("A"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(a);*/

        //convert map to list
        /*List<Map.Entry<Integer, String>> collect = fruits.entrySet().stream().collect(Collectors.toList());
        System.out.println(collect);*/

        //get key with even numbers
        //fruits.entrySet().stream().filter(t->t.getKey()%2==0).forEach(System.out::println);

        //sort ny key
      /*  fruits.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .forEach(System.out::println);*/

    }
}
