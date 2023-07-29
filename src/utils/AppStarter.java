package utils;

import tasks.Task01;
import tasks.Task02;
import view.AppView;

public class AppStarter {

    public static void startApp() {
        AppView view = new AppView();
        switch (view.chooseOption()) {
            case 1 -> new Task01().start();
            case 2 -> new Task02().start();
            default -> System.out.println("Goodbye :)");
        }
    }
}