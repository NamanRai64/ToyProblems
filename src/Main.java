import puzzle8.TileBoard;
public class Main {
    public static void main(String[] args) {
        ToyProblemWelcome.Welcome();
        TileBoard tl = new TileBoard();
        int board[][]={{1,2,3},{4,5,6},{7,-1,8}};
        tl.printBoard(board,3);
    }
}