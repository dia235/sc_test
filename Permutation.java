import java.util.*;  
public class Permutation 
{ 
    private int size; 
    private Random rand = new Random();

    public Permutation(int size)
    { 
        this.size = size; 
    } 

    public static void main(String[] args)
    { 
        Permutation perm = new Permutation(10); 
        for (int i = 0; i < 10; i++)
        { 
            System.out.println(perm.nextPermutation());  
        } 
    } 

    public ArrayList nextPermutation() { 
        ArrayList<Integer> trash = new ArrayList<Integer>(); 
        int num, pos = 0, sum = 0; 
        for (num = 0; num < size; num++) { 
            trash.add(num+1); 
        } 
        ArrayList<Integer> perm = new ArrayList<Integer>(); 
        for (num = 0; num < size; num++) { 
            pos = rand.nextInt(trash.size()); 
            perm.add(trash.get(pos)); 
            trash.remove(pos); 
            if (num == 0)
            {
                sum += pos; 
            } 
            if(num == size - 1)
            {
                sum += pos; 

            }        
        }
        System.out.println("The sum is: " +sum);
        return perm;        
    } 
} 
