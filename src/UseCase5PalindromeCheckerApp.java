import java.util.Stack;


public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {


        String input = "noon";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        boolean isPalindrome = input.equals(reversed);

        System.out.println("Input: " + input);
        System.out.println("Is it a palindrome?: " + isPalindrome);
    }
}