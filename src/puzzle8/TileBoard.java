package puzzle8;
import java.util.Random;
public class TileBoard {
    char[][] board;
    int n=3;
    public void printBoard() {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("+---");
            }
            System.out.println("+");
            for (int j = 0; j < n; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+---+---+---+");
    }
    public void tileBoardInit() {
        board = new char[][]{{'1','2','3'},{'4','5','6'},{'7','8','-'}};
        instructions();
        shuffleBoard();
        System.out.println("\nShuffled Board:\n===========================================================================================");
        printBoard();
    }
    private void shuffleBoard() {
        int rows = board.length;
        int cols = board[0].length;
        int size = rows * cols;
        Random rand = new Random();

        for (int i=size-1; i>0; i--) {
            int j = rand.nextInt(i + 1);

            char temp = board[i / cols][i % cols];
            board[i / cols][i % cols] = board[j / cols][j % cols];
            board[j / cols][j % cols] = temp;
        }
    }
    public void instructions() {
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