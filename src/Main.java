import array.Array;
import list.LinkList;
import queue.ArrayQueue;
import queue.LinklistQueue;
import queue.LoopQueue;
import queue.Queue;
import stack.ArrayStack;
import stack.LinklistStack;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        testQueueTime();
    }

    private static void testLinkList() {
        LinkList<Integer> linkList = new LinkList<>();
        for (int i = 0; i < 5; i++) {
            linkList.addFirst(i);
            System.out.println(linkList);
        }
        linkList.add(2, 777);
        System.out.println(linkList);

        linkList.remove(2);
        System.out.println(linkList);

        linkList.removeFirst();
        System.out.println(linkList);

        linkList.removeLast();
        System.out.println(linkList);
    }

    /**
     * test arrayQueue and loopQueue use time
     */
    private static void testQueueTime() {
        int optCount = 1000000;
//        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
//        double time1 = queueTime(arrayQueue, optCount);
//        System.out.println("arrayQueue time:" + time1);

        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = queueTime(loopQueue, optCount);
        System.out.println("loopQueue time:" + time2);

        LinklistQueue<Integer> linklistQueue = new LinklistQueue<>();
        double time3 = queueTime(linklistQueue, optCount);
        System.out.println("linklistQueue time:" + time3);
    }

    private static double arrayListTime(ArrayDeque<Integer> deque, int optCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < optCount; i++) {
            deque.addLast(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < optCount; i++) {
            deque.removeFirst();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    private static double queueTime(Queue<Integer> q, int optCount) {
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < optCount; i++) {
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < optCount; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }

    private static void testLinklistQueue() {
        LinklistQueue<Integer> queue = new LinklistQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);
            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println("dequeue:" + queue);
            }
        }
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

    private static void testLinklistStack() {
        LinklistStack<Integer> stack = new LinklistStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
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

    /**
     * leetcode 20
     *
     * @param s
     * @return
     */
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
