package com.company.epam.task3.ex1;

import javafx.geometry.Pos;

import java.util.ArrayList;

/**
 * Created by Владислав on 28.07.2017.
 */
public class Department {
    private ArrayList<Position> listOfPositions = new ArrayList<>();

    public void addPosition(String descr, String name) {
        listOfPositions.add(new Position(descr,name));
    }

    public ArrayList<Position> getAllPositions() {

        return listOfPositions;
    }

    public Position searchAllPositionsByDescr(String descr){
        for (int i=0; i< listOfPositions.size(); i++){
            if (listOfPositions.get(i).getDescription().equals(descr)){
                return listOfPositions.get(i);
            }
        }
        return null;
    }


   private class Position {
        private String description;
        private ArrayList<String> persons = new ArrayList<>();

        public Position(String description, String person) {
            this.description = description;
            persons.add(person);
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }


        public ArrayList<String> getPersons() {
            return persons;
        }

        public void setPersons(ArrayList<String> persons) {
            this.persons = persons;
        }

        @Override
        public String toString() {
            return "Position{" +
                    "description='" + description + '\'' +
                    ", persons=" + persons +
                    '}';
        }
    }
}
