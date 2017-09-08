package main.com.company.epam.task5.ex1_3;

/**
 * Created by Владислав on 18.08.2017.
 */
public class CounterHashMap implements Runnable {

    private MyMap myMap;


    public CounterHashMap(MyMap myMap) {
        this.myMap = myMap;
      }

    @Override
    public void run() {

        for (int i=0; i<1000; i++){
            myMap.addToHashMap(i,i);
            System.out.println("Put " + i +"   " + i);
        }
    }
}
