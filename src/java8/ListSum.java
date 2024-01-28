package java8;

import java.util.Arrays;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> li= Arrays.asList(34,43,2,4,5,21,111);
        int sumOfList = li.stream().mapToInt(i -> i).sum();
        System.out.println(sumOfList);
    }
}
