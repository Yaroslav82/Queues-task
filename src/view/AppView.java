package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppView {

    public int chooseOption() {
        int option = 0;
        showMenu();
        try (Scanner scanner = new Scanner(System.in)) {
            option = scanner.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Unknown command");
        }
        return option;
    }

    private void showMenu() {
        System.out.print("""
                
                ______ MENU _______
                1 - Show task 1.
                2 - Show task 2.
                0 - Close the App.
                """);
    }
}
