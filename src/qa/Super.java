package qa;

class A
{
    public A()
    {
        System.out.println("in qa.A");
    }
    public A(String s)
    {
        System.out.println("in String qa.A");
    }
}
class B extends A
{
    public B()
    {
        System.out.println("in qa.B");
    }
    public B(String s)
    {
        super("c");
        System.out.println("in String qa.B");
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
