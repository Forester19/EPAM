package com.company.epam.task1.abitu;

import com.company.epam.task1.abitu.model.Entrolle;

import java.util.Random;

/**
 * Created by Владислав on 24.07.2017.
 */
public class Stock {
    private Entrolle[] students = new Entrolle[10];
    private Random random = new Random();

    public Stock() {
        insertStudents();
    }

    private void insertStudents(){
        students[0] = new Entrolle(1, "AAA", "ASD", "CCC", 123, random.nextInt(6));
        students[1] = new Entrolle(2, "XXX", "DFG", "CCC", 123, random.nextInt(6));
        students[2] = new Entrolle(3, "WWW", "GHJ", "CCC", 123, random.nextInt(6));
        students[3] = new Entrolle(4, "TTT", "HJK", "CCC", 123, random.nextInt(6));
        students[4] = new Entrolle(5, "HHH", "RTY", "CCC", 123, random.nextInt(6));
        students[5] = new Entrolle(6, "FFF", "DFG", "CCC", 123, random.nextInt(6));
        students[6] = new Entrolle(7, "cCC", "FGH", "CCC", 123, random.nextInt(6));
        students[7] = new Entrolle(8, "MMM", "ASF", "CCC", 123, random.nextInt(6));
        students[8] = new Entrolle(9, "ZZZ", "MNB", "CCC", 123, random.nextInt(6));
        students[9] = new Entrolle(10, "PPP", "HGB", "CCC", 123, random.nextInt(6));
    }

    public Entrolle[] getStudents() {
        return students;
    }
}
