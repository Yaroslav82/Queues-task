package tasks;

import java.util.Queue;

public class Task01 extends Task {

    private final static String NEW_ELEMENT = "kiwi";

    @Override
    public void updateData(Queue<String> data) {
        data.add(NEW_ELEMENT);
    }
}
