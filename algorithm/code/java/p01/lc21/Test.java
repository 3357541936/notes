package algorithm.code.java.p01.lc21;

public class Test {
    public static void main(String[] args) {
        ListNode list01 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list02 = new ListNode(1, new ListNode(3, new ListNode(4)));
        Code code = new Code();
        code.mergeTwoLists(list01,list02);
    }
}
