import puzzle8.TileEngine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToyProbWelcome.Welcome();
        Menu menu = new Menu();
        boolean running = true;

        while (running) {
            menu.displayHeader();
            menu.displayGrid();

            String input = scanner.nextLine();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("\n >> ERROR: Unknown Command. Use Numeric ID.");
                continue;
            }

            System.out.println("\n [SYSTEM]: Initializing Experiment " + choice + "...");

            switch (choice) {
                case 1 -> System.out.println("Loading Tower of Hanoi...");
                case 2 -> System.out.println("Loading N-Queens...");
                case 0 -> {
                    System.out.println("Laboratory offline. Goodbye.");
                    running = false;
                }
                default -> System.out.println(" >> ERROR: Experiment ID Not Found.");
            }

            if (running) {
                System.out.println("\nPress Enter to return to main terminal...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}