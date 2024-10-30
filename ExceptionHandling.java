import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        System.out.println(n/m);
        }
        catch(InputMismatchException e)
        {
            System.out.print("java.util.InputMismatchException");
            
        }
        catch(ArithmeticException e)
        {
        System.out.print("java.lang.ArithmeticException: / by zero");
    }
    
    }
}