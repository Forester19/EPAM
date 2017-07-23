package com.company.epam.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Владислав on 22.07.2017.
 */
public class FormOfNumber {
         private static int number;
         private static int numberEightDimensional;
         private static int numberSexadecimal;

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

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toOctalString(number));
        System.out.println(Integer.toHexString(number));


    }
}
