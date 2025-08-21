class ListNode {
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

public class P21_enhanced {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        ListNode a = l1, b = l2;
        while (a != null && b != null) {
            if (a.val <= b.val) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }
        // attach the remainder
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }

    // Helpers for quick testing
    public static ListNode fromArray(int[] arr) {
        ListNode dummy = new ListNode(-1), t = dummy;
        for (int x : arr) {
            t.next = new ListNode(x);
            t = t.next;
        }
        return dummy.next;
    }

    public static String toString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        for (ListNode cur = head; cur != null; cur = cur.next) {
            if (sb.length() > 0)
                sb.append(" -> ");
            sb.append(cur.val);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ListNode l1 = fromArray(new int[] { 1, 2, 4 });
        ListNode l2 = fromArray(new int[] { 1, 3, 4 });
        ListNode merged = mergeTwoLists(l1, l2);
        System.out.println(toString(merged)); // 1 -> 1 -> 2 -> 3 -> 4 -> 4

        System.out.println(toString(mergeTwoLists(fromArray(new int[] {}), fromArray(new int[] {})))); // empty
        System.out.println(toString(mergeTwoLists(fromArray(new int[] {}), fromArray(new int[] { 0 })))); // 0
    }
}
