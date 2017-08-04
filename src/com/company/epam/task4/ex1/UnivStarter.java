package com.company.epam.task4.ex1;

import com.company.epam.task4.ex1.Stock;
import com.company.epam.task4.ex1.controller.Service;

/**
 * Created by Владислав on 24.07.2017.
 */
public class UnivStarter {
    public static void main(String[] args) {
        Stock stock = new Stock();

        Service service = new Service(stock.getStudents());
        service.doJob(stock.getStudents());

    }

}
