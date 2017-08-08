package com.company.epam.task4.ex4;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by Владислав on 04.08.2017.
 */
public class ConsoleWorker {

    private StringBuilder stringBuilder = new StringBuilder();
    private FrasesStack stack = new FrasesStack();
    public String jobWithConsole(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] array = s.split(" ");

        for (String s1 : array){
           if(stack.getMap().containsKey(s1)){
                      stringBuilder.append(stack.getMap().get(s1) + " ");
           }


        }
        return stringBuilder.toString();
    }


}
