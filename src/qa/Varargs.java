package qa;

class Cal
{
    public int add(int ... n)
    {
        int sum=0;
        for(int i:n)
        {
            sum=sum+i;
        }
        return sum;
    }
}
public class Varargs
{
    public static void main(String[] args)
    {
        Cal c=new Cal();
        System.out.println(c.add(2,3,4,5,6,7));
    }
}
