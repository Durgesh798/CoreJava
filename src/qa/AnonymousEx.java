package qa;

class Sample
{
    public void show()
    {
        System.out.println("in sample class");
    }
}
public class AnonymousEx
{
    public static void main(String[] args)
    {
        Sample s=new Sample()
        {
            public void show()
            {
                System.out.println("in inside class");
            }
        };
        s.show();
    }
}
