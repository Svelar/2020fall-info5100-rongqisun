package Assignments.Assignment8;

import java.util.Random;
import java.util.concurrent.*;

public class FindMaxValue {
    public static class FindThread implements Callable<Integer>{

        private int[] arr;
        private int start, end;

        public FindThread(int[] arr, int begin, int end) {
            this.arr = arr;
            this.start = begin;
            this.end = end;
        }

        @Override
        public Integer call() throws Exception {
            int max = arr[start];
            for (int i = start; i < end; i++) {
                if (max < arr[i]){
                    max = arr[i];
                }
            }

            return max;
        }
    }

    public static int max(int[] array) throws ExecutionException, InterruptedException {
        int length = array.length; //Assignment says it is a very large array, so length > 4
        int gap = (length/4);

        FindThread thread1 = new FindThread(array, 0, gap);
        FindThread thread2 = new FindThread(array, gap,2*gap);
        FindThread thread3 = new FindThread(array, 2*gap,3*gap);
        FindThread thread4 = new FindThread(array, 3*gap,length);

        ExecutorService service = Executors.newFixedThreadPool(4);

        Future<Integer> future1 = service.submit(thread1);
        Future<Integer> future2 = service.submit(thread2);
        Future<Integer> future3 = service.submit(thread3);
        Future<Integer> future4 = service.submit(thread4);

        int temp1 = Math.max(future1.get(), future2.get());
        int temp2 = Math.max(future3.get(), future4.get());
        return Math.max(temp1, temp2);

    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] array = new int[10000];
        Random r = new Random();
        for (int i = 0; i < 10000; i++) {
            array[i]= r.nextInt();
        }

        System.out.println(FindMaxValue.max(array));
    }


}
