package qa;

public class MyThreadEx1
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1=new Thread(()->
        {
            for(int i=0;i<3;i++)
            {
                System.out.println("hi");
                try{Thread.sleep(1000);} catch(Exception e){}
            }
        }
        );
        Thread t2=new Thread(
                ()->
                {
                    for(int i=0;i<3;i++)
                    {
                        System.out.println("hey");
                        try{Thread.sleep(1000);} catch(Exception e){}
                    }
                }
        );

        t1.start();
        try{Thread.sleep(20);}catch(Exception e){}
        t2.start();

        t1.join();
        t2.join();

        System.out.println(t1.isAlive());
        System.out.println("Done");
    }
}
