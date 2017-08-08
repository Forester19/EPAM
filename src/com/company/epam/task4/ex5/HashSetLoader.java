package com.company.epam.task4.ex5;

import java.util.*;

/**
 * Created by Владислав on 08.08.2017.
 */
public class HashSetLoader {
    private Set<Point> setNY = new HashSet<>();

    public HashSetLoader() {
        addPoints();
    }

    private void addPoints(){
        setNY.add(new Point(1,1));
        setNY.add(new Point(2,1));
        setNY.add(new Point(1,2));
        setNY.add(new Point(3,1));
        setNY.add(new Point(4,1));
    }

    public void doIt(){
        Point[] points = setNY.toArray(new Point[setNY.size()]);
        ArrayList<Double> firstPoint = new ArrayList<>();
        ArrayList<Double> secondPoint = new ArrayList<>();
        ArrayList<Double> thirtPoint = new ArrayList<>();
        ArrayList<Double> fourPoint = new ArrayList<>();
        ArrayList<Double> fivePoint = new ArrayList<>();
        for (int i=0; i<points.length; i++){
            double res1 = Math.sqrt(Math.pow(points[0].getX()-points[i].getX(),2) + Math.pow(points[0].getY() - points[i].getY(),2));
            double res2 = Math.sqrt(Math.pow(points[1].getX()-points[i].getX(),2) + Math.pow(points[1].getY() - points[i].getY(),2));
            double res3 = Math.sqrt(Math.pow(points[2].getX()-points[i].getX(),2) + Math.pow(points[2].getY() - points[i].getY(),2));
            double res4 = Math.sqrt(Math.pow(points[3].getX()-points[i].getX(),2) + Math.pow(points[3].getY() - points[i].getY(),2));
            double res5 = Math.sqrt(Math.pow(points[4].getX()-points[i].getX(),2) + Math.pow(points[4].getY() - points[i].getY(),2));

            firstPoint.add(res1);
            secondPoint.add(res2);
            thirtPoint.add(res3);
            fourPoint.add(res4);
            fivePoint.add(res5);
        }
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        for (int i=0; i<firstPoint.size(); i++) {
            sum1 += firstPoint.get(i);
            sum2 += secondPoint.get(i);
            sum3 += thirtPoint.get(i);
            sum4 += fourPoint.get(i);
            sum5 += fivePoint.get(i);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(sum1);
        arrayList.add(sum2);
        arrayList.add(sum3);
        arrayList.add(sum4);
        arrayList.add(sum5);


        System.out.println(arrayList);
    }
}
