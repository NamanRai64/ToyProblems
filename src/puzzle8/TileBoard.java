package puzzle8;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class TileBoard {
    char[][] board;
    int n=3;
    public void printBoard() {

        System.out.println("  8 - PUZZLE");
        System.out.println();

        // Top border
        System.out.print("╔");
        for (int j = 0; j < n; j++) {
            System.out.print("════");
            if (j < n - 1) System.out.print("╦");
        }
        System.out.println("╗");

        for (int i = 0; i < n; i++) {

            // Tile row
            for (int j = 0; j < n; j++) {

                if (j == 0) System.out.print("║");

                char val = board[i][j];

                if (val == '-')
                    System.out.printf(" %-2s ", "-");
                else
                    System.out.printf(" %-2s ", val);

                System.out.print("║");
            }

            System.out.println();

            // Middle border
            if (i < n - 1) {
                System.out.print("╠");
                for (int j = 0; j < n; j++) {
                    System.out.print("════");
                    if (j < n - 1) System.out.print("╬");
                }
                System.out.println("╣");
            }
        }

        // Bottom border
        System.out.print("╚");
        for (int j = 0; j < n; j++) {
            System.out.print("════");
            if (j < n - 1) System.out.print("╩");
        }
        System.out.println("╝");
    }
    public void tileBoardInit() {
        board = new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','-'}};
        instructionsPuzzle8();
        System.out.println("\nShuffled Board:\n===========================================================================================");

    }

    private void instructionsPuzzle8() {
        System.out.println("Instructinons for puzzle8: ");
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.println("|                                                                                   |");
        System.out.println("|   Welcome to the 8-Tile Puzzle!                                                   |");
        System.out.println("|   ==============================                       +---+---+---+              |");
        System.out.println("|   How to Play:                                         | 1 | 2 | 3 |              |");
        System.out.println("|   Use the following commands to move the tiles:        +---+---+---+              |");
        System.out.println("|   w - Move Up                                          | 4 | 5 | 6 |              |");
        System.out.println("|   s - Move Down                                        +---+---+---+              |");
        System.out.println("|   a - Move Left                                        | 7 | 8 | - |              |");
        System.out.println("|   d - Move Right                                       +---+---+---+              |");
        System.out.println("|   Goal: Arrange the tiles in order from 1 to 8 with the empty space at the end.   |");
        System.out.println("|                                                                                   |");
        System.out.println("+-----------------------------------------------------------------------------------+");
    }
}