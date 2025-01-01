import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         ArrayList<ArrayList<Integer>> h=new ArrayList<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
        ArrayList<Integer> z=new ArrayList<>();
            int d=s.nextInt();
            for(int j=0;j<d;j++)
            {
                int m=s.nextInt();
                z.add(m);
            }
            h.add(z);
        }
        int q=s.nextInt();
        int [][] A=new int[q][2];
        for(int i=0;i<q;i++)
        {
            int x=s.nextInt();
            A[i][0]=x;
            int y=s.nextInt();
            A[i][1]=y;
        }
        for(int i=0;i<q;i++)
        {
            int x=A[i][0]-1;
            int y=A[i][1]-1;
            
     if(x>=0 && x<h.size() && y>=0&& y<h.get(x).size())
            System.out.println(h.get(x).get(y));
            else
              System.out.println("ERROR!");
            
        }
       
    }
}