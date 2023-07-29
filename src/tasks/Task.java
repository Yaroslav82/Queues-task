package tasks;

import repositories.DataRepository;
import utils.Printer;

import java.util.Queue;

public abstract class Task implements DataUpdater {

    public void start() {
        Queue<String> data = DataRepository.getData();
        Printer<String> printer = new Printer<>();
        printer.print("Initial data", data);
        updateData(data);
        printer.print("Updated data", data);
    }
}
