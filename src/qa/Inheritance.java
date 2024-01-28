package qa;

class Addition
{
    public int add(int a, int b)
    {
        return a+b;
    }
}
class Subtraction extends Addition
{
    public int sub(int a,int b)
    {
        return a-b;
    }
}
class Multiplication extends Subtraction
{
    public int mul(int a, int b)
    {
        return a*b;
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        Multiplication m=new Multiplication();
        System.out.println(m.add(2,4));
        System.out.println(m.sub(7,2));
        System.out.println(m.mul(4,2));
    }
}
