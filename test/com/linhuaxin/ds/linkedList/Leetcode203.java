package com.linhuaxin.ds.linkedList;

public class Leetcode203 {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val) {
            ListNode delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if (head == null) {
            return null;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                ListNode delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            } else {
                prev = prev.next;
            }
        }

        return head;
    }

    public ListNode removeElements2(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }

    public ListNode removeElements3(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        head.next = removeElements3(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = new Leetcode203().removeElements(head, 6);
        System.out.println(res);

        ListNode res2 = new Leetcode203().removeElements2(head, 6);
        System.out.println(res2);

        ListNode res3 = new Leetcode203().removeElements3(head, 6);
        System.out.println(res3);
    }
}
