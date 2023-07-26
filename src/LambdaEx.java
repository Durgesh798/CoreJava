@FunctionalInterface
interface Lambdaa{
    void run(int a,int b);
}

public class LambdaEx {
    public static void main(String[] args) {

        Lambdaa l1=(a,b)-> System.out.println(a-b);
        l1.run(4,5);

    }
}
