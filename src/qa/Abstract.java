package qa;

abstract class Human
{
    public abstract void eat();
}
class Men extends Human
{
    public void eat()
    {
        System.out.println("Eat Pizza");
    }
}
public class Abstract
{
    public static void main(String[] args)
    {
        Human m=new Men();
        m.eat();
    }
}
