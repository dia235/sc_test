import apcslib.*; 
import java.lang.*; 
/**
 * Write a description of class Rolling here.
 * 
 * @Vasundhara Sengupta
 * @10/26/15
 */
public class Rolling
{
    public static void main (String [] args) 
    {
        int numOfRolls = 0; //count is zero
        int x;
        int y;
        int z;
        do {
            numOfRolls++;
            x = ((int)(Math.random() * 6 +1)); //the dice 
            y = ((int)(Math.random() * 6 +1));
            z = ((int)(Math.random() * 6 +1));
            System.out.println(x + " " +y + " " + z); 
        } while (x == y || y == z || x == z);
        System.out.println(numOfRolls); //prints the number of rolls
    }
}
