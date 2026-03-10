package cannibals;

import java.util.Scanner;

public class CannibalEngine {
    // Storing counts as integers makes the math much easier
    private int mLeft = 3, cLeft = 3;
    private int mRight = 0, cRight = 0;
    private boolean boatOnLeft = true;

    private CannibalsBoard board;
    private CannibalValidator validator;

    public void gameInit() {
        board = new CannibalsBoard();
        validator = new CannibalValidator();
        board.instructions();
    }

    public void play() {
        gameInit();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Update display arrays based on current counts
            board.printBG(mLeft, cLeft, mRight, cRight, boatOnLeft);

            if (mRight == 3 && cRight == 3) {
                System.out.println("🎉 SUCCESS: Everyone crossed safely!");
                break;
            }

            System.out.println("Enter number of Missionaries and Cannibals to move (e.g., '1 1'):");
            int mMove = scanner.nextInt();
            int cMove = scanner.nextInt();

            // Ask the Validator if this move is legal
            if (validator.isValidMove(mLeft, cLeft, mRight, cRight, mMove, cMove, boatOnLeft)) {
                executeMove(mMove, cMove);
                boatOnLeft = !boatOnLeft; // Switch sides
            } else {
                System.out.println("❌ INVALID MOVE: The cannibals would eat the missionaries or boat capacity exceeded!");
            }

            // Check for Game Over (Fail state)
            if (validator.isGameOver(mLeft, cLeft, mRight, cRight)) {
                System.out.println("💀 GAME OVER: The missionaries were outnumbered and eaten!");
                break;
            }
        }
    }

    private void executeMove(int m, int c) {
        if (boatOnLeft) {
            mLeft -= m; cLeft -= c;
            mRight += m; cRight += c;
        } else {
            mRight -= m; cRight -= c;
            mLeft += m; cLeft += c;
        }
    }
    public static void main(String[] args) {
        CannibalEngine cannibal = new CannibalEngine();
        cannibal.play();
    }
}