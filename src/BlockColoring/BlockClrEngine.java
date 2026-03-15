package BlockColoring;

import java.util.Scanner;

public class BlockClrEngine {

    public void startBlockGame() {

        Scanner sc = new Scanner(System.in);

        System.out.println("==== Block Coloring Game ====");

        // ask board size
        System.out.print("Enter board height (rows): ");
        int rows = sc.nextInt();

        System.out.print("Enter board width (columns): ");
        int cols = sc.nextInt();
        sc.nextLine(); // consume newline

        BlockClrBoard board = new BlockClrBoard(rows, cols);

        board.generateRegions();

        while (true) {

            board.drawBoard();

            board.showColorOptions();

            System.out.println("\nEnter region letter (or type restart / exit):");

            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting game...");
                return;
            }

            if (input.equalsIgnoreCase("restart")) {
                board.resetColors();
                System.out.println("Game restarted!");
                continue;
            }

            char region = input.toUpperCase().charAt(0);

            System.out.println("Enter color:");
            String color = sc.nextLine().toLowerCase();

            boolean ok = board.assignColor(region, color);

            if (!ok) {
                System.out.println("\nInvalid color or adjacent conflict!\n");
            } else {

                System.out.println("\nColor assigned!\n");

                if (board.isSolved()) {

                    board.drawBoard();
                    System.out.println("\nCongratulations! You solved the puzzle!\n");
                    return;
                }
            }
        }
    }
}