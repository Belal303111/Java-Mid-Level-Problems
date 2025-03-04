import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0),m.group(1));
                /*
                input("this is Hello hello")
                input = input.replaceAll(m.group(0), m.group(1));  //meaning replace all the occurance of the word(m.group(0)) by the first word of them(m.group(1))
                m.group(0) → The full duplicate match (e.g., "Hello hello").
                m.group(1) → The first occurrence of the word (e.g., "Hello").
                */
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
