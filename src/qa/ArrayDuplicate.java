package qa;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array ");
        int c=sc.nextInt();
        int a[]=new int[c];
        System.out.println("enter array values ");
        for(int i=0;i<c;i++){
            a[i]=sc.nextInt();
        }

        HashSet<Integer> s =new HashSet<Integer>();
        for(int i=0;i<c;i++){
            s.add(a[i]);
        }
        System.out.print(s);

    }
}
