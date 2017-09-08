package main.com.company.epam.task5.ex1_1;

/**
 * Created by Владислав on 14.08.2017.
 */
public class MAin {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();

        Thread thread = new Thread(myThread);

        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
