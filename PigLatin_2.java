import chn.util.*; 
/**
 * Write a description of class PigLatin_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PigLatin_2
{
    public static void main(String[] args){
        ConsoleIO console = new ConsoleIO();  
        String master = ""; 
        while(!master.equals("done"))
        {
            System.out.print("Enter a word: ");
            master = console.readToken();
            if (master.equals("done"))
            { 
                break;
            }
            String slave = pigLatin(master);  
            System.out.println("In pig latin, it's: " + slave);           
        }
    }

    public static String pigLatin(String master){
        String slave = "";
        int length = master.length(), aLoc, eLoc, iLoc, oLoc, uLoc, minValue = 0;
        aLoc = master.indexOf("a"); 
        minValue = aLoc; 
        eLoc = master.indexOf("e"); 
        iLoc = master.indexOf("i");
        oLoc = master.indexOf("o");
        uLoc = master.indexOf("u"); 
        if(minValue > -1)
        {
            if (eLoc < minValue && eLoc > -1) 
                eLoc = minValue; 
            else if (iLoc < minValue && iLoc > -1) 
                iLoc = minValue;
            else if (oLoc < minValue && oLoc > -1) 
                oLoc = minValue; 
            else if (uLoc < minValue && uLoc > -1) 
                uLoc = minValue;

            if(minValue == 0)
            {
                slave = master +"yay";
            }

            else {
                if (minValue <= length)
                {
                    slave = master.charAt(minValue)+ master.substring(minValue + 1, length) + master.substring(0 , minValue+1) + "ay"; 
                }
                else
                { 
                    slave = master + "ay";
                } 
            }
        }
        return slave;
    }
}

