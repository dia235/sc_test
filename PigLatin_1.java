import chn.util.*; 
/**
 * Write a description of class PigLatin_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigLatin_1
{
    public static void main(String[] args) {
        ConsoleIO console = new ConsoleIO();  
        String master = ""; 
        while(!master.equals("done"))
        {
            System.out.print("Enter a word (type 'done' to stop the program): ");
            master = console.readToken();
            if (master.equals("done"))
            { 
                break;
            }
            String slave = ConvertLatin(master);  
            System.out.println("In pig latin, it's: " + slave);           
        }
    }

    private static String ConvertLatin(String master)
    {
        String slave = ""; 
        int num = master.length();
        int x = 1; 
        char firstLetter = master.charAt(0);
        boolean firstIsCapital = false;
        if (Character.isUpperCase(firstLetter))
        {
            firstLetter = Character.toLowerCase(firstLetter);
            firstIsCapital = true;
        }

        if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || 
        firstLetter == 'o' || firstLetter =='u' ) 
        {  
            slave = master + "yay";
        } 
        else 
        { 
            for(x = 1; x <= num-1; x++) 
            {
                firstLetter = master.charAt(x);
                if (firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || 
                firstLetter == 'o' || firstLetter =='u' ) 
                {
                    int n = master.indexOf(firstLetter); 
                    slave = firstLetter + master.substring(n + 1, num) + master.substring(0 , n) + "ay"; 
                    break; 
                }
                else 
                {
                    slave = master + "ay";  
                } 
            }

            if (firstIsCapital == true) 
            {
                char c = slave.charAt(0); 
                slave = Character.toUpperCase(c)+ master.substring(1, num); 
            } else
            {  // first letter was lower case
                return slave; 
            }
        }
        return slave;
    } 
}

