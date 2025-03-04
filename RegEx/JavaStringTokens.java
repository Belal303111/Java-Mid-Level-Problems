import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        // Write your code here.
        if(s.isEmpty())
         System.out.println(0);
         else
       {
        String [] a = s.split("[^A-Za-z]+"); //this code will divide the string to words when the char doesn't belong to alphabet
        //split is a function to divide the string at the regex that pass to it  
       System.out.println(a.length);
       for(String word : a)

       System.out.println(word);
       }
        scan.close();
    }
}

