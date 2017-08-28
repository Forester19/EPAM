package com.company.epam.task5.ex1_3;

/**
 * Created by Владислав on 18.08.2017.
 */
public class PrinterConcurrentHashMap implements Runnable{
    private MyMap myMap;

    public PrinterConcurrentHashMap(MyMap myMap) {
        this.myMap = myMap;
    }

    @Override
    public void run() {
        myMap.getCuncrHashMap().forEach((key,value) -> System.out.println("got  "  + key + "  " + value));
    }
}
