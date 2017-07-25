package com.company.epam.task2;

import com.company.epam.task2.model.Entrolle;

import java.util.Comparator;

/**
 * Created by Владислав on 24.07.2017.
 */
public class MyComparator implements Comparator<Entrolle> {

    @Override
    public int compare(Entrolle o1, Entrolle o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
