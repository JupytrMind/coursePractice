import java.util.*;

public class QueueExamples {

    public static boolean checkPalindrome(String str) {
        Stack<Character> s = new Stack<>();
        Queue<Character> q = new java.util.LinkedList<>();

        for (char c : str.toCharArray()) {
            s.push(c);
            q.add(c);
        }

        while (!s.isEmpty()) {
            if (!s.pop().equals(q.remove())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Queue<Integer> q1 = new java.util.LinkedList<>(), q2 = new ArrayDeque<>();

        for (int i = 0; i < 5; i++) {
            q1.add(i);
            q2.offer(i);
        }

        while (!q1.isEmpty()) {
            System.out.println(q1.poll());
            System.out.println(q2.remove());
        }
    }
}