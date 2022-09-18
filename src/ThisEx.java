class Add {
    int a;
    int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
public class ThisEx
{
    public static void main(String[] args)
    {
        Add ad=new Add(5,6);
        System.out.println(ad.a);
        System.out.println(ad.b);
    }
}
