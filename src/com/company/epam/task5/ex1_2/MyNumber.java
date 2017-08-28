package com.company.epam.task5.ex1_2;

/**
 * Created by Владислав on 14.08.2017.
 */
public class MyNumber {
    private int index;

    private boolean bool = false;
    int get() {
        while (!bool)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        System.out.println("Got " + index);

        bool = false;
        notify();

        return index;
    }


    void put(int index) {
        while (bool)
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        this.index = index;
        bool =true;
        System.out.println("Put : " + index);
        notify();
    }
}
