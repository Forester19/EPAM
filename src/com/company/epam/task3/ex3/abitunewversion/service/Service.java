package com.company.epam.task3.ex3.abitunewversion.service;

import com.company.epam.task3.ex2.ConsoleWorker;
import com.company.epam.task3.ex3.abitunewversion.model.Abiturient;
import com.company.epam.task3.ex3.abitunewversion.model.Person;

import java.util.ArrayList;

/**
 * Created by Владислав on 31.07.2017.
 */
public class Service<T extends Person> {

    com.company.epam.task3.ex3.abitunewversion.view.ConsoleWorker consoleWorker = new com.company.epam.task3.ex3.abitunewversion.view.ConsoleWorker();

    public void doJob(T [] array){
        int number = consoleWorker.consoleWorker();


        switch (number){
            case 1:{
                //showAbitsWithBadMarks();
            }
        }

    }

    private ArrayList<Abiturient> showAbitsWithBadMarks(Abiturient[] abiturients){
        ArrayList<Abiturient> newArray = new ArrayList<>();
        for (Abiturient abiturient:abiturients){
            if (abiturient.getMarks() == 2){
                newArray.add(abiturient);
            }
        }
        return newArray;

    }


}
