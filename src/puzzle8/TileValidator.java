package puzzle8;

public class TileValidator {
    public static boolean validate(char[][] board) {

        char expected = '1';

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == board.length - 1 && j == board[i].length - 1) {
                    return board[i][j] == '-';
                }
                if (board[i][j] != expected) {
                    return false;
                }
                expected++;
            }
        }
        return true;
    }
}