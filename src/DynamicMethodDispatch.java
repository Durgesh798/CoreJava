class X
{
    public void show()
    {
        System.out.println("in X");
    }
}
class Y extends X
{
    public void show()
    {
        System.out.println("in Y");
    }
}
class Z extends X
{
    public void show()
    {
        System.out.println("in Z");
    }
}
public class DynamicMethodDispatch
{
    public static void main(String[] args)
    {
        X ob=new Y();
        ob.show();   //runtime polymorphism

        ob=new Z();
        ob.show();   //Dynamic Method Dispatch
    }
}
