package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {

    private final static String UNKNOWN_MESSAGE = "Unknown command";
    private final static String MENU = """
                
                ______ MENU _______
                1 - Show task 1.
                2 - Show task 2.
                0 - Close the App.
                """;

    public int chooseOption() {
        int option = 0;
        showMenu();
        try (Scanner scanner = new Scanner(System.in)) {
            option = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println(UNKNOWN_MESSAGE);
        }
        return option;
    }

    private void showMenu() {
        System.out.print(MENU);
    }
}
