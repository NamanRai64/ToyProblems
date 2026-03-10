public class Menu {

    public void displayHeader() {
        System.out.println(" +------------------------------------------------------------------+");
        System.out.println(" |   __      ____   _____ _____ _____   _                 ____      |");
        System.out.println(" |  | |    / __ \\ / ____|_   _/ ____|  | |        /\\     |  _ \\     |");
        System.out.println(" |  | |   | |  | | |  __  | || |       | |       /  \\    | |_) |    |");
        System.out.println(" |  | |   | |  | | | |_ | | || |       | |      / /\\ \\   |  _ <     |");
        System.out.println(" |  | |___| |__| | |__| |_| || |____   | |____ / ____ \\  | |_) |    |");
        System.out.println(" |  |______\\____/ \\_____|_____\\_____|  |______/_/    \\_\\ |____/     |");
        System.out.println(" |                                                                  |");
        System.out.println(" |              -- INTERACTIVE ALGORITHMIC SOLVER --                |");
        System.out.println(" +------------------------------------------------------------------+");
    }

    public void displayGrid() {
        System.out.println("\n [ ACTIVE EXPERIMENTS ]");
        System.out.println("  +-----+---------------------------+------------------------+");
        System.out.println("  | ID  |      PUZZLE NAME          |      CATEGORY          |");
        System.out.println("  +-----+---------------------------+------------------------+");
        System.out.println("  |  1  |  Tower of Hanoi           |  Recursive Logic       |");
        System.out.println("  |  2  |  N-Queens Problem         |  Backtracking          |");
        System.out.println("  |  3  |  8-Puzzle Tile            |  Heuristic Search      |");
        System.out.println("  |  4  |  Missionaries & Cannibals |  State-Space Search    |");
        System.out.println("  |  5  |  Tic-Tac-Toe (vs AI)      |  Adversarial Search    |");
        System.out.println("  |  6  |  Map-Coloring Challenge   |  CSP Constraints       |");
        System.out.println("  +-----+---------------------------+------------------------+");
        System.out.println("  |  0  |  Exit Laboratory          |  Terminates Session    |");
        System.out.println("  +-----+---------------------------+------------------------+");
        System.out.print("\n [INPUT REQUESTED] Enter Experiment ID: ");
    }
}