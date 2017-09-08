package main.com.company.epam.task4.ex2REFL.ex2_2;

/**
 * Created by Владислав on 04.08.2017.
 */
public class MyClazz {
    private int a =1;
    public int b= 2;
    protected int c = 3;
    int d =4;

    public MyClazz(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public MyClazz() {
    }

    public MyClazz(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
