package tasks;

import java.util.Queue;

public class Task02 extends Task {

    @Override
    public void updateData(Queue<String> data) {
        data.poll();
    }
}
