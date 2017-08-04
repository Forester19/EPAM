package com.company.epam.task4.ex4;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by Владислав on 04.08.2017.
 */
public class ConsoleWorker {
   private int selectNimber;
   private String engW;
   private String rusW;
    private Scanner scanner;
    public void jobWithConsole(){
        scanner = new Scanner(System.in);
        System.out.println("Show map - 1" + " \n" + "Add new element to map - 2" + " \n" + "Translate words - 3");
        selectNimber = scanner.nextInt();
        if (selectNimber>3 || selectNimber<1){
            System.out.println("error !!!");
        }


    }
    public void readNewElementsToMap(){
        scanner = new Scanner(System.in);
        System.out.println("Enter eng phrase ...");
        engW = scanner.nextLine();
        System.out.println("Enter rus phrase ...");
        rusW = scanner.nextLine();
    }

    public String getEngW() {
        return engW;
    }

    public String getRusW() {
        return rusW;
    }

    public int getSelectNimber() {
        return selectNimber;
    }

    public void setSelectNimber(int selectNimber) {
        this.selectNimber = selectNimber;
    }
}
