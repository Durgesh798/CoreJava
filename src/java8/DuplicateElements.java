package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        String str = "ilovejavatechie";
        Map<String, Long>  groupCharMap=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(groupCharMap);
        List<String> duplicateCharcater = groupCharMap.entrySet().stream()
                .filter(v -> v.getValue() > 1)
                .map(k -> k.getKey())
                .collect(Collectors.toList());

        System.out.println(duplicateCharcater);
    }
}
