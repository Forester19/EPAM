package main.com.company.epam.task1.abitu.model;

import java.util.Comparator;

/**
 * Created by Владислав on 24.07.2017.
 */
public class Entrolle{
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int number;
    private int marks;

    public Entrolle() {

    }

    public Entrolle(int id, String name, String surname, String patronymic, int number, int marks) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.number = number;
        this.marks = marks;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Entrolle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", number=" + number +
                ", marks=" + marks +
                '}';
    }



}
