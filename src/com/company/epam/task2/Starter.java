package com.company.epam.task2;

import javax.xml.ws.*;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by Владислав on 26.07.2017.
 */
public class Starter {
    public static void main(String[] args) throws IOException {
        Service service = new Service();

        System.out.println(service.reserveLiteral());
    }
}
