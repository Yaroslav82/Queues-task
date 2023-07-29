package repositories;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DataRepository {

    public static Queue<String> getData() {
        return new LinkedList<>(List.of("apricot", "mango", "cherry", "rice"));
    }
}
