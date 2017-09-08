package main.com.company.epam.task3.ex3.abitunewversion.stock;

import main.com.company.epam.task3.ex3.abitunewversion.model.Abiturient;

import java.util.Random;

/**
 * Created by Владислав on 31.07.2017.
 */
public class Stock {
    private Abiturient[] students = new Abiturient[10];
    private Random random = new Random();

    public Stock() {
        insertStudents();
    }

    private void insertStudents(){
        students[0] = new Abiturient(1, "AAA", "ASD", "CCC", 123, random.nextInt(6));
        students[1] = new Abiturient(2, "XXX", "DFG", "CCC", 123, random.nextInt(6));
        students[2] = new Abiturient(3, "WWW", "GHJ", "CCC", 123, random.nextInt(6));
        students[3] = new Abiturient(4, "TTT", "HJK", "CCC", 123, random.nextInt(6));
        students[4] = new Abiturient(5, "HHH", "RTY", "CCC", 123, random.nextInt(6));
        students[5] = new Abiturient(6, "FFF", "DFG", "CCC", 123, random.nextInt(6));
        students[6] = new Abiturient(7, "cCC", "FGH", "CCC", 123, random.nextInt(6));
        students[7] = new Abiturient(8, "MMM", "ASF", "CCC", 123, random.nextInt(6));
        students[8] = new Abiturient(9, "ZZZ", "MNB", "CCC", 123, random.nextInt(6));
        students[9] = new Abiturient(10, "PPP", "HGB", "CCC", 123, random.nextInt(6));
    }

    public Abiturient[] getStudents() {
        return students;
    }

}
