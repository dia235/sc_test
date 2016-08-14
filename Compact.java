import java.lang.*; 
import chn.util.*; 
import apcslib.*; 
/**
 * Write a description of class Compact here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Compact
{
    public static int file[] = new int[100];
    public static int count; 
    public static void main (String [] args) 
    { 
        FileInput inFile = new FileInput("compact.txt");
        while(inFile.hasMoreTokens()) 
        { 
            file[count] = inFile.readInt(); 
            count++; 
        }
        int i; 
        for(i = 0; i < removeZero(file); i++)
        {
            System.out.print(" " + file[i]);
        }
    }

    public static int removeZero(int[] file) 
    { 
        int i, j = 0;  
        int nonZero = 0; 
        for(i = 0; i < count - 1; i++) 
        { 
            if (file[i] == 0 )
            {  
                count--;
                for (j = i; j < (count - 1); j++)
                {
                    file[j] = file [j + 1];
                }
                i--; 
            }
            else {
                nonZero ++; 
            }
        }
        return nonZero; 
    }
}
