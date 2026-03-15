package BlockColoring;

import java.util.*;

public class BlockClrBoard {

    private int rows;
    private int cols;
    private int[][] board;

    private Map<Integer, Set<Integer>> adjacency = new HashMap<>();
    private Map<Integer, String> colorsAssigned = new HashMap<>();

    private Random rand = new Random();

    // ANSI color codes
    private Map<String,String> ansi = new HashMap<>();

    // allowed colors
    private Set<String> validColors = new LinkedHashSet<>();

    public BlockClrBoard(int r, int c){

        rows = r;
        cols = c;

        board = new int[rows][cols];

        for(int i=0;i<rows;i++)
            Arrays.fill(board[i],-1);

        ansi.put("red","\u001B[31m");
        ansi.put("green","\u001B[32m");
        ansi.put("yellow","\u001B[33m");
        ansi.put("blue","\u001B[34m");
        ansi.put("magenta","\u001B[35m");
        ansi.put("cyan","\u001B[36m");
        ansi.put("white","\u001B[37m");

        validColors.addAll(ansi.keySet());
    }

    // REGION GENERATION 

    public void generateRegions(){

        int id = 0;

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){

                if(board[r][c] == -1){

                    growRegion(r,c,id);
                    id++;
                }
            }
        }

        buildAdjacency();
    }

    private void growRegion(int r,int c,int id){

        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{r,c});

        int limit = rand.nextInt(15)+8;
        int size = 0;

        while(!stack.isEmpty() && size < limit){

            int[] cell = stack.pop();

            int x = cell[0];
            int y = cell[1];

            if(x<0 || y<0 || x>=rows || y>=cols)
                continue;

            if(board[x][y] != -1)
                continue;

            board[x][y] = id;
            size++;

            List<int[]> neighbors = new ArrayList<>();

            neighbors.add(new int[]{x+1,y});
            neighbors.add(new int[]{x-1,y});
            neighbors.add(new int[]{x,y+1});
            neighbors.add(new int[]{x,y-1});

            Collections.shuffle(neighbors);

            for(int[] n : neighbors)
                stack.push(n);
        }
    }

    // ADJACENCY GRAPH 

    private void buildAdjacency(){

        for(int r=0;r<rows;r++){
            for(int c=0;c<cols;c++){

                int cur = board[r][c];

                adjacency.putIfAbsent(cur,new HashSet<>());

                if(r+1<rows){
                    int down = board[r+1][c];

                    if(cur != down)
                        adjacency.get(cur).add(down);
                }

                if(c+1<cols){
                    int right = board[r][c+1];

                    if(cur != right)
                        adjacency.get(cur).add(right);
                }
            }
        }
    }

    // DRAW BOARD 

    public void drawBoard(){

        for(int r=0;r<rows;r++){

            // top borders
            for(int c=0;c<cols;c++){

                if(r==0 || board[r][c]!=board[r-1][c])
                    System.out.print("____");
                else
                    System.out.print("    ");
            }

            System.out.println();

            // middle row
            for(int c=0;c<cols;c++){

                if(c==0 || board[r][c]!=board[r][c-1])
                    System.out.print("|");
                else
                    System.out.print(" ");

                int id = board[r][c];
                char name = (char)('A'+id);

                String color = colorsAssigned.get(id);

                if(color != null)
                    System.out.print(ansi.get(color) + " "+name+" " + "\u001B[0m");
                else
                    System.out.print(" "+name+" ");
            }

            System.out.println("|");
        }

        for(int c=0;c<cols;c++)
            System.out.print("____");

        System.out.println();
    }

    //SHOW COLORS 

    public void showColorOptions(){

        System.out.println("\nAll Color Options:");

        for(String c : validColors){

            System.out.println(
                    ansi.get(c) + c + "\u001B[0m"
            );
        }
    }

    // ASSIGN COLOR 

    public boolean assignColor(char region,String color){

        if(!validColors.contains(color))
            return false;

        int id = region - 'A';

        if(!adjacency.containsKey(id))
            return false;

        for(int neighbor : adjacency.get(id)){

            if(color.equals(colorsAssigned.get(neighbor)))
                return false;
        }

        colorsAssigned.put(id,color);

        return true;
    }

    public void resetColors(){

        colorsAssigned.clear();
    }

    public boolean isSolved() {

    // every region must have a color
    if(colorsAssigned.size() != adjacency.size())
        return false;

    // verify adjacency rule
    for(int region : adjacency.keySet()){

        String color = colorsAssigned.get(region);

        for(int neighbor : adjacency.get(region)){

            if(color.equals(colorsAssigned.get(neighbor)))
                return false;
        }
    }

    return true;
}
}