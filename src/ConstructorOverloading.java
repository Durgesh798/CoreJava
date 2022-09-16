class Multiply
{
    int a;
    int b;
    public Multiply()
    {
        a=0;
        b=0;
        System.out.println(a);
        System.out.println(b);
    }
    public Multiply(int i, int j)
    {
        a=i;
        b=j;
        System.out.println(a);
        System.out.println(b);
    }
}
public class ConstructorOverloading {

    public static void main(String[] args) {
        Multiply m=new Multiply();

        Multiply m1=new Multiply(3,5);
    }
}
