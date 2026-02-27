
public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        // Step 1: Normalize string
        // Convert to lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Apply two-pointer palindrome logic
        boolean isPalindrome = checkPalindrome(normalized);

        System.out.println("Original Input: " + input);
        System.out.println("Normalized Input: " + normalized);
        System.out.println("Is it a palindrome?: " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}