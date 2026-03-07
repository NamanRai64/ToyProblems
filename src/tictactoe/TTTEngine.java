package tictactoe;

import java.util.*;

class TTTEngine {
    public static void runTwoPlayer(char[][] arr) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = arr.length;
        boolean move = false;
        while (!TTTValidator.validate(arr) && i < n * n) {
            // Player 1'X'
            System.out.println();
            System.out.println();
            System.out.println("Player 1(X):");
            move = false;
            while (!move) {
                int choice = sc.nextInt();
                int row = (choice - 1) / n;
                int col = (choice - 1) % n;
                if (choice > 0 && choice <= n * n) {

                    if (arr[row][col] == '_') {
                        arr[row][col] = 'X';
                        move = true;

                    } else {
                        System.out.println("Invalid Move");
                        move = false;
                    }
                }
            }

            print(arr);
            if (TTTValidator.validate(arr)) {
                System.out.println("Player 1 Wins!!!");
                break;
            }
            if (TTTValidator.draw(arr)) {
                System.out.println("Draw");
                return;
            }
            System.out.println();
            System.out.println();
            i++;

            // Player 2'O'
            System.out.println("Player 2(O):");
            move = false;
            while (!move) {

                int choice = sc.nextInt();
                int row = (choice - 1) / n;
                int col = (choice - 1) % n;
                if (choice > 0 && choice <= n * n) {

                    if (arr[row][col] == '_') {
                        arr[row][col] = 'O';
                        move = true;
                    } else {
                        System.out.println("Invalid Move");
                        move = false;
                    }
                }
            }
            print(arr);
            if (TTTValidator.validate(arr)) {
                System.out.println("Player 2 Wins!!!");
                break;
            }
            if (TTTValidator.draw(arr)) {
                System.out.println("Draw");
                return;
            }
            i++;
        }
        // if (!TTTValidator.validate(arr)) {
        // System.out.println("Draw");
        // }
    }

    public static void print(char[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void initTTT(char[][] arr, int n) {
        // Initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '_';
            }
        }
        print(arr);
        runTwoPlayer(arr);

    }
    public  static void main(String[] args){
        int n = 3;
        char[][] arr = new char[n][n];
        initTTT(arr, n);
    }


}
