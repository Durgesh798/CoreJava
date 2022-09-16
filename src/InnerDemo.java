class Outer
{
    public void show()
    {
        System.out.println("In outer class");
    }
    class Inner
    {
        public void display()
        {
            System.out.println("In inner class");
        }
    }
}
public class InnerDemo
{
    public static void main(String[] args)
    {
        Outer ob=new Outer();
        ob.show();

        Outer.Inner obj=ob.new Inner();
        obj.display();
    }
}
