package cannibals;

public class CannibalEngine {
    char[] initialShore = new char[4];
    char[] finalShore = new char[4];
    char[] boat = new char[2];
    public CannibalsBoard gameInit(){
        CannibalsBoard board=new CannibalsBoard();
        board.instructions();

        initialShore[0]='0';
        initialShore[1]='M';
        initialShore[2]='0';
        initialShore[3]='C';
        finalShore[0]='0';
        finalShore[1]='M';
        finalShore[2]='0';
        finalShore[3]='C';
        boat[0]=' ';
        boat[1]=' ';

        return board;
    }
    public void Engine(){
        CannibalsBoard board = gameInit();


    }
}
