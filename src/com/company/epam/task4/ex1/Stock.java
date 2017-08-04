package com.company.epam.task4.ex1;

import com.company.epam.task4.ex1.model.Enrollee;

import java.util.Random;

/**
 * Created by Владислав on 24.07.2017.
 */
public class Stock {
    private Enrollee[] students = new Enrollee[10];
    private Random random = new Random();

    public Stock() {
        insertStudents();
    }

    private void insertStudents(){
        students[0] = new Enrollee(1, "AAA", "ASD", "CCC", 123, random.nextInt(6));
        students[1] = new Enrollee(2, "XXX", "DFG", "CCC", 123, random.nextInt(6));
        students[2] = new Enrollee(3, "WWW", "GHJ", "CCC", 123, random.nextInt(6));
        students[3] = new Enrollee(4, "TTT", "HJK", "CCC", 123, random.nextInt(6));
        students[4] = new Enrollee(5, "HHH", "RTY", "CCC", 123, random.nextInt(6));
        students[5] = new Enrollee(6, "FFF", "DFG", "CCC", 123, random.nextInt(6));
        students[6] = new Enrollee(7, "cCC", "FGH", "CCC", 123, random.nextInt(6));
        students[7] = new Enrollee(8, "MMM", "ASF", "CCC", 123, random.nextInt(6));
        students[8] = new Enrollee(9, "ZZZ", "MNB", "CCC", 123, random.nextInt(6));
        students[9] = new Enrollee(10, "PPP", "HGB", "CCC", 123, random.nextInt(6));
    }

    public Enrollee[] getStudents() {
        return students;
    }
}
