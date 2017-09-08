package main.com.company.epam.task5.ex1_4;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Владислав on 20.08.2017.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = new int[1_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        ForkJoinPool forkJoinPool = new ForkJoinPool(8);
        int result = forkJoinPool.invoke(new Summer(0,1000,array));

        System.out.println(result);
    }

    static class Summer extends RecursiveTask<Integer> {
        int from;
        int to;
        int[] array;

        public Summer(int from, int to, int[] array) {
            this.from = from;
            this.to = to;
            this.array = array;
        }
     int middle;
        @Override
        protected Integer compute() {
            if ((to -from) < 20) {
             return summerFunc(array);
            }else{
                middle = (from + to)/2;
                Summer summer = new Summer(from,middle,array);
                summer.fork();

                Summer summer1 = new Summer(middle,to,array);
                summer1.fork();


                return  summer.join() + summer1.join();
            }
        }
    }

    public static int summerFunc(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;

    }


}
