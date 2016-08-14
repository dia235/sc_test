import java.lang.*; 
import java.util.*; 
import apcslib.*; 
import chn.util.*; 
public class Life{

    private static String[][] grid;
    private static String[][] grid2;

    public static void getFile(FileInput infile){
        grid = new String[20][20];
        blankGrid();
        int n = infile.readInt();
        for(int i = 0; i<n; i++){
            int x= infile.readInt();
            int y= infile.readInt();
            grid[x-1][y-1] = "*";
        }

        printGrid();
        infile.close();
    }

    public static void blankGrid(){
        for(int i = 0; i<20; i++)
            for(int j = 0; j<20; j++)
                grid[i][j]=" ";
    }

    public static boolean inBounds(int x, int y) {
        boolean xx = false;
        boolean yy = false;

        if (x > 0 && x < 19) {
            xx = true;
        }
        if (y > 0 && y < 19) {
            yy = true;
        }

        if (xx && yy) {
            return true;
        }

        return false;
    }

    public static int countNeighbors(int x, int y){
        int count = 0;
        if((inBounds(x,y))&&grid[x-1][y].equals("*"))
            count++;
        if((inBounds(x,y))&&grid[x][y-1].equals("*"))
            count++;
        if((inBounds(x,y))&&grid[x-1][y-1].equals("*"))
            count++;
        if((inBounds(x,y))&&grid[x-1][y+1].equals("*"))
            count++;
        if((inBounds(x,y))&&grid[x+1][y-1].equals("*"))
            count++;
        if((inBounds(x,y))&&grid[x+1][y+1].equals("*"))
            count++;
        return count;
    }

    public static boolean lives(int x, int y){
        if(countNeighbors(x,y)<2 || countNeighbors(x,y)>4)
            return false;
        if(countNeighbors(x,y)==2 &&countNeighbors(x,y)==3)
            return true;	
        return false;
    }

    public static void nextGeneration() {
        grid2 = new String[20][20];

        // copy of blankGrid()
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                grid2[i][j] = " ";
            }
        }

        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 20; y++) {
                if (lives(x, y) && inBounds(x, y)) {
                    grid2[x][y] = "*";
                }
            }
        }
        grid = grid2;
    }


    public static void printGrid(){
        for(int row = 0; row<20; row++){
            for(int col = 0; col<20; col++){
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        FileInput infile = new FileInput("life100.txt");
        getFile(infile);
        for(int i = 1; i<5; i++){
            nextGeneration();
        }
        printGrid();
    }
} 