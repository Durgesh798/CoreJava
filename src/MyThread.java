class Hi extends Thread
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("Hi");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
class Hey extends Thread
{
    public void run()
    {
        for(int i=0;i<4;i++)
        {
            System.out.println("Hey");
            try{Thread.sleep(1000);} catch(Exception e){}
        }
    }
}
public class MyThread
{
    public static void main(String[] args)
    {
        Hi ob=new Hi();
        Hey ob1=new Hey();

        ob.start();
        try{Thread.sleep(20);} catch(Exception e){}
        ob1.start();
    }

}
