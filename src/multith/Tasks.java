package multith;

public class Tasks {
    public static void main(String[] args) {
        Task1 t1=new Task1();
        t1.start();

        Task2 t2=new Task2();
        t2.run();
    }
}

class Task1 extends Thread{
        public void run() {
            System.out.println("task 1 started");
            for (int i = 0; i <= 5; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("task 1 done");
        }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("task 2 started");
        for (int i = 7; i <= 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("task 2 done");
    }
}

