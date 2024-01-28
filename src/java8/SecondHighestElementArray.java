package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;


public class SecondHighestElementArray {
    public static void main(String[] args) {
        int[] numbers={2,4,1,89,45};
        Optional<Integer> secondHighestElement = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secondHighestElement);
    }
}
