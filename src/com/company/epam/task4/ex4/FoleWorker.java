package com.company.epam.task4.ex4;

import java.io.*;
import java.util.Map;

/**
 * Created by Владислав on 04.08.2017.
 */
public class FoleWorker {

    public void writeMapToFile(Map<String,String> map, File file){
        Map<String,String> mymap;

        if (file !=null) {
            mymap = readMapFromFile(file);
            for (int i=0;i<map.size();i++){
                mymap.putAll(map);
            }

            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                objectOutputStream.writeObject(mymap);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                objectOutputStream.writeObject(map);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    public Map readMapFromFile(File file){
Map<String,String> map = null;
        try(ObjectInputStream objectOutputStream = new ObjectInputStream(new FileInputStream(file))){
            map = (Map<String,String>) objectOutputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return map;

    }

}
