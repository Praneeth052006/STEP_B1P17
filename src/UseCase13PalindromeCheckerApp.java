import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        System.out.println("Input: " + input);
        System.out.println("----------------------------------");

        measure("Two Pointer", () -> twoPointerCheck(input));
        measure("Stack", () -> stackCheck(input));
        measure("Deque", () -> dequeCheck(input));
        measure("Recursion", () -> recursiveCheck(input, 0, input.length() - 1));
    }

    // ================= PERFORMANCE MEASURE METHOD =================
    public static void measure(String methodName, PalindromeTest test) {

        long startTime = System.nanoTime();

        boolean result = test.run();

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(methodName + " Result: " + result);
        System.out.println(methodName + " Time: " + duration + " ns");
        System.out.println();
    }

    // Functional Interface
    interface PalindromeTest {
        boolean run();
    }

    // ================= ALGORITHM 1: TWO POINTER =================
    public static boolean twoPointerCheck(String str) {

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

    // ================= ALGORITHM 2: STACK =================
    public static boolean stackCheck(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // ================= ALGORITHM 3: DEQUE =================
    public static boolean dequeCheck(String str) {

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    // ================= ALGORITHM 4: RECURSION =================
    public static boolean recursiveCheck(String str, int start, int end) {

        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return recursiveCheck(str, start + 1, end - 1);
    }
}
