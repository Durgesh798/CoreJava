@java.lang.FunctionalInterface
interface Abc
{
    void show();
}
public class FunctionalInterface
{
    public static void main(String[] args)
    {
        Abc a=()-> System.out.println("This is java 8");   // Lambda Expression
        a.show();
    }
}
