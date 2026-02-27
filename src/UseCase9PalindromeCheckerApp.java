
public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";   // You can change input here

        boolean isPalindrome = checkPalindrome(input, 0, input.length() - 1);

        System.out.println("Input: " + input);
        System.out.println("Is it a palindrome?: " + isPalindrome);
    }

    // Recursive method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call (move inward)
        return checkPalindrome(str, start + 1, end - 1);
    }
}