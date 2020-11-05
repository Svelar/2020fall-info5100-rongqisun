package Assignments.Assignment7.Sum;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    int[] arr;
    static long total;
    CountDownLatch latch;
    int start;
    int end;

    public MyThread(int[] arr,int start,int end,CountDownLatch latch){
        this.arr=arr;
        this.start=start;
        this.end=end;
        this.latch=latch;
    }

    @Override
    public void run() {
        int result=0;
        for(int i= start; i< end; i++){
            result+= arr[i];
        }

        synchronized (MyThread.class) {
            total +=result;
        }

        System.out.println(Thread.currentThread().getName());
        latch.countDown();

    }

}
