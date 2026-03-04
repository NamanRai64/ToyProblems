package tictactoe;

public class TTTValidator {
    public static boolean validate(String[][] arr){
        
            int n = arr.length;
            //Row
            for(int i = 0; i < n; i++){
                boolean v = true;
                for(int j = 0; j < n; j++){
                     if(!(arr[i][j].equals(arr[i][0]))){
                        v = false;
                         break;
                     }
                    
                }
                if(v){
                    return true;
                }
            }

            //Column
            for(int i = 0; i < n; i++){
                boolean v = true;
                for(int j = 0; j < n; j++){
                     if(!arr[j][i].equals(arr[0][i])){
                     v = false;
                          break;
                     }
                    
                }
                if(v){
                    return true;
                }
            }
            
            //Main Diagonal
            boolean v = true;
            for(int i = 0; i < n; i++){
                if(!(arr[i][i].equals(arr[0][0]))){
                    v = false;
                    break;
                }
            }
            if(v){
                return true;
            }

            //Anti Diagonal
            v = true;              
            for(int i = 0; i < n; i++){
                if(!(arr[i][n-1-i].equals(arr[0][n-1]))){
                    v = false;
                    break;
                }
            
            }
            if(v){
                return true;
            }
            else
                return false;
    }
    
}