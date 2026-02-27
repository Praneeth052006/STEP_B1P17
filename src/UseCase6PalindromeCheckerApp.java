import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/**
 * UC6: Queue + Stack Based Palindrome Check
 */
public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input: " + input);
        System.out.println("Is it a palindrome?: " + isPalindrome);
    }
}