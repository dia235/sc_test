import apcslib.*; 
/**
 * Write a description of class Fibonacci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public static void main(String [] args)
     {
        System.out.println();
        System.out.print(fib(0) + ",");
        System.out.print(fib(3) + ",");
        System.out.print(fib(11));
        System.out.println();
        System.out.print(nonRecFib(1)+ ",");
        System.out.print(nonRecFib(5)+ ",");
        System.out.print(nonRecFib(14));
        System.out.println();
        System.out.print(mult(0,4)+ ",");
        System.out.print(mult(3,1)+ ",");
        System.out.print(mult(7,8)+ ",");
        System.out.print(mult(5,0));
    } 
        
    public static int fib(int n)
    { 
        if (n >= 2)
            return n = fib(n-1) + fib(n-2);
        else
            return n; 
    }

    public static int nonRecFib(int n)
    { 
        int num, a = 0, b = 0, c;
        for (num = 2; num <= n; num++) 
        { 
            c = a + b; 
            a = b;
            b = c; 
        } 
        return b; 
    }

    public static int mult(int a, int b)
    { 
        if(b == 0) 
        {
            return 0;
        }
        else 
        return a + mult(a,  b - 1);
    }
}
