package com.company.epam.task1.abitu;

import com.company.epam.task1.abitu.model.Entrolle;

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
