package LinkedList;

import Helper.ListNode;

public class ReverseLinkedList {
    public ListNode solution() {
        return reverseList(input());
    }

    private ListNode input() {
        return new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

}
