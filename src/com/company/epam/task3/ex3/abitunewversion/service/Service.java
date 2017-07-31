package com.company.epam.task3.ex3.abitunewversion.service;

import com.company.epam.task3.ex2.ConsoleWorker;
import com.company.epam.task3.ex3.abitunewversion.model.Abiturient;
import com.company.epam.task3.ex3.abitunewversion.model.Person;

import java.nio.Buffer;
import java.util.*;

/**
 * Created by Владислав on 31.07.2017.
 */
public class Service<T extends Person> {

    com.company.epam.task3.ex3.abitunewversion.view.ConsoleWorker consoleWorker = new com.company.epam.task3.ex3.abitunewversion.view.ConsoleWorker();

    public void doJob(T[] array) {
        int number = consoleWorker.consoleWorker();


        switch (number) {
            case 1: {
                System.out.println(showAbitsWithBadMarks(array).toString() + "\n");
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
                System.out.println(showAbitsWitsBetterMarkThetThis(array, newNumber).toString() + " \n");
                break;
            }
            case 3: {
                for (Abiturient abiturient: showSortedAbitBySurname(array)){
                    System.out.println(abiturient.toString());
                }

            }
        }

    }

    private ArrayList<Abiturient> showAbitsWithBadMarks(T[] abiturients) {
        Abiturient[] newArray = new Abiturient[10];

        ArrayList<Abiturient> withBadMarks = new ArrayList<>();

        for (int i = 0; i < abiturients.length; i++) {
            newArray[i] = (Abiturient) abiturients[i];
        }

        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i].getMarks() == 2) {
                withBadMarks.add(newArray[i]);
            }
        }
        return withBadMarks;

    }

    private ArrayList<Abiturient> showAbitsWitsBetterMarkThetThis(T[] abiturients, int number) {
        Abiturient[] newArray = new Abiturient[10];

        ArrayList<Abiturient> withBadMarks = new ArrayList<>();

        for (int i = 0; i < abiturients.length; i++) {
            newArray[i] = (Abiturient) abiturients[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i].getMarks() >= number) {
                withBadMarks.add(newArray[i]);
            }
        }
        return withBadMarks;
    }

    private ArrayList<Abiturient> showSortedAbitBySurname(T[] abiturients) {
        Abiturient[] newArray = new Abiturient[10];

        ArrayList<Abiturient> withBadMarks = new ArrayList<>();

        for (int i = 0; i < abiturients.length; i++) {
            newArray[i] = (Abiturient) abiturients[i];
        }
        ArrayList<Abiturient> list = new ArrayList<>();
        for (Abiturient abiturient : newArray) {
            list.add(abiturient);
        }
        Collections.sort(list, new Comparator<Abiturient>() {
            @Override
            public int compare(Abiturient o1, Abiturient o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
return list;
    }


}
