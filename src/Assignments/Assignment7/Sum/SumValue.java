package Assignments.Assignment7.Sum;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class SumValue{

    /*generate array of random numbers*/
    static void generateRandomArray(int[] arr){
        Random r = new Random();
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            arr[i]= r.nextInt();
        }
    }




    /*get sum of an array using 4 threads*/
    static long sum(int[] arr) throws InterruptedException{
        int length = arr.length;
        CountDownLatch latch=new CountDownLatch(4);

        for(int i = 0; i < length; i+= (length/4)){
            MyThread task;
            if( (i+(length/4)) <=length){
                task=new MyThread(arr, i, i+(length/4), latch);
            }else{
                task=new MyThread(arr, i, length, latch);
            }
            new Thread(task).start();
        }
        latch.await();
        return MyThread.total;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] arr = new int[4000000];

/*
        Test whether the result is correct:
        for (int i = 0; i < arr.length; i++) {
            arr[i]= 1;
        }*/

        generateRandomArray(arr);
        long sum = sum(arr);
        System.out.println("Sum: " + sum);
    }

}
