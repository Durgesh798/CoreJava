package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringList {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Orange","Apple","watermelon","banana","kiwi","pineapple");
        List<String> fruitsSorted = fruits.stream().sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList());
        System.out.println(fruitsSorted);
    }
}
