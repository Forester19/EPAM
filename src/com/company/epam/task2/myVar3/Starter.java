package com.company.epam.task2.myVar3;

import java.io.IOException;

/**
 * Created by Владислав on 26.07.2017.
 */
public class Starter {
    public static void main(String[] args) throws IOException {
        com.company.epam.task2.myVar3.Service service = new com.company.epam.task2.myVar3.Service();

        System.out.println(service.reserveLiteral());
    }
}
