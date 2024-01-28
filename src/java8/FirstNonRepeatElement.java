package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {
    public static void main(String[] args) {
        String str="ilovejavatechie";

        LinkedHashMap<String, Long> groupCharMap = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(groupCharMap);
        groupCharMap.entrySet().stream()
                .filter(v -> v.getValue() == 1).findFirst().get().getKey();

        //System.out.println(firstCharacter);
    }
}
