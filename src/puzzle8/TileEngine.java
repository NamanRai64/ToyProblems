package puzzle8;

import java.util.*;

public class TileEngine {

    private int trackHyphen;
    private int n;
    private int totalMoves=0;

    public void engine() {
        TileBoard board = new TileBoard();
        board.tileBoardInit();
        shuffleBoard(board.board);
        board.printBoard();
        this.n = board.board.length;
        trackHyphen = track(board.board);
        Scanner sc = new Scanner(System.in);

        while(!TileValidator.validate(board.board)){
            System.out.println("Your move: ");
            char move = sc.next().toLowerCase().charAt(0);
            totalMoves++;
            if (move=='w')
                trackHyphen = up(board.board,trackHyphen);
            else if(move=='a')
                trackHyphen = left(board.board,trackHyphen);
            else if (move=='d')
                trackHyphen = right(board.board,trackHyphen);
            else if (move=='s')
                trackHyphen = down(board.board,trackHyphen);
            else
                System.out.println("Invalid move! Please enter w, a, s, or d.");
            board.printBoard();
        }
        System.out.println("Congratulations! Puzzle Solved.");
        System.out.println("Total moves: "+totalMoves);
        sc.close();
    }
    private int track(char[][] board){
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]=='-'){
                    return i*board[0].length+j;
                }
            }
        }
        return -1;
    }
    public static int up(char[][] board, int pos) {
        int n = board[0].length;
        if (pos < n) { // If in the top row (0, 1, 2 for n=3)
            return pos;
        }
        performSwap(board, pos, pos - n);
        return pos - n;
    }

    public static int down(char[][] board, int pos) {
        int n = board[0].length;
        // FIX: Use >= to catch the start of the last row
        if (pos >= n * (n - 1)) {
            return pos;
        }
        performSwap(board, pos, pos + n);
        return pos + n;
    }

    public static int left(char[][] board, int pos) {
        int n = board[0].length;
        if (pos % n == 0) { // If in the first column
            return pos;
        }
        performSwap(board, pos, pos - 1);
        return pos - 1;
    }

    public static int right(char[][] board, int pos) {
        int n = board[0].length;
        if (pos % n == n - 1) { // If in the last column
            return pos;
        }
        performSwap(board, pos, pos + 1);
        return pos + 1;
    }
    public static void performSwap(char[][] board, int oldPos, int newPos) {
        int r1 = oldPos / board[0].length, c1 = oldPos % board[0].length;
        int r2 = newPos / board[0].length, c2 = newPos % board[0].length;

        char temp = board[r1][c1];
        board[r1][c1] = board[r2][c2];
        board[r2][c2] = temp;
    }

    private void shuffleBoard(char[][] board) {
        Random rand = new Random();
        // Use your existing track method to find the starting '-'
        int currentPos = track(board);

        for(int i = 0; i < 100; i++) {
            int move = rand.nextInt(4);
            switch(move) {
                case 0: currentPos = up(board, currentPos); break;
                case 1: currentPos = down(board, currentPos); break;
                case 2: currentPos = left(board, currentPos); break;
                case 3: currentPos = right(board, currentPos); break;
            }
        }
        // Update the engine's tracker so the game starts at the right spot
        this.trackHyphen = currentPos;
    }
}
