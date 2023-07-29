package tasks;

import java.util.Queue;

public class Task_02 extends Task {

    @Override
    public void updateData(Queue<String> data) {
        data.poll();
    }
}
