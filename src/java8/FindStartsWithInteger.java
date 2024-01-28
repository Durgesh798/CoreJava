package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStartsWithInteger {
    public static void main(String[] args) {
        int[] numbers={5,9,11,2,8,21,1};

        List<Object> startsWith1 = Arrays.stream(numbers).boxed()
                .map(s -> Integer.toString(s))
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println(startsWith1);

        int n=345;
        String s= Integer.toString(n);
        char [] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int a=Integer.parseInt(String.valueOf(ch[i]));
            int res=a*a;

        }
    }
}
