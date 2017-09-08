package main.com.company.epam.task5.ex1_3;

/**
 * Created by Владислав on 18.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        MyMap myMap = new MyMap();

        jobWithHashMap(myMap);
        jobWithConcurrentHashMap(myMap);

    }
    private static void jobWithHashMap(MyMap myMap){
        int a  = (int) System.currentTimeMillis();

        CounterHashMap counterHashMap = new CounterHashMap(myMap);
        PrinterHashMap printerHashMap = new PrinterHashMap(myMap);

        Thread thread1 = new Thread(counterHashMap,"counterHashMap");
        Thread thread2 = new Thread(printerHashMap,"printHashMap");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int b = (int) System.currentTimeMillis();

        System.out.println(" time to job with hash map    " + (b - a));

    }
    private static void jobWithConcurrentHashMap(MyMap myMap){
        int a  = (int) System.currentTimeMillis();

        CounterConcurrentHashMap counterHashMap = new CounterConcurrentHashMap(myMap);
        PrinterConcurrentHashMap printerHashMap = new PrinterConcurrentHashMap(myMap);

        Thread thread1 = new Thread(counterHashMap,"concurConcurrentHashMap");
        Thread thread2 = new Thread(printerHashMap,"printConcurrentHashMap");

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int b = (int) System.currentTimeMillis();

        System.out.println(" time to job with concurrent hash map    " + (b - a));

    }
}
