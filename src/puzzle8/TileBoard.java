package puzzle8;
public class TileBoard {
    public void printBoard(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.print("+---");
            }
                System.out.println("+");
            for (int j = 0; j < n; j++) {
                if(board[i][j] == -1) {
                    System.out.print("| - ");
                } else {
                System.out.print("| " + board[i][j] + " ");
                }
            }
                System.out.println("|"); 
        }
        System.out.println("+---+---+---+");
    }
}