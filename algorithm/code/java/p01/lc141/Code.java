package algorithm.code.java.p01.lc141;

public class Code {
    public boolean hasCycle(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (slowPointer != null) {
            if (fastPointer == null || fastPointer.next == null) {
                return false;
            }
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
    }
}
