package qa;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo
{
    public static void main(String[] args)
    {
        Set<Integer> s=new HashSet<>();
        s.add(45);
        s.add(78);
        s.add(67);

        for(int i:s)
        {
            System.out.println(i);
        }

        System.out.println("---------");

        Set<Integer> s1=new TreeSet<>();
        s1.add(45);
        s1.add(78);
        s1.add(67);

        for(int i:s1)
        {
            System.out.println(i);
        }
    }
}
