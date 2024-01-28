package qa;

class Calc
{
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }

    public void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
}
public class MethodOverlading {
    public static void main(String[] args) {
        Calc c=new Calc();

        c.add(3,5);

        c.add(5,6,7);
    }
}
