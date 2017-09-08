package main.com.company.epam.task2.Var1;

import java.util.Scanner;

/**
 * Created by Владислав on 27.07.2017.
 */
public class ConsoleWorker {

    private Scanner scanner = new Scanner(System.in);
    private StringBuilder stringBuilder = new StringBuilder();
    public String readText(){
        String text = null;

        while ((text = scanner.nextLine()).length() != 0){

            stringBuilder.append(text + "\n");

        }
        return stringBuilder.toString();
    }
}
