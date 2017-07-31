package com.company.epam.task3.ex1;

import java.util.ArrayList;

/**
 * Created by Владислав on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {

        Department department = new Department();

        department.addPosition("admin","Vova");
        department.addPosition("admin","Lena");
        department.addPosition("admin","Oka");
        department.addPosition("admin","juja");
        department.addPosition("developer","SSSSS");



        System.out.println(department.getAllPositions().toString());


        System.out.println(department.searchAllPositionsByDescr("developer"));
    }
}
