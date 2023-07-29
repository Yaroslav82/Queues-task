package tasks;

import java.util.Queue;

public class Task01 extends Task {

    @Override
    public void updateData(Queue<String> data) {
        data.add("kiwi");
    }
}
