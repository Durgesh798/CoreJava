package qa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo
{
    public static void main(String[] args)
    {
        Collection c=new ArrayList();
        c.add(2);
        c.add(5);
        c.add(1);
        c.add("dhoni");

        Iterator i=c.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
