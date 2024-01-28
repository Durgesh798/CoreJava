package qa;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args) {
        List c = new ArrayList();
        c.add(2);
        c.add(5);
        c.add(1);
        c.add(1, "dhoni");

        for(Object o:c)
        {
            System.out.println(o);
        }

    }
}
