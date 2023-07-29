package tasks;

import repositories.DataRepository;
import utils.Printer;

import java.util.Queue;

public abstract class Task implements DataUpdater {

    private final static String INITIAL = "Initial data";
    private final static String UPDATED = "Updated data";

    public void start() {
        Queue<String> data = DataRepository.getData();
        Printer<String> printer = new Printer<>();
        printer.print(INITIAL, data);
        updateData(data);
        printer.print(UPDATED, data);
    }
}
