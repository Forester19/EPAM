package main.com.company.epam.task5.ex1_3;

/**
 * Created by Владислав on 18.08.2017.
 */
public class CounterConcurrentHashMap implements Runnable{
    private MyMap myMap;


    public CounterConcurrentHashMap(MyMap myMap) {
        this.myMap = myMap;
    }

    @Override
    public void run() {

        for (int i=0; i<1000; i++){
            myMap.addToC0ncurrntHashMap(i,i);
            System.out.println("Put " + i +"   " + i);
        }
    }

}
