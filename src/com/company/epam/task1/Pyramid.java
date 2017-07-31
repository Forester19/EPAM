package com.company.epam.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 23.07.2017.
 */
public class Pyramid {
    private static int number =0;
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            number = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < number + 1; i++) {
            int j;
            for (int k = 1; k <= number-i; k++)
            {
                sb.append(" ");
            }
            for (j = 1; j < i; j++){
                sb.append(j);
            }
            sb.append(i);
            for (j--; j > 0; j--){
                sb.append(j);
            }

            sb.append("\n");
        }
        System.out.println(sb.toString());


}}
