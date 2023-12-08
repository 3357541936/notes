package algorithm.code.java.p01;

public class LC206 {
    public static void main(String[] args) {
        Util206 util206 = new Util206();

        ListNode list05 = new ListNode(5);
        ListNode list04 = new ListNode(4,list05);
        ListNode list03 = new ListNode(3,list04);
        ListNode list02 = new ListNode(2,list03);
        ListNode list01 = new ListNode(1,list02);

        ListNode listNode = util206.reverseList(list01);
    }
}

class Util206 {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;
        while (currentNode != null){
            ListNode nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        return prevNode;
    }
}

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