package main.com.company.epam.task2.myVar3;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Владислав on 26.07.2017.
 */
public class ConsoleWorker {
    private Scanner scanner = new Scanner(System.in);
    private StringBuilder stringBuilder = new StringBuilder();

    public String readText() throws IOException {
        System.out.println("please set text");
        String text;
        while ((text = scanner.nextLine()).length() != 0)
            stringBuilder.append(text + "\n");


        return stringBuilder.toString();
    }
}
