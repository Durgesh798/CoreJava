package multith;

import java.util.concurrent.*;

class CallableTask implements Callable<String>{

    private String name;

    public CallableTask(String name) {
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(100);
        return "qa.Hello " + name ;
    }
}

public class CallableEx {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        Future<String> futureName = executorService.submit(new CallableTask("sam"));

        System.out.println("call started");

        System.out.println(futureName.get());

        System.out.println("main is done");

        executorService.shutdown();


    }
}
