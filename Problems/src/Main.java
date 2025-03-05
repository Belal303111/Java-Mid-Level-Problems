import java.util.LinkedList;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static int GCD(int a,int b){ 
        int temp;
        while (b!=0)
        {
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int LCM(int a,int b)
    {
        return (a*b)/GCD(a,b);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>=0)
        {
            int a=s.nextInt();
            int b=s.nextInt();
           // int m;
            System.out.println(LCM(a,b));

            t--;
        }
    }
}
