package qa;

class C
{
    public void show()
    {
        System.out.println("in qa.C");
    }
}
class D extends C
{
    @Override
    public void show()
    {
        System.out.println("in qa.D");
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
