package com.company.epam.task1;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Владислав on 23.07.2017.
 */
public class Matrix {
    private static int mymatrix[][];
    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        mymatrix = new int[7][7];
        for (int i = 0; i < 7; i++) {                                  ///
            for (int j = 0; j < 7; j++) {                               ///
                mymatrix[i][j] = random.nextInt(20) - 9;          ///
            }                                                     //// заполение и вывод массива
        }                                                             ///

        for (int i = 0; i < mymatrix.length; i++) {                     ///
            System.out.println(Arrays.toString(mymatrix[i]));           ////
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {

            int one = mymatrix[i][0];
            int two = mymatrix[i][6];
            mymatrix[i][0] = two;
            mymatrix[i][6] = one;

            int one1 = mymatrix[i][1];
            int two1 = mymatrix[i][5];
            mymatrix[i][1] = two1;
            mymatrix[i][5] = one1;

            int one2 = mymatrix[i][2];
            int two2 = mymatrix[i][4];
            mymatrix[i][2] = two2;
            mymatrix[i][4] = one2;


            //  System.out.print(one);

        }


        for (int i = 0; i < mymatrix.length; i++) {                     ///
            System.out.println(Arrays.toString(mymatrix[i]));           ////
        }
    }
}
