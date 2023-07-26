interface Dom1{
    void run();
}

abstract class Den implements Dom1 {
    public void run(){
        System.out.println("runn");
    }
}

class Demo1 extends Den implements Dom1{
    public static void main(String[] args) {
        (new Demo1()).run();
    }
}
