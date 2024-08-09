import java.util.Scanner;

/**
 * This program processes an input string ending with a period (".").
 * It identifies words that end with "al" and counts how many words 
 * have more than four characters. It then displays the results.
 */

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int index = 0;
        int countMoreThanFour = 0;

        System.out.println("Please enter a string ending with \".\"");
        inputString = scanner.nextLine();

        while (index < inputString.length() && inputString.charAt(index) != '.') {
            String newString = "";
            int charCount = 0;
            String alString = "";

            // Skip spaces
            while (index < inputString.length() && inputString.charAt(index) == ' ') {
                index++;
            }

            // Build word
            while (index < inputString.length() && inputString.charAt(index) != ' ' && inputString.charAt(index) != '.') {
                newString += inputString.charAt(index);
                charCount++;
                index++;
            }

            // Check if the word ends with "al"
            if (charCount > 1 && newString.charAt(charCount - 1) == 'l' &&
                    (newString.charAt(charCount - 2) == 'A' || newString.charAt(charCount - 2) == 'a')) {
                alString += newString;
                System.out.println("Word ending in \"al\": " + alString);
            }

            // Count words with more than 4 characters
            if (charCount > 4) {
                countMoreThanFour++;
            }
        }

        System.out.println("The number of words with more than four characters is: " + countMoreThanFour);
        scanner.close();
    }
}
