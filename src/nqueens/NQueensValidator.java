package nqueens;

public class NQueensValidator {

    public boolean isSafe(NQueensBoard board, int row, int col) {
        int[][] grid = board.getGrid();
        int n = board.getSize();

        // 1. Check Row and Column
        for (int i = 0; i < n; i++) {
            if (grid[row][i] == 1 || grid[i][col] == 1) return false;
        }

        // 2. Check Diagonals
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    // Calculate absolute differences for diagonal check
                    if (Math.abs(i - row) == Math.abs(j - col)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}