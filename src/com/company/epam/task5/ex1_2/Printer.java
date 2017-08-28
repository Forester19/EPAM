package com.company.epam.task5.ex1_2;

/**
 * Created by Владислав on 14.08.2017.
 */
public class Printer implements Runnable {

    private MyNumber myNumber;

    public Printer(MyNumber myNumber) {
        this.myNumber = myNumber;
        new Thread(this,"Printer");
    }

    @Override
    public void run() {
         for (int i=0; i<1000000;i++){


                 System.out.println(myNumber.get());


         }
    }
}
