package java8;

import java.util.Arrays;
import java.util.List;

public class ProductList {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(4,432,7,22,45,13);
        int productOfList = num.stream().reduce((a, b) -> a * b).get();
        System.out.println(productOfList);
    }
}