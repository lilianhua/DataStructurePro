import array.Array;
import queue.ArrayQueue;
import queue.LoopQueue;
import stack.ArrayStack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        testLoopQueue();
    }

    private static void testLoopQueue() {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println("dequeue:" + queue);
            }
        }
    }

    private static void testQueue() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println("dequeue:" + queue);
            }
        }
    }

    private static void testStack() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 2);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }

    private static void testArray() {
        Array data = new Array();
        for (int i = 0; i < 10; i++) {
            data.add(i, i + 1);
        }
        System.out.println("new");
        System.out.println(data);

        data.addLast(100);
        data.addLast(102);
        System.out.println("add");
        System.out.println(data);

        data.removeFirst();
        data.removeFirst();
        data.removeFirst();
        System.out.println("remove");
        System.out.println(data);
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
