package com.company.epam.task4.ex4;

import java.io.File;

/**
 * Created by Владислав on 04.08.2017.
 */
public class Main {
    private static final String url = "map.txt";
    public static void main(String[] args) {
        File file = new File(url);
        Service service = new Service(file);
        service.switchMethod();
    }
}
