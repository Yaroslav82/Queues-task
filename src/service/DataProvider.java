package service;

import java.util.LinkedList;
import java.util.Queue;

public class DataProvider {

    public static Queue<String> getData() {
        Queue<String> data = new LinkedList<>();
        data.add("apricot");
        data.add("mango");
        data.add("cherry");
        data.add("rice");
        return data;
    }
}
