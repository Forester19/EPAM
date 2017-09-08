package main.com.company.epam.task4.ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by Владислав on 04.08.2017.
 */
public class ListAndSetGenerator {

    private int minValue;
    private int maxValue;

    private FileWorker fileWorker = new FileWorker();

    private ArrayList<Integer> arrayList = new ArrayList<>();
    private Set<Integer> set = new HashSet<>();

    public ListAndSetGenerator() {
        fileWorker.readFromConsole();
    }

    public void generateCollections(){
        Random random = new Random(System.currentTimeMillis());
  minValue = fileWorker.getMIN_VALUE();
  maxValue = fileWorker.getMAX_VALUE();

        for (int i=0; i<fileWorker.getLengthList(); i++){
            arrayList.add(minValue + random.nextInt(maxValue - minValue) +1 );
            set.add(minValue + random.nextInt(maxValue - minValue) + 1 );
        }

    }

    public void showCollections(){
        System.out.println(arrayList.toString());
        System.out.println();
        System.out.println(set.toString());
    }

}
