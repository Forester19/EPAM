package main.com.company.epam.task5.ex1_2;

/**
 * Created by Владислав on 14.08.2017.
 */
public class Counter implements Runnable {


    private MyNumber myNumber;

    public Counter(MyNumber myNumber) {
        this.myNumber = myNumber;
        new Thread(this,"Counter").start();
    }

    @Override
    public void run() {
          for (int i =0 ;i<1000000; i++){
                  myNumber.put(i);


          }
    }
}
