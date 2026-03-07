package tictactoe;

public class TTTBoard {
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
            board = new char[][]{{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
            instructions();
            System.out.println("\nShuffled Board:\n===========================================================================================");

        }
    private void instructions() {
        System.out.println("Instructions for Tic-Tac-Toe: ");
        System.out.println("+-----------------------------------------------------------------------------------+");
        System.out.println("|                                                                                   |");
        System.out.println("|   Welcome to Tic-Tac-Toe!                                                         |");
        System.out.println("|   =======================                               +---+---+---+             |");
        System.out.println("|   How to Play:                                          | 1 | 2 | 3 |             |");
        System.out.println("|   1. The game is played on a 3x3 grid.                  +---+---+---+             |");
        System.out.println("|   2. Players take turns placing 'X' and 'O'.            | 4 | 5 | 6 |             |");
        System.out.println("|   3. Enter a number (1-9) to claim that cell.           +---+---+---+             |");
        System.out.println("|                                                         | 7 | 8 | 9 |             |");
        System.out.println("|   Goal:                                                 +---+---+---+             |");
        System.out.println("|   Get three of your marks in a horizontal, vertical, or diagonal row to win!      |");
        System.out.println("|                                                                                   |");
        System.out.println("+-----------------------------------------------------------------------------------+");
    }
}
