package com.company.epam.task2.Var1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владислав on 27.07.2017.
 */
public class Service {

   private ConsoleWorker consoleWorker = new ConsoleWorker();
   private String newPhrase = "NEW_WORD";
   public String entrenceWord(){

       String text = consoleWorker.readText();

       String[] arrayText = text.split(" ");


       Pattern pattern = Pattern.compile("ing\\B");
       Matcher matcher = pattern.matcher(text);

       text = matcher.replaceAll("ing " + newPhrase);

       return text;


   }


}
