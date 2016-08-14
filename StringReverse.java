import chn.util.*; 
/**
 * Write a description of class StringReverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringReverse
{

    public static void main(String [] args)
    {
        ConsoleIO console  = new ConsoleIO(); 
        String str = ""; 
        String slave = ""; 
        while(!str.equals('Q')) 
        { 
            System.out.println("Enter a string"); 
            str = console.readToken(); 
            if (str.equals("Q"))
            { 
                break;
            }
            slave = reverseString(str);  
            System.out.println("Your reversed string is: " +slave);
        }
    }

    public static String reverseString(String str){
        String reverse = ""; 
        if(str.length() == 1){
            return str;
        } else {
            reverse += str.charAt(str.length()-1)
            +reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }

}
