package main.com.company.epam.task5.ex1_5;

import java.io.File;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by Владислав on 25.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("G:\\JAVA");

        ForkJoinPool forkJoinPool = new ForkJoinPool(5);

        forkJoinPool.invoke(new MyThread(file));



    }
}
