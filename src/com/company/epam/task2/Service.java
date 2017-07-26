package com.company.epam.task2;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владислав on 26.07.2017.
 */
public class Service {
    private ConsoleWorker consoleWorker = new ConsoleWorker();

    public String reserveLiteral() throws IOException {
        String text = consoleWorker.readText();


        Pattern pattern = Pattern.compile("pa\\B");
        Matcher matcher = pattern.matcher(text);

        text = matcher.replaceAll("po");
        return text;


    }
}
