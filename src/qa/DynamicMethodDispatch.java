package qa;

class X
{
    public void show()
    {
        System.out.println("in qa.X");
    }
}
class Y extends X
{
    public void show()
    {
        System.out.println("in qa.Y");
    }
}
class Z extends X
{
    public void show()
    {
        System.out.println("in qa.Z");
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
