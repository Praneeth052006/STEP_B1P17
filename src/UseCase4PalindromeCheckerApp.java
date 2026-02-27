
public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is it a palindrome?: " + isPalindrome);
    }
}