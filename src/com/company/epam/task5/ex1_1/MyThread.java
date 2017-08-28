package com.company.epam.task5.ex1_1;

/**
 * Created by Владислав on 14.08.2017.
 */
public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i=1 ; i<=10; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Bomb");
    }
}
