package com.company.epam.task5.ex1_3;

import java.util.Map;

/**
 * Created by Владислав on 18.08.2017.
 */
public class PrinterHashMap implements Runnable {
    private MyMap myMap;

    public PrinterHashMap(MyMap myMap) {
        this.myMap = myMap;
         }

    @Override
    public void run() {
        myMap.getHashMap().forEach((key,value) -> System.out.println("got  "  + key + "  " + value));
    }
}
