package com.company.epam.task4.ex1.dao;

import com.company.epam.task4.ex1.model.Enrollee;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 02.08.2017.
 */
public class MyFileWorker {
    private File file;

    public MyFileWorker(File file) {
        this.file = file;
    }

    public void wtiteObjectToFile(Enrollee[] enrollee) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            ArrayList<Enrollee> arrayList = new ArrayList<>();
            for (Enrollee enrollee1 : enrollee) {
                arrayList.add(enrollee1);
            }
            objectOutputStream.writeObject(arrayList);
        }
    }

    public ArrayList<Enrollee> readFromFile() throws IOException, ClassNotFoundException {
        ArrayList<Enrollee> arrayList;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            arrayList = (ArrayList<Enrollee>) objectInputStream.readObject();
        }

        return arrayList;

    }


}
