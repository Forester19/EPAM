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
        switch(number){
            case 1: {
                System.out.println("        1");
                break;
            }
            case 2: {
                System.out.println("        1");
                System.out.println("       121");
                break;
            }
            case 3: {
                System.out.println("        1");
                System.out.println("       121");
                System.out.println("      12321");
                break;
            }
            case 4: {
                System.out.println("        1");
                System.out.println("       121");
                System.out.println("      12321");
                System.out.println("     1234321");
                break;
            }
            case 5: {
                System.out.println("        1");
                System.out.println("       121");
                System.out.println("      12321");
                System.out.println("     1234321");
                System.out.println("    123454321");
                break;
            }
            case 6: {
                System.out.println("        1");
                System.out.println("       121");
                System.out.println("      12321");
                System.out.println("     1234321");
                System.out.println("    123454321");
                System.out.println("   12345654321");
                break;
            }
            case 7: {
                System.out.println("        1");
                System.out.println("       121");
                System.out.println("      12321");
                System.out.println("     1234321");
                System.out.println("    123454321");
                System.out.println("   12345654321");
                System.out.println("  1234567654321");
                break;
            }
            case 8: {
                System.out.println("        1");
                System.out.println("       121");
                System.out.println("      12321");
                System.out.println("     1234321");
                System.out.println("    123454321");
                System.out.println("   12345654321");
                System.out.println("  1234567654321");
                System.out.println(" 123456787654321");

                break;
            }case 9: {
                System.out.println("        1");
                System.out.println("       121");
                System.out.println("      12321");
                System.out.println("     1234321");
                System.out.println("    123454321");
                System.out.println("   12345654321");
                System.out.println("  1234567654321");
                System.out.println(" 123456787654321");
                System.out.println("12345678987654321");
                 break;
            }
        }

    }
}
