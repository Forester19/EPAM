package com.company.epam.task4.ex1.controller;

import com.company.epam.task4.ex1.dao.MyFileWorker;
import com.company.epam.task4.ex1.model.Enrollee;
import com.company.epam.task4.ex1.view.ConsoleHelper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Владислав on 31.07.2017.
 */
public class Service {


    private ConsoleHelper consoleWorker = new ConsoleHelper();

    private Enrollee[] enrollees;
    private String fileUrl = "enrollee.txt";
    private File  file  = new File(fileUrl);
     private MyFileWorker myFileWorker = new MyFileWorker(file);

    public Service(Enrollee[] enrollees) {
        this.enrollees = enrollees;
    }

    public void doJob(Enrollee[] enrollees) {
        int number = consoleWorker.consoleWorker();


        switch (number) {
            case 1: {
                System.out.println(showAbitsWithBadMarks(enrollees).toString() + "\n");
                break;
            }
            case 2: {
                System.out.println("enter you number " + " \n");
                Scanner scanner = new Scanner(System.in);
                int newNumber = scanner.nextInt();
                if (newNumber > 5 || newNumber < 0) {
                    System.out.println("ERROR");
                    break;
                }
                System.out.println(showAbitsWitsBetterMarkThetThis(enrollees, newNumber).toString() + " \n");
                break;
            }
            case 3: {
                for (Enrollee abiturient: showSortedAbitBySurname()){
                    System.out.println(abiturient.toString());
                }
                break;

            }
            case 4:{

                try {
                    myFileWorker.wtiteObjectToFile(enrollees);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("wrote to file");
        break;
            }
            case 5:{
                try {
                    for (Enrollee enrollee: myFileWorker.readFromFile()){
                        System.out.println(enrollee + " \n");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            break;
            }
        }

    }


    private ArrayList<Enrollee> showSortedAbitBySurname() {


        ArrayList<Enrollee> list = new ArrayList<>();
        for (Enrollee enrollee: enrollees) {
            list.add(enrollee);
        }
        Collections.sort(list, new Comparator<Enrollee>() {
            @Override
            public int compare(Enrollee o1, Enrollee o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }

        });
        return list;
    }

    private ArrayList<Enrollee> showAbitsWithBadMarks(Enrollee[] enrollee) {

        ArrayList<Enrollee> withBadMarks = new ArrayList<>();


        for (int i = 0; i < enrollee.length; i++) {
            if (enrollee[i].getMarks() == 2) {
                withBadMarks.add(enrollee[i]);
            }
        }
        return withBadMarks;

    }

    private ArrayList<Enrollee> showAbitsWitsBetterMarkThetThis(Enrollee[] enrollee, int number) {

        ArrayList<Enrollee> withBadMarks = new ArrayList<>();


        for (int i = 0; i < enrollee.length; i++) {
            if (enrollee[i].getMarks() >= number) {
                withBadMarks.add(enrollee[i]);
            }
        }
        return withBadMarks;
    }


}
