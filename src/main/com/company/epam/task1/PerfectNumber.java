package main.com.company.epam.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 22.07.2017.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int number = 0;
        int result = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

       for (int i=1; i < number; i++){
            if (number %i ==0){
                System.out.println(i);
                result += i;
            }
       }
        System.out.println(result);



    }
}
