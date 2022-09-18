class C
{
    public void show()
    {
        System.out.println("in C");
    }
}
class D extends C
{
    @Override
    public void show()
    {
        System.out.println("in D");
    }
}
public class Overriding
{
    public static void main(String[] args)
    {
        D d=new D();
        d.show();
    }
}
