package main.com.company.epam.task1.abitu.controller;

import main.com.company.epam.task1.abitu.Stock;
import main.com.company.epam.task1.abitu.model.Entrolle;
import main.com.company.epam.task1.abitu.view.ConsoleHelper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by Владислав on 24.07.2017.
 */
public class Service {

    private Stock stock = new Stock();
    private int bal;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private Entrolle[] students = stock.getStudents();
    private ConsoleHelper consoleHelper = new ConsoleHelper();


    public void doJob(Entrolle[] array) {
        int result = consoleHelper.consoleWorker();
       students = array;
         for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        switch (result) {
            case 1: {
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getMarks() == 2) {
                        System.out.println(students[i].toString());
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Введите балл  ");
                try {
                    bal = Integer.parseInt(bufferedReader.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bal > 5) {
                    System.out.println("Sorry!!");
                    break;
                }
                for (int i = 0; i < students.length; i++) {
                    if (students[i].getMarks() <= bal) {
                        System.out.println(students[i].toString());
                    }
                }
                break;
            }

            case 3: {
                for (int i = 0; i < students.length; i++) {
                    Arrays.sort(students, (a,b) -> (a.getSurname().compareTo(b.getSurname())));
                    System.out.println(students[i]);
                }
                break;
            }

        }

    }





}
