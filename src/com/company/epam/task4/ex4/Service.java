package com.company.epam.task4.ex4;

import java.io.File;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Владислав on 04.08.2017.
 */
public class Service {
    private FoleWorker foleWorker = new FoleWorker();
   private ConsoleWorker consoleWorker = new ConsoleWorker();
   private File file;

    public Service(File file) {
        this.file = file;
        consoleWorker.jobWithConsole();
    }

    public void switchMethod(){

        switch (consoleWorker.getSelectNimber()){
            case 1:{
                System.out.println(showMap().toString());
                break;
            }
            case 2:{
                consoleWorker.readNewElementsToMap();
                String s1 = consoleWorker.getEngW();
                String s2 = consoleWorker.getRusW();
                addFrasesToMap(s1,s2);
                break;
            }
            case 3:{
                break;
            }
        }
    }


    private void addFrasesToMap(String s1, String s2){
        Map<String,String> map = foleWorker.readMapFromFile(file);
        map.put(s1,s2);
        foleWorker.writeMapToFile(map,file);
    }

    private Map showMap(){
        return foleWorker.readMapFromFile(file);
    }



}
