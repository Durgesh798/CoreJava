class A
{
    public A()
    {
        System.out.println("in A");
    }
    public A(String s)
    {
        System.out.println("in String A");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("in B");
    }
    public B(String s)
    {
        super("c");
        System.out.println("in String B");
    }
}
public class Super
{
    public static void main(String[] args)
    {
        B ob=new B();
        B ob1=new B("k");
    }
}
