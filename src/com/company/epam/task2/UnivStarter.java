package com.company.epam.task2;

import com.company.epam.task2.controller.Service;

/**
 * Created by Владислав on 24.07.2017.
 */
public class UnivStarter {
    public static void main(String[] args) {
        Service service = new Service();
        service.doJob();
    }
}
