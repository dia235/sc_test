import chn.util.*;
import java.lang.*;
import apcslib.*;  
public class Squeeze1
{
    public Squeeze1 (FileInput in, FileOutput out)
    {
        String line;
        int num; 
        char thing; 
        String slave = ""; 
        while (in.hasMoreLines())
        {
            line = in.readLine();
            for (num = 0; line.charAt(num) == ' '; num++)
            { 
                slave = line.substring(num, line.length()); 
            }           
            out.println(num + " " + slave);
        }
        out.close();
    }

    public static void main (String[] args)
    {
        FileInput in = new FileInput("After.java");
        FileOutput out = new FileOutput("Squeeze.txt");
        Squeeze1 caps = new Squeeze1(in, out);
    }
}