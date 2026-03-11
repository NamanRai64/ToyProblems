package nqueens;

public class NQueensBoard {
    private int size;
    private int[][] grid;

    public NQueensBoard(int size) {
        this.size = size;
        this.grid = new int[size][size]; // 0 = empty, 1 = Queen
    }

    public void display() {
        // 1. Print Column Headers (A, B, C...)
        System.out.print("    ");
        for (int i = 0; i < size; i++) {
            System.out.print("  " + (char)('A' + i) + " ");
        }
        System.out.println();

        // 2. Print Top Border
        System.out.print("    ┌");
        for (int j = 0; j < size; j++) {
            System.out.print("───");
            if (j < size - 1) System.out.print("┬");
        }
        System.out.println("┐");

        for (int r = 0; r < size; r++) {
            // 3. Row Number and Left Border
            System.out.print(String.format(" %2d │", (r + 1)));

            // 4. Cell Content (Queen or Empty)
            for (int c = 0; c < size; c++) {
                String symbol = (grid[r][c] == 1) ? "Q" : "·";
                System.out.print(" " + symbol + " │");
            }
            System.out.println();

            // 5. Middle Dividers
            if (r < size - 1) {
                System.out.print("    ├");
                for (int j = 0; j < size; j++) {
                    System.out.print("───");
                    if (j < size - 1) System.out.print("┼");
                }
                System.out.println("┤");
            }
        }

        // 6. Bottom Border
        System.out.print("    └");
        for (int j = 0; j < size; j++) {
            System.out.print("───");
            if (j < size - 1) System.out.print("┴");
        }
        System.out.println("┘\n");
    }

    public void placeQueen(int row, int col) {
        grid[row][col] = 1;
    }

    public void removeQueen(int row, int col) {
        grid[row][col] = 0;
    }

    public int getSize() { return size; }
    public int[][] getGrid() { return grid; }
    public int CorGrid(int i,int j) { return grid[i][j]; }

    public void instructions() {
        System.out.println("╔═══════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                  THE N-QUEENS EXPERIMENT: RULES                                   ║");
        System.out.println("╠═══════════════════════════════════════════════════════════════════════════════════════════════════╣");
        System.out.println("║                                                                                                   ║");
        System.out.println("║  Objective:                                                                                       ║");
        System.out.println("║  Place N Queens on the N x N board such that no two queens attack                                 ║");
        System.out.println("║  each other.                                                    A    B    C   D    E              ║");
        System.out.println("║                                                               ┌────┬────┬────┬────┬────┐          ║");
        System.out.println("║  Attack Rules:                                                │    │    │    │    │    │  5       ║");
        System.out.println("║  A Queen  can attack any piece located in the same:           ├────┼────┼────┼────┼────┤          ║");
        System.out.println("║  1. ROW                                                       │    │    │    │    │    │  4       ║");
        System.out.println("║  2. COLUMN                                                    ├────┼────┼────┼────┼────┤          ║");
        System.out.println("║  3. DIAGONAL (Both directions)                                │    │    │    │    │    │  3       ║");
        System.out.println("║                                                               ├────┼────┼────┼────┼────┤          ║");
        System.out.println("║  How to Play:                                                 │    │    │    │    │    │  2       ║");
        System.out.println("║  - Enter coordinates to place a queen (e.g., 'A1', 'C4').     ├────┼────┼────┼────┼────┤          ║");
        System.out.println("║  - Enter the same coordinate again to remove a queen.         │    │    │    │    │    │  1       ║");
        System.out.println("║  - The lab will block placements that violate the rules.      └────┴────┴────┴────┴────┘          ║");
        System.out.println("║                                                                                                   ║");
        System.out.println("╚═══════════════════════════════════════════════════════════════════════════════════════════════════╝");

        System.out.println("\n[SYSTEM]: Goal state is achieved when " + size + " safe queens are on the board.");
        System.out.println("================================================================================\n");
    }
}