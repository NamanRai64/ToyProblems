package Maze;

import java.util.Scanner;

public class MazeEngine {

    int playerRow = 0;
    int playerCol = 0;

    Scanner sc = new Scanner(System.in);

    public void startGame() {

        while (true) {

            MazeGenerator.printMaze(playerRow, playerCol);

            System.out.print("Move (W A S D): ");
            char move = sc.next().toUpperCase().charAt(0);

            move(move);

            if (playerRow == MazeGenerator.rows - 1 &&
                playerCol == MazeGenerator.cols - 1) {

                MazeGenerator.printMaze(playerRow, playerCol);
                System.out.println("You escaped the maze!");
                break;
            }
        }
    }

    void move(char m) {

        MazeGenerator.Cell cell =
                MazeGenerator.maze[playerRow][playerCol];

        if (m == 'W' && !cell.up)
            playerRow--;

        else if (m == 'S' && !cell.down)
            playerRow++;

        else if (m == 'A' && !cell.left)
            playerCol--;

        else if (m == 'D' && !cell.right)
            playerCol++;
        if (m == 'W' && cell.up)
            System.out.println("You cannot move up.");

        else if (m == 'S' && cell.down)
            System.out.println("You cannot move down.");

        else if (m == 'A' && cell.left)
            System.out.println("You cannot move left.");

        else if (m == 'D' && cell.right)
            System.out.println("You cannot move right.");
    }
    
}