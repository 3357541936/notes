package algorithm.code.java.p01.lc141;

public class Test {
    public static void main(String[] args) {
        Code code = new Code();
        ListNode node01 = new ListNode(-4);
        ListNode node02 = new ListNode(0, node01);
        ListNode node03 = new ListNode(2, node02);
        ListNode node04 = new ListNode(3, node03);
//        node01.next = node03;

        System.out.println(code.hasCycle(node04));
    }
}
