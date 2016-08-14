import java.lang.*;
import chn.util.*; 
import apcslib.*;
/**
 * Class Statistics
 * 
 * 
 */
public class Statistics
{
    int total = 0;
    final static int MAX = 1000;
    static int[] file;
    public static void main(String[] args)
    {      
        Statistics stat = new Statistics();
        System.out.println("The average is: " + Format.left (stat.avg(), 10, 2));
        System.out.println("The standard deviation is : " + Format.left(stat.standardDeviation(), 10, 2));
        System.out.println("The mode is : " +(stat.mode()));
    } 

    public Statistics() 
    { 
        FileInput inFile = new FileInput("numbers.txt");
        file = new int[MAX];
        int x; 
        while(inFile.hasMoreLines()) 
        { 
            x = inFile.readInt(); 
            file[total++] = x; 
        }
    }

    public double avg()
    {
        int index; 
        double sum = 0; 
        double average = 0; 
        for(index = 0; index < total; index++)
        {
            sum = sum + file[index];
            average = sum / total; 
        }
        return average; 
    }

    public double standardDeviation()
    {
        double sd = 0;
        int i; 
        for (i=0; i <total;i++)
        {
            {
                sd += ((file[i] - avg()))*(file[i] - avg()) / 
                (total - 1);
            }
        }
        double standardDeviation = Math.sqrt(sd);
        return standardDeviation; 
    }

    public String mode()
    {
        int index2; 
        int max = 0; 
        int [] stuff; 
        stuff = new int[101]; 
        String all = ""; 
        for(index2 = 0; index2 < total; index2++)
        {
            stuff[file[index2]]++; 
            if (stuff[file[index2]] >  max )
            { 
                max = stuff[file[index2]]; 
            }
        }
        for (index2 = 0; index2 < 101; index2++)
        { 
            if(stuff[index2] == max)
            { 
                all += index2; 
                all += " , "; 
            }
        }
        return all; 
    }

}