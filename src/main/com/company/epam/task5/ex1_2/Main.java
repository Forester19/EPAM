package main.com.company.epam.task5.ex1_2;

/**
 * Created by Владислав on 14.08.2017.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {


        MyNumber myNumber = new MyNumber();

      new Counter(myNumber);
      new Printer(myNumber);



    }

}
