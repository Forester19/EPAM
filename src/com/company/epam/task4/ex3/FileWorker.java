package com.company.epam.task4.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * Created by Владислав on 04.08.2017.
 */
public class FileWorker {

    private int lengthList;
    private int MIN_VALUE;
    private int MAX_VALUE;


    public void readFromConsole(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your length of collection ");
        lengthList = scanner.nextInt();

        System.out.println("Enter your diapason (Min value ) ");

        MIN_VALUE = scanner.nextInt();


        System.out.println("Enter your diapason (Max value ) ");

        MAX_VALUE = scanner.nextInt();



    }

    public int getLengthList() {
        return lengthList;
    }

    public void setLengthList(int lengthList) {
        this.lengthList = lengthList;
    }

    public int getMIN_VALUE() {
        return MIN_VALUE;
    }

    public void setMIN_VALUE(int MIN_VALUE) {
        this.MIN_VALUE = MIN_VALUE;
    }

    public int getMAX_VALUE() {
        return MAX_VALUE;
    }

    public void setMAX_VALUE(int MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE;
    }
}
