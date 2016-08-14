import java.lang.*; 
import chn.util.*; 
import apcslib.*; 
/**
 * Write a description of class Palindrome here.
 * 
 * @Vasundhara Sengupta
 * @10/12/15
 */
public class Palindrome
{
    public static void main(String[] args) 
    {
        ConsoleIO console = new ConsoleIO(); 
        String palin, bob, stripped; 
        boolean answer;       
        do 
        {
            System.out.println("Enter a string: "); 
            palin = console.readLine(); 
            stripped = Converter (palin);
            answer = Palindrome (stripped);
            if (palin.equals("done")) 
            { 
                break; 
            } 
            if (answer == true) 
                System.out.print("Yes, the string is indeed a palindrome. ");
            else if (answer == false)
                System.out.print("No, the string is not a palindrome. ");
            System.out.println(); 
        }while (!palin.equals("done"));
    } 

    public static String Converter (String palin) 
    { 
        String stripped = palin.toLowerCase(); 
        String awesome = ""; 
        int num = stripped.length(),z; 
        char first;

        for (z = 0; z <= num -1; z++)
        { 
            first = stripped.charAt(z);
            if ((first >= 'a' && first <= 'z') || (first >= '0' && first <= '9'))
            { 
                awesome += first;   
            } 
        } return awesome;
    }

    public static boolean Palindrome (String awesome)
    {
        int num = awesome.length(), y = num - 1, x; 
        char ch1, ch; 
        boolean boo = false;
        if (num > 1)
        {
            for (x = 0; x <= y; x++) 
            { 
                ch1 = awesome.charAt(x);
                ch = awesome.charAt(y);
                if ((ch1 >= 'a' && ch1 <= 'z') || (ch1 >= '0' && ch1 <= '9'))
                { 
                    if (ch1 == ch)
                        boo = true;   
                    else
                        boo = false; 
                    break; 
                }        
            }
        } 
        else 
        { 
            boo = false;
        }

        return boo;
    } 
}