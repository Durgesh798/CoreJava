package multith;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceRunner {
    public static void main(String[] args) {
        //ExecutorService executorService= Executors.newSingleThreadExecutor();

        ExecutorService executorService= Executors.newFixedThreadPool(3);

        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.println("task 3 started");
        for(int i=20;i<=25;i++){
            System.out.print(i+" ");
        }
        System.out.println("task 3 done");

        executorService.shutdown();
    }


}
