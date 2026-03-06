package tictactoe;

public class TTTValidator {
    public static boolean validate(char[][] arr){

        int n = arr.length;

        // Row
        for(int i = 0; i < n; i++){
            boolean v = true;
            for(int j = 0; j < n; j++){
                if(arr[i][j] != arr[i][0]){
                    v = false;
                    break;
                }
            }
            if(v && arr[i][0] != '_'){
                return true;
            }
        }

        // Column
        for(int i = 0; i < n; i++){
            boolean v = true;
            for(int j = 0; j < n; j++){
                if(arr[j][i] != arr[0][i]){
                    v = false;
                    break;
                }
            }
            if(v && arr[0][i] != '_'){
                return true;
            }
        }

        // Main Diagonal
        boolean v = true;
        for(int i = 0; i < n; i++){
            if(arr[i][i] != arr[0][0]){
                v = false;
                break;
            }
        }
        if(v && arr[0][0] != '_'){
            return true;
        }

        // Anti Diagonal
        v = true;
        for(int i = 0; i < n; i++){
            if(arr[i][n-1-i] != arr[0][n-1]){
                v = false;
                break;
            }
        }
        if(v && arr[0][n-1] != '_'){
            return true;
        }

        return false;
    }

    public static boolean draw(char[][] arr){

        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] == '_'){
                    return false;
                }
            }
        }

        if(!validate(arr)){
            return true;
        }

        return false;
    }
}