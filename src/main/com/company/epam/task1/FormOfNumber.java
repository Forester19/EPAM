package main.com.company.epam.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 22.07.2017.
 */
public class FormOfNumber {
         private static int number;

    public static void main(String[] args) {
        try {
            formater();
        } catch (IOException e) {
            System.out.println("Error " +  e);
        }
    }

    public static void formater() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        number = Integer.parseInt(reader.readLine());

        System.out.println(binar(number));
        System.out.println(octal(number));
        System.out.println(hex(number));
        System.out.println(Integer.toHexString(number));


    }
    private static String binar(int a){
        StringBuilder stringBuilder = new StringBuilder();
        int b;
        while (a !=0){
            b = a%2;
            stringBuilder.append(b);
            a = a/2;

        }
        return String.valueOf(stringBuilder.reverse());
    }

    private static String octal(int a){
        StringBuilder stringBuilder = new StringBuilder();
        int b;
        if (a <= 8) stringBuilder.append(a);
        else {
            while (a !=0){
                b = a%8;
                stringBuilder.append(b);
                a = a/8;
            }
        }
        return String.valueOf(stringBuilder.reverse());
    }
    private static String hex(int number){
        StringBuilder stringBuilder = new StringBuilder();
        String text = "0123456789abcdef";
        int res;

        while (number >0){
        res = number%16;
        stringBuilder.append(text.charAt(res));
        number = number/16;
        }

        return String.valueOf(stringBuilder.reverse());
    }

}
