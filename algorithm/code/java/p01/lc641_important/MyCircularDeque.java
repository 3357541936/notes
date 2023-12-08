package algorithm.code.java.p01.lc641_important;

public class MyCircularDeque {
    private ListNode node = new ListNode();

    public MyCircularDeque(int k) {
        ListNode curr = this.node;
        ListNode next = null;
        ListNode prev = null;
        for (int i = 0; i < k; i++) {
            next = new ListNode();

            curr.next = next;
            curr.prev = prev;

            prev = curr;
            curr = curr.next;
        }
        this.node = this.node.next;

        curr.next = this.node;
        this.node.prev = curr;
    }

    public boolean insertFront(int value) {
        return false;
    }

    public boolean insertLast(int value) {
        return false;
    }

    public boolean deleteFront() {
        return false;
    }

    public boolean deleteLast() {
        return false;
    }

    public int getFront() {

        return 0;

    }

    public int getRear() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean isFull() {
        return false;
    }
}
