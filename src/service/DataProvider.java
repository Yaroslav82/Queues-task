package service;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DataProvider {

    public static Queue<String> getData() {
        return new LinkedList<>(List.of("apricot", "mango", "cherry", "rice"));
    }
}
