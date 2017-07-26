package com.company.epam.task2;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Владислав on 26.07.2017.
 */
public class ConsoleWorker {
    private Scanner scanner = new Scanner(System.in);
    private StringBuilder stringBuilder = new StringBuilder();

    public String readText() throws IOException {
        String text = null;
        do {
            text = scanner.nextLine();
            stringBuilder.append(text);
        }
        while (scanner.nextLine() == null);
        return stringBuilder.toString();
    }
}
