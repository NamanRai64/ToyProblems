package nqueens;

public class NQueensBoard {
    private int size;
    private int[][] grid;

    public NQueensBoard(int size) {
        this.size = size;
        this.grid = new int[size][size]; // 0 = empty, 1 = Queen
    }

    public void display() {
        // Print Column Headers
        System.out.print("    ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + (char)('A' + i) + "  ");
        }
        System.out.println("\n   +" + "---+".repeat(size));

        for (int r = 0; r < size; r++) {
            // Print Row Number
            System.out.print(" " + (r + 1) + " |");

            for (int c = 0; c < size; c++) {
                String symbol = (grid[r][c] == 1) ? " ♛ " : " . ";
                System.out.print(symbol + "|");
            }
            System.out.println("\n   +" + "---+".repeat(size));
        }
    }

    public void placeQueen(int row, int col) {
        grid[row][col] = 1;
    }

    public void removeQueen(int row, int col) {
        grid[row][col] = 0;
    }

    public int getSize() { return size; }
    public int[][] getGrid() { return grid; }
}