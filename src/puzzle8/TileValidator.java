package puzzle8;
public class TileValidator {
    public static boolean  validate(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]!=48+j+(i*board.length)) {
                    return false;
                }
            }
        }
        return true;
    }
}