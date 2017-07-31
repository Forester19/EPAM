package com.company.epam.task3.ex2;

import java.io.BufferedReader;
import java.nio.Buffer;
import java.util.Scanner;

/**
 * Created by Владислав on 28.07.2017.
 */
public class ConsoleWorker {

    private String text;
    private Scanner scanner = new Scanner(System.in);
    private StringBuilder bufferedReader = new StringBuilder();
    public String readText(){
        while ((text = scanner.nextLine()).length() != 0){
            bufferedReader.append(text + " ");
        }
        return bufferedReader.toString();
    }


}
