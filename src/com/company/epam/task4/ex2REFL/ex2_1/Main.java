package com.company.epam.task4.ex2REFL.ex2_1;

import java.lang.reflect.Field;

/**
 * Created by Владислав on 04.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        doReflect();


    }

    private static void doReflect() {
        try {
            Class clazz = Class.forName("com.company.epam.task4.ex2REFL.ex2_1.OtherClass");
            OtherClass otherClass = null;
            try {
                otherClass = (OtherClass) clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            Field field = clazz.getDeclaredField("myString");
            field.setAccessible(true);

            String s = (String) field.get(otherClass);
            System.out.println(s.toString());

            field.set(otherClass, "Test");

            String s1 = (String) field.get(otherClass);
            System.out.println(s1.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
