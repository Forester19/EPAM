package main.com.company.epam.task4.ex1.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 02.08.2017.
 */
public class ConsoleHelper {

    private int selectNumber;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public int consoleWorker(){
        System.out.println("Получить список абитуриентов, которые " + "имеют двойки за экзамены; " + "нажмите 1" + "\n"+
                "Получить список абитуриентов, у  " +  "которых средний бал выше указанного; " + "нажмите 2" +"\n" +
                "Упорядочить абитуриентов в алфавитном " + " порядке согласно фамилии "+ " нажмите 3" + "\n"+
                "Write enrollee to file then press 4" +" \n"+
        "Read enrollees from file and show in console 5");
        try {
            selectNumber = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (selectNumber>5 || selectNumber <1){
            System.out.println("Fail sry!!!");
            return 0;
        }
        return selectNumber;
    }
}
