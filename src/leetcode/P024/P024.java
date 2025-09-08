package leetcode.P024;

public class P024 {

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode a = prev.next;
            ListNode b = a.next;
            ListNode nxt = b.next;

            // swap a and b
            prev.next = b;
            b.next = a;
            a.next = nxt;

            // move prev two nodes forward
            prev = a;
        }
        return dummy.next;
    }

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
