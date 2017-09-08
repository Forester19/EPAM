package main.com.company.epam.task4.ex1.dao;

import main.com.company.epam.task4.ex1.model.Enrollee;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Владислав on 07.09.2017.
 */
public class MyFileWorkerTest {
    File file = new File("enrollee.txt");
    MyFileWorker myFileWorker = new MyFileWorker(file);
    @org.junit.Test
    public void wtiteObjectToFile() throws Exception {
            ArrayList<Enrollee> arrayList = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {

            arrayList = (ArrayList<Enrollee>) objectInputStream.readObject();
        }
        assertEquals(arrayList.size(),10);
    }

    @org.junit.Test
    public void readFromFile() throws Exception {

    }

}