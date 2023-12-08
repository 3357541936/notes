package algorithm.code.java.p01.lc641_important;

public class ListNode {
    int value;
    ListNode next;
    ListNode prev;

    ListNode() {
    }

    ListNode(int val) {
        this.value = val;
    }

    ListNode(int val, ListNode next) {
        this.value = val;
        this.next = next;
    }
    ListNode(int val, ListNode next, ListNode prev){
        this.value = val;
        this.next = next;
        this.prev = prev;
    }
}

