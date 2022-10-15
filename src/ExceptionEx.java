public class ExceptionEx
{
    public static void main(String[] args)
    {
        try
        {
            int a[]=new int[5];
            a[7]=6;
            int i=8;
            int j=0;
            int k=i/j;
            System.out.println("result is :" +k);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error, array size is 5");
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
        finally
        {
            System.out.println("done");
        }
    }
}
