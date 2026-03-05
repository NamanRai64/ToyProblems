package puzzle8;
import java.util.*;

public class TileEngine {
    public void engine() {
        TileBoard board = new TileBoard();
        board.tileBoardInit();

        Scanner sc = new Scanner(System.in);
        
        while(!TileValidator.validate(board.board)){
            System.out.println("Your move: ");
            char move = sc.next().charAt(0);
            
            if (move=='w')
                up(board.board);
            else if(move=='a')
                left(board.board);
            else if (move=='d')
                right(board.board);
            else if (move=='s')
                down(board.board);
            else
                System.out.println("Invalid move! Please enter w, a, s, or d.");
        }
        sc.close();
    }
    
    private static void up(char[][] board) {
        // TODO: implement
    }
    
    private static void left(char[][] board) {
        // TODO: implement
    }
    
    private static void right(char[][] board) {
        // TODO: implement
    }
    
    private static void down(char[][] board) {
        // TODO: implement
    }
}