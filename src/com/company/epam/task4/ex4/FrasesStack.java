package com.company.epam.task4.ex4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Владислав on 08.08.2017.
 */
public class FrasesStack {

    private Map<String,String> map = new HashMap<>();

    public FrasesStack() {
        map.put("привет","hello");
        map.put("как","how");
        map.put("ты","you");
        map.put("работа","job");
        map.put("зарабатываешь","gets money");
        map.put("денег","money");
        map.put("сколько","how much");
    }

    public Map<String, String> getMap() {
        return map;
    }
}
