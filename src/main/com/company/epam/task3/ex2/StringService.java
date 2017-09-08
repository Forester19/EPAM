package main.com.company.epam.task3.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владислав on 28.07.2017.
 */
public class StringService {
    private ConsoleWorker consoleWorker = new ConsoleWorker();
    private StringBuilder stringBuilder = new StringBuilder();
    public String searchWords(){
        String text = consoleWorker.readText();



        Pattern pattern;
        Matcher matcher;

            pattern = Pattern.compile("\\B(\\(|\\{)[A-Z0-9]+(}+)");

            matcher = pattern.matcher(text);



            while (matcher.find()) {
               // System.out.println(matcher.group());
                stringBuilder.append(matcher.group() + " ");
            }
    return stringBuilder.toString();
    }
}
