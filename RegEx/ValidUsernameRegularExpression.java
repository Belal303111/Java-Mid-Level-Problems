import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
static String regularExpression="^[a-zA-Z][a-zA-Z\\d_]{7,29}$";
}
/*
Julia			Invalid --> Username length < 8 characters
Samantha		Valid
Samantha_21		Valid
1Samantha		Invalid	--> Username begins with non-alphabetic character
Samantha?10_2A		Invalid	--> character not allowed
JuliaZ007		Valid
Julia@007		Invalid --> character not allowed
_Julia007		Invalid --> Username begins with non-alphabetic character
*/

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}