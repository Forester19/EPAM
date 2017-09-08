package main.com.company.epam.task5.ex1_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Владислав on 25.08.2017.
 */
public class MyThread extends RecursiveAction {


    private String keyWord = "build";
    private File file;


    public MyThread(File file) {
        this.file = file;
    }

    @Override
    public void compute() {
        if (file.isDirectory()) {
            ForkJoinTask.invokeAll(directoryExecutor());

        } else {
            if (detectThisFIle(file)) {
                try {
                    writeToNewFike(file.getName(), keyWord);
                    System.out.println("wrote");
                } catch (IOException e) {
                    System.out.println("Cant write to file " + e.getMessage());
                }
            }else{
                System.out.println("No searched File!!!");
            }

        }

    }

    private List<MyThread> directoryExecutor(){
        ArrayList<MyThread> list = new ArrayList<>();
          File[] files = file.listFiles();
          for (File file: files){
              list.add(new MyThread(file));
          }

        return list;
    }

    public void writeToNewFike(String nameOfFile, String kkeyWord) throws IOException {
        File file1 = new File("info.txt");

        FileWriter writer = new FileWriter(file1,true);

        writer.write(nameOfFile + " " + kkeyWord);
        writer.append("\n");
        writer.flush();

            }

    private boolean detectThisFIle(File file) {
        Pattern pattern = Pattern.compile("^.*" + keyWord + ".*$");
        Matcher matcher = pattern.matcher(file.getName());
        if (matcher.matches()) {
            return true;
        } else return false;
    }

}
