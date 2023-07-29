package tasks;

import java.util.Queue;

public class Task_01 extends Task {

    @Override
    public void updateData(Queue<String> data) {
        data.add("kiwi");
    }
}
