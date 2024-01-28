package qa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsList
{
    public static void main(String[] args) {
        List<Integer> c = new ArrayList<>();
        c.add(289);
        c.add(512);
        c.add(167);

        Collections.sort(c,(i,j)->i%10>j%10?1:-1); //Comparator

        for(Integer o:c)
        {
            System.out.println(o);
        }

    }
}
