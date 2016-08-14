import java.util.*;
public class test{

    public static void main(String []args)
    {
        Random generator = new Random();
        int roll;
        int array1[] = new int [10];
        int permu[] = new int [10];

        for(int x =0; x<array1.length;x++)
        {
            array1[x] = x+1;
            permu[x] = -1;

        }
        
        for(int x = 0; x<=10; x++)
        {
            roll = generator.nextInt(9) + 1;
            if(array1[roll]>0)
            {

                permu[x] = array1[roll];
                array1[roll] = -1;
                System.out.println(permu[x]);
            }
        }

    }
}