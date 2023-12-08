package algorithm.code.java.p01.lc141;

public class ListNode {
    public int value;
    public ListNode next;

    ListNode(int v){
        this.value = v;
        this.next = null;
    }

    ListNode(int v, ListNode n){
        this.value = v;
        this.next = n;
    }
}
