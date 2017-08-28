package com.company.epam.task5.ex1_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Владислав on 18.08.2017.
 */
public class MyMap {
    private Map<Integer,Integer> hashMap = new HashMap<>();
    private Map<Integer,Integer> cuncrHashMap = new ConcurrentHashMap<>();

    public Map<Integer, Integer> getHashMap() {
        return hashMap;
    }

    public void setHashMap(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    public Map<Integer, Integer> getCuncrHashMap() {
        return cuncrHashMap;
    }

    public void setCuncrHashMap(Map<Integer, Integer> cuncrHashMap) {
        this.cuncrHashMap = cuncrHashMap;
    }

    public void addToHashMap(Integer o1, Integer o2){
        hashMap.put(o1,o2);
    }


    public void addToC0ncurrntHashMap(Integer o1, Integer o2){
        cuncrHashMap.put(o1,o2);
    }
    


}
