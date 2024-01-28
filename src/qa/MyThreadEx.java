package qa;

class Ex implements Runnable
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("qa.Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Ex2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("qa.Hey");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class MyThreadEx
{
    public static void main(String[] args)
    {
        Runnable ob=new Ex();
        Runnable ob1=new Ex2();

        Thread t1=new Thread(ob);
        Thread t2=new Thread(ob1);

        t1.start();
        try{Thread.sleep(20);}catch(Exception e){}
        t2.start();
    }
}
