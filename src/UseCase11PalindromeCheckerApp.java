import java.util.Stack;


public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "racecar";

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input: " + input);
        System.out.println("Is it a palindrome?: " + result);
    }
}

/**
 * Service class that encapsulates palindrome logic
 */
class PalindromeChecker {

    // Public method (Encapsulation)
    public boolean checkPalindrome(String input) {

        if (input == null || input.length() <= 1) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}