package Maze;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;



public class MazeGenerator {
    static class Cell{
        boolean visited = false;
        boolean left = true;
        boolean right = true;
        boolean up = true;
        boolean down = true;
    }

    static Cell[][] maze;
    static int rows, cols;

    static Random rand = new Random();

    static void generator(int r, int c){
        maze[r][c].visited = true;

        int[][] directions = {
            {0,1},   // move right
            {1,0},   // move down
            {0,-1},  // move left
            {-1,0}   //move up
        };

        List<int[]> dirs = Arrays.asList(directions);
        Collections.shuffle(dirs);

        for(int[] d: dirs){
            int nr = r + d[0];
            int nc = c + d[1];

            if(nr >= 0 && nr < rows && nc >= 0 && nc < cols && !maze[nr][nc].visited){
                //right
                if(d[0] == 0 && d[1] == 1){
                    maze[r][c].right = false;
                    maze[nr][nc].left = false;
                }
                //down
                else if(d[0] == 1 && d[1] == 0){
                    maze[r][c].down = false;
                    maze[nr][nc].up = false;
                }
                else if(d[0] == 0 && d[1] == -1){
                    maze[r][c].left = false;
                    maze[nr][nc].right = false;
                }
                else if(d[0] == -1 && d[1] == 0){
                    maze[r][c].up = false;
                    maze[nr][nc].down = false;
                }
                generator(nr, nc);
            }
        }
    }

    static void addLoops(int extraWallsToBreak) {

    for (int i = 0; i < extraWallsToBreak; i++) {

        int r = rand.nextInt(rows);
        int c = rand.nextInt(cols);

        int[][] directions = {
            {0,1},
            {1,0},
            {0,-1},
            {-1,0}
        };

        int[] d = directions[rand.nextInt(4)];

        int nr = r + d[0];
        int nc = c + d[1];

        if (nr >= 0 && nr < rows && nc >= 0 && nc < cols) {

            // break right wall
            if (d[0] == 0 && d[1] == 1) {
                maze[r][c].right = false;
                maze[nr][nc].left = false;
            }

            // break down wall
            else if (d[0] == 1 && d[1] == 0) {
                maze[r][c].down = false;
                maze[nr][nc].up = false;
            }

            // break left wall
            else if (d[0] == 0 && d[1] == -1) {
                maze[r][c].left = false;
                maze[nr][nc].right = false;
            }

            // break up wall
            else if (d[0] == -1 && d[1] == 0) {
                maze[r][c].up = false;
                maze[nr][nc].down = false;
            }
        }
    }
}

    static void printMaze(int playerRow, int playerCol) {

    System.out.print("┌");
    for (int c = 0; c < cols; c++) {
        System.out.print("───");
        if (c < cols - 1)
            System.out.print("┬");
    }
    System.out.println("┐");

    for (int r = 0; r < rows; r++) {

        for (int c = 0; c < cols; c++) {

            if (c == 0) {
                if (maze[r][c].left)
                    System.out.print("│");
                else
                    System.out.print(" ");
            }

            // PLAYER
            if (r == playerRow && c == playerCol)
                System.out.print(" P ");

            // EXIT
            else if (r == rows - 1 && c == cols - 1)
                System.out.print(" E ");

            else
                System.out.print("   ");

            if (maze[r][c].right)
                System.out.print("│");
            else
                System.out.print(" ");
        }

        System.out.println();

        if (r < rows - 1) {

            System.out.print("├");

            for (int c = 0; c < cols; c++) {

                if (maze[r][c].down)
                    System.out.print("───");
                else
                    System.out.print("   ");

                if (c < cols - 1)
                    System.out.print("┼");
            }

            System.out.println("┤");
        }
    }

    System.out.print("└");
    for (int c = 0; c < cols; c++) {
        System.out.print("───");
        if (c < cols - 1)
            System.out.print("┴");
    }
    System.out.println("┘");
}

    public static void runMaze() {
        rows = 10;
        cols = 15;
        maze = new Cell[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                maze[i][j] = new Cell();
            }
        }

        generator(0,0);
        addLoops((rows * cols) / 3); //Increase the number to make the maze easier 
        // printMaze();
        MazeEngine engine = new MazeEngine(); 
        engine.startGame();
    }
}
