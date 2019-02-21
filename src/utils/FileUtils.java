package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public List<Integer> getFromFile(String fileName) {
        List<Integer> list = new ArrayList<>();
        try(Scanner scan = new Scanner(new File(fileName))){
            while(scan.hasNextLine()){
                list.add(scan.nextInt());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
