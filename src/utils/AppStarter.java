package utils;

import tasks.Task_01;
import tasks.Task_02;
import view.AppView;

public class AppStarter {

    public static void startApp() {
        AppView view = new AppView();
        switch (view.chooseOption()) {
            case 1 -> new Task_01().start();
            case 2 -> new Task_02().start();
            default -> System.out.println("Goodbye :)");
        }
    }
}