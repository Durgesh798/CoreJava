package qa;

@java.lang.FunctionalInterface
interface Ab
{
    void show();
    default void run()
    {
        System.out.println("In run method");
    }
}
class AbImp implements Ab
{
    public void show()
    {
        System.out.println("in show method");
    }
}
public class InterfaceEx2
{
    public static void main(String[] args)
    {
        Ab a=new AbImp();
        a.run();
        a.show();
    }
}
