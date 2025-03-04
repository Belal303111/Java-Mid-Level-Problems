import java.util.Scanner;
import java.util.regex.*;
public class PatternSyntaxChecker {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int testCases =s.nextInt();
        s.nextLine();
        while (testCases > 0) {
            //Write your code
            System.out.println("Enter the pattern");
            String pattern = s.nextLine();
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e)
            {
                System.out.println("InValid");
            }
            testCases--;
        }
        s.close();
    }
}