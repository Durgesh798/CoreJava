package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestStringArray {
    public static void main(String[] args) {
        String[] str={"java","techie","springboot","microservices"};

        String longestString = Arrays.stream(str).reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(longestString);

        Map<String, Integer> strMap = Arrays.stream(str)
                .collect(Collectors.toMap(Function.identity(), String::length));
        System.out.println(strMap);

        String key = strMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .findFirst().get().getKey();
        System.out.println(key);

    }
}
