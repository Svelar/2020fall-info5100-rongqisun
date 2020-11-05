package Assignments.Assignment7;

public class ReverseHello implements Runnable{

    private static int num=50;

    public ReverseHello(){
        //super();
        this.num = num;
    }

    @Override
    public void run() {
        if (num > 0) {
            System.out.println("Hello from Thread "+num+"!");
            num--;
            new Thread(new ReverseHello()).start();
        }
    }

    public static void main(String[] args) {
        ReverseHello h1 = new ReverseHello();
        Thread t1 = new Thread(h1);
        t1.start();
    }
}
