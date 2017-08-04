package com.company.epam.task4.ex2REFL.ex2_2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Владислав on 04.08.2017.
 */
public class Main {
    public static void main(String[] args) {


doReflection();

    }

    private static void doReflection(){

        try {
            Class clzz = Class.forName("com.company.epam.task4.ex2REFL.ex2_2.MyClazz");

           MyClazz myClazz = (MyClazz) clzz.getConstructor(int.class,int.class,int.class,int.class).newInstance(10,20,30,40);

            Field[] fields = clzz.getDeclaredFields();
            for (Field f1 :fields){
                f1.setAccessible(true);
                System.out.println(f1 + "     " + f1.get(myClazz));
            }

            System.out.println();
            System.out.println();
            System.out.println();

            Class[] cl =new Class[]{int.class};
            Method method = clzz.getMethod("setA",cl);
            method.invoke(myClazz,3);

            Field[] fields1 = clzz.getDeclaredFields();
            for (Field f1 :fields1){
                f1.setAccessible(true);
                System.out.println(f1 + "     " + f1.get(myClazz));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
