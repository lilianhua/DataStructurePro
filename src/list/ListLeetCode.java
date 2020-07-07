package list;

import stack.ArrayStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListLeetCode {

    public static void main(String[] args) {
        int[] nums = {1,85, 3, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        int[] ints = reversePrint2(head);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    //输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = stack.pop().val;
        }
        return arr;
    }

    static List<Integer> list = new ArrayList<>();
    public static int[] reversePrint2(ListNode head) {
        reverse(head);
        int size = list.size();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = list.get(i);
        }
        return arr;
    }

    private static void reverse(ListNode head) {
        if (head == null) return;
        reverse(head.next);
        list.add(head.val);
    }

    //leetcode 203
    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }
        if (head == null) {
            return null;
        }
        ListNode pre = head;
        while (pre.next != null) {
            if (pre.next.val == val) {
                ListNode delNode = pre.next;
                pre.next = delNode.next;
                delNode.next = null;
            } else {
                pre = pre.next;
            }
        }
        return head;
    }

    //leetcode use dummy head
    public static ListNode removeElements2(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (pre.next != null) {
            if (pre.next.val == val) {
                pre.next = pre.next.next;
            } else {
                pre = pre.next;
            }
        }
        return dummyHead.next;
    }

    public static ListNode removeElements3(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode res = removeElements3(head.next, val);
        if (head.val == val) {
            return res;
        } else {
            head.next = res;
            return head;
        }
    }
}

