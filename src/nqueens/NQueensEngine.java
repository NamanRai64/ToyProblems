package nqueens;

import java.util.Scanner;

public class NQueensEngine {
    private NQueensBoard board;
    private NQueensValidator validator;
    private Scanner scan;

    public void gameInit() {
        board = new NQueensBoard(5); // Standard 8x8, or use 5
        validator = new NQueensValidator();
        scan = new Scanner(System.in);
        board.instructions();
    }

    public void play() {
        gameInit();
        int queensPlaced = 0;

        while (queensPlaced < board.getSize()) {
            board.display();
            System.out.println("Queens Placed: " + queensPlaced + "/" + board.getSize());
            System.out.print("Enter move (e.g., A1) or 'EXIT': ");

            String input = scan.nextLine().toUpperCase();
            if (input.equals("EXIT")) break;

            // Validate input format (Letter + Number)
            if (input.length() < 2 || !Character.isLetter(input.charAt(0))) {
                System.out.println(" >> [!] INVALID FORMAT. Use A1, B4, etc.");
                continue;
            }

            // Convert A1 to 0,0
            int col = input.charAt(0) - 'A';
            int row;
            try {
                row = Integer.parseInt(input.substring(1)) - 1;
            } catch (NumberFormatException e) {
                System.out.println(" >> [!] INVALID ROW NUMBER.");
                continue;
            }

            // Boundary Check
            if (row < 0 || row >= board.getSize() || col < 0 || col >= board.getSize()) {
                System.out.println(" >> [!] OUT OF BOUNDS.");
                continue;
            }

            // TOGGLE LOGIC: Remove if exists, Place if empty
            if (board.getGrid()[row][col] == 1) {
                board.removeQueen(row, col);
                queensPlaced--;
                System.out.println(" >> Queen removed from " + input);
            } else {
                // Check if safe before placing
                if (validator.isSafe(board, row, col)) {
                    board.placeQueen(row, col);
                    queensPlaced++;
                    System.out.println(" >> Queen placed at " + input);
                } else {
                    System.out.println(" >> [!] SECURITY ALERT: Placement at " + input + " is under attack!");

                }
            }
        }

        if (queensPlaced == board.getSize()) {
            board.display();
            System.out.println("🎉 EXPERIMENT COMPLETE: All Queens are safe!");
        }
    }

    public static void main(String[] args) {
        NQueensEngine engine = new NQueensEngine();
        engine.play();
    }
}